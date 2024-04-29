package SmallestString;

import BST.Node;

import java.util.List;

public class SmallestString {

    private List<Integer> smallestString;


    public SmallestString() {
        this.smallestString.add(26);
    }


    public void solution(Node node, List<Integer> testString){


        if(node != null){
            testString.add(node.getData());

            if(node.getLeft() == null && node.getRight() == null){

            }

            solution(node.getLeft(), testString);
            solution(node.getRight(), testString);
        }

    }

    private void compare(List<Integer> testString){


        if(testString.size() < smallestString.size()) {
           compareHelper(testString, smallestString);
        }else{
            compareHelper(smallestString, testString);
        }


    }

    private List<Integer> compareHelper(List<Integer> smallest, List<Integer> largest) {
        int longest = largest.size(), longer = smallest.size();

        while (longer >= 0){

            if(smallest.get(longest) > largest.get(longer))
                return largest;
            else if (smallest.get(longest) < largest.get(longer))
                return smallest;

            --longest;
            --longer;
        }
        return smallest;
    }

}
