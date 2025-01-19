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
            CharacterData node1 = null, node2, parent;

            while (priorityQueue1.hasNext()){
                node1 = priorityQueue1.peak();
                if (!priorityQueue.hasNext()) break;
                node2 = priorityQueue1.peak();

                parent = new CharacterData(null,
                        node1.getCharacterCount() + node2.getCharacterCount(), node1, node2, null, false);
                node1.setParent(parent);
                node2.setParent(parent);
                priorityQueue.putNode(parent);

            }
            return node1;
        }), characterData -> {
            HashMap<Character, String> encodeMap = new HashMap<>();
            StringBuilder stringBuilder = new StringBuilder();
            while(true) {

                if (characterData.getLeftChild() != null && !characterData.getLeftChild().isVisited()) {
                    stringBuilder.append('0');
                    characterData = characterData.getLeftChild();
                    continue;
                } else {
                    if (characterData.getCharacterData() != null) {
                        encodeMap.put(characterData.getCharacterData(), stringBuilder.toString());
                        stringBuilder.deleteCharAt(stringBuilder.toString().length() - 1);
                        characterData.setVisited(true);
                        characterData = characterData.getParent();
                    }
                }

                if (characterData.getRightChild() != null  && !characterData.getRightChild().isVisited()) {
                    stringBuilder.append('1');
                    characterData = characterData.getRightChild();
                    continue;
                }

                if (characterData.getParent() != null){
                    characterData.setVisited(true);
                    stringBuilder.deleteCharAt(stringBuilder.toString().length() - 1);
                    characterData = characterData.getParent();
                } else break;

            }
            return encodeMap;
        }),text, ((hashMap, text1) -> {
            StringBuilder stringBuilder = new StringBuilder();
            for (Character c : text1.toCharArray()) stringBuilder.append(hashMap.get(c));
            return stringBuilder.toString();
        }));
    }
}
