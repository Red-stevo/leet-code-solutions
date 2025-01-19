package org.example.Accessories;

import java.util.Arrays;
import java.util.List;
public class PriorityQueue {
    List<CharacterData> frequencies;

    public PriorityQueue(List<CharacterData> frequencies) {
        this.frequencies = frequencies;
        subSort(frequencies);
        System.out.println(Arrays.toString(frequencies.toArray()));
    }

    private void subSort(List<CharacterData> frequencies) {
        int i = frequencies.size()-1;
        int parent = (i-1)/2;

        while (parent >= 0){
            if (frequencies.get(parent).getCharacterCount() > frequencies.get(i).getCharacterCount()){
                CharacterData temp = frequencies.get(i);
                frequencies.set(i, frequencies.get(parent));
                frequencies.set(parent, temp);

                int j = i;
                while (j * 2 <= frequencies.size()-1){
                    int leftChild = j*2;
                    int rightChild = j*2+1;

                    if (rightChild <= frequencies.size()-1){
                        if (frequencies.get(j).getCharacterCount() <= frequencies.get(leftChild).getCharacterCount() &&
                                frequencies.get(j).getCharacterCount() <= frequencies.get(rightChild).getCharacterCount())
                            break;

                        if (frequencies.get(leftChild).getCharacterCount() <= frequencies.get(rightChild).getCharacterCount()){
                            temp = frequencies.get(j);
                            frequencies.set(j, frequencies.get(leftChild));
                            frequencies.set(leftChild, temp);
                            j = leftChild;
                        }else {
                            temp = frequencies.get(j);
                            frequencies.set(j, frequencies.get(rightChild));
                            frequencies.set(rightChild, temp);
                            j = rightChild;
                        }
                    }else {
                        if (frequencies.get(j).getCharacterCount() <= frequencies.get(leftChild).getCharacterCount()) break;
                        temp = frequencies.get(j);
                        frequencies.set(j, frequencies.get(leftChild));
                        frequencies.set(leftChild, temp);
                        j = leftChild;
                    }
                }
            }else
                --i;
            parent = (i-1)/2;
        }
    }

    public boolean hasNext(){
        return !frequencies.isEmpty();
    }

    public CharacterData peak(){
        if (hasNext()) return frequencies.remove(0);
        return null;
    }

    public void putNode(CharacterData characterData){
        frequencies.add(characterData);
        subSort(frequencies);
    }
}
