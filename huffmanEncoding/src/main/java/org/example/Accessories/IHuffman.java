package org.example.Accessories;

import java.util.HashMap;

public class IHuffman {

    public interface codeTree {
        CharacterData binaryTree(PriorityQueue priorityQueue);
    }

    public interface characterCodes {
        HashMap<Character, String> encodedMap(CharacterData characterData);
    }

    public interface resultCode {
        String encodedString(HashMap<Character, String> hashMap);
    }

    public CharacterData createTree(PriorityQueue priorityQueue,codeTree codeTree){
       return codeTree.binaryTree(priorityQueue);
    }


    public HashMap<Character, String> codeMap(CharacterData characterData, characterCodes characterCodes) {
        return characterCodes.encodedMap(characterData);
    }

    public String result(HashMap<Character, String> hashMap, resultCode resultCode){
        return resultCode.encodedString(hashMap);
    }

}
