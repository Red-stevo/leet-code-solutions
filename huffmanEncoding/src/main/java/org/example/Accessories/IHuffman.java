package org.example.Accessories;

import java.util.HashMap;

public interface IHuffman {

    interface codeTree {
        CharacterData createTree(PriorityQueue priorityQueue);
    }

    interface characterCodes {
        HashMap<Character, String> codeMap(CharacterData characterData);
    }

    interface resultCode {
        String encodedString(HashMap<Character, String> hashMap);
    }
}
