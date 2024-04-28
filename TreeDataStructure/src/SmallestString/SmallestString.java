package SmallestString;

import BST.Node;

import java.util.List;

public class SmallestString {

    private List<Integer> smallestString;

    {
        smallestString.add(26);
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
        int longer, longest;

        if(testString.size() < smallestString.size()) {
            longer = testString.size();
            longest = smallestString.size();
        }else{
            longer = smallestString.size();
            longest = testString.size();
        }


    }
}
