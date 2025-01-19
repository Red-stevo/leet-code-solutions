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

        return iHuffman.result(iHuffman.codeMap(iHuffman.createTree(priorityQueue, priorityQueue1 -> {
            CharacterData node1 = null, node2;

            while (priorityQueue1.hasNext()){
                node1 = priorityQueue1.peak();
                if (!priorityQueue.hasNext()) break;
                node2 = priorityQueue1.peak();

                priorityQueue.putNode(new CharacterData(null,
                            node1.getCharacterCount() + node2.getCharacterCount(), node1, node2));
            }
            return node1;
        }), characterData -> {

            return null;
        }), (hashMap) -> {

          return null;
        });
    }
}
