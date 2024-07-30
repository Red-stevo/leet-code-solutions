package Kruskal;


public class NodeProps {

    public NodeProps(Character nodeData){
        this.parent = "-1";
        this.rank = 0;
    }
    private Character nodeData;

    private String parent;

    private int rank;

    @Override
    public String toString() {
        return "NodeProps{" +
                "nodeData=" + nodeData +
                ", parent='" + parent + '\'' +
                ", rank=" + rank +
                '}';
    }
}
