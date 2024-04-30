package SmallestString;

import BST.Node;

import java.util.List;

public class SmallestString {

    private List<Integer> smallestString;


    public SmallestString() {
        this.smallestString.add(26);
    }

    public List<Integer> getSmallestString() {
        return smallestString;
    }

    public void setSmallestString(List<Integer> smallestString) {
        this.smallestString = smallestString;
    }

    /*Recursive method to get the string(integer representing characters)
    * from the tree given the root.*/
    public void solution(Node node, List<Integer> testString){

        if(node != null){
            testString.add(node.getData());

            if(node.getLeft() == null && node.getRight() == null){
                compare(testString);
            }
            solution(node.getLeft(), testString);
            solution(node.getRight(), testString);
        }
    }

    /*Method to update the existing smallest String after comparison.*/
    private void compare(List<Integer> testString){

        if(testString.size() < smallestString.size()) {
           this.smallestString = compareHelper(testString, smallestString);
        }else{
            this.smallestString = compareHelper(smallestString, testString);
        }
        testString.remove(testString.size()-1);
    }

    /*This method will loop through the two string the smallest one and the one added
    * during the tree traversal if it is smaller the one generated is replaced
    * with the generated one.*/
    private List<Integer> compareHelper(List<Integer> smallest, List<Integer> largest) {
        int longest = largest.size(), longer = smallest.size();

        while (longer >= 0){

            if(smallest.get(longest) > largest.get(longer))
                return largest;
            else if (smallest.get(longest) < largest.get(longer))
                return smallest;

            --longest;
            longer--;
        }
        return smallest;
    }

}
