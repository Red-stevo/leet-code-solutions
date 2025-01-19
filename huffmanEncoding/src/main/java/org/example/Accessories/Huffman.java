package org.example.Accessories;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Huffman {

    private final IHuffman iHuffman;

    public Huffman(){
        iHuffman = new IHuffman();
    }

    public String huffmanEncodeText(String text){
        StringCount stringCount = text1 -> {
            HashMap<Character, CharacterData> freMap = new HashMap<>();
            for(Character Char : text1.toCharArray()){
                if (freMap.containsKey(Char))
                    freMap.get(Char).setCharacterCount(freMap.get(Char).getCharacterCount() + 1L);
                else freMap.put(Char, new CharacterData(Char, 1L));
            }
            return freMap;
        };

        List<CharacterData> data = new ArrayList<>();
        stringCount.count(text).forEach((character, characterData) -> {data.add(characterData);});
        PriorityQueue priorityQueue = new PriorityQueue(data);

        iHuffman.result(iHuffman.codeMap(iHuffman.createTree(priorityQueue, priorityQueue1 -> {

            return null;
        }), characterData -> {

            return null;
        }), (hashMap) -> {

          return null;
        });

        return null;
    }
}
