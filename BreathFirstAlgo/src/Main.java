import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

       // Vertex<Integer> root = createGraph();
        Vertex<Character> root = newGraph();
        breathFirstTraversal(root);
    }


    //tree data structure.
    private static Vertex<Character> newGraph(){

        Vertex<Character> nodeA = new Vertex<>('A');
        Vertex<Character> nodeB = new Vertex<>('B');
        Vertex<Character> nodeC = new Vertex<>('C');
        Vertex<Character> nodeD = new Vertex<>('D');
        Vertex<Character> nodeE = new Vertex<>('E');
        Vertex<Character> nodeF = new Vertex<>('F');
        Vertex<Character> nodeG = new Vertex<>('G');
        Vertex<Character> nodeH = new Vertex<>('I');
        Vertex<Character> nodeI = new Vertex<>('I');

        nodeA.setNeighbours(List.of(nodeB, nodeC));
        nodeB.setNeighbours(List.of(nodeD, nodeE));
        nodeC.setNeighbours(List.of(nodeF, nodeG, nodeI));
        nodeF.setNeighbours(List.of(nodeH, nodeI));

        return nodeA;
    }

    private static Vertex<Integer> createGraph(){

        //create the nodes and set initial data.
        Vertex<Integer> node1 = new Vertex<>(0);
        Vertex<Integer> node2 = new Vertex<>(1);
        Vertex<Integer> node3 = new Vertex<>(5);
        Vertex<Integer> node4 = new Vertex<>(3);
        Vertex<Integer> node5 = new Vertex<>(4);
        Vertex<Integer> node6 = new Vertex<>(2);
        Vertex<Integer> node7 = new Vertex<>(6);


        //create the graph from the nodes.
         node1.setNeighbours(List.of(node7, node2));
         node2.setNeighbours(List.of(node3, node4, node5));
         node5.setNeighbours(List.of(node6, node7));
         node7.setNeighbours(List.of(node1));

        return node1;
    }

    private static <T> void breathFirstTraversal(Vertex<T> root){
        Queue<Vertex<T>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Vertex<T> current = queue.poll();

           if(!current.getVisited()){
               current.setVisited(true);

               List<T> values = current.getNeighbours().stream()
                               .map(Vertex::getData).toList();
               System.out.println(  "Vertex{ neighbours= " + values
                       + ", isVisited= " + current.getVisited().toString()
                       + ", data= " + current.getData().toString() + "}");
               queue.addAll(current.getNeighbours());
           }
        }
    }
}