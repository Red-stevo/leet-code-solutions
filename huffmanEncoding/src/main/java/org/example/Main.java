package org.example;

import org.example.Accessories.CharacterData;
import org.example.Accessories.PriorityQueue;
import org.example.Accessories.StringCount;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String text = "sssssssssssssssttttttttteeeeeeeeeepppppppppppppphhhhhhhhhhhhhhhhheeeeeeeeeennnnnnnnnnnnnnnnnnnn mmmmmmmmmmmuuuuiiiiiiiiirrrrrruuuuuu";
        StringCount stringCount = text1 -> {
            HashMap<Character, CharacterData> freMap = new HashMap<>();
            for(Character Char : text1.toCharArray()){
                if (freMap.containsKey(Char))
                    freMap.get(Char).setCharacterCount(freMap.get(Char).getCharacterCount() + 1L);
                else
                    freMap.put(Char, new CharacterData(Char, 1L));
            }
            return freMap;
        };

        System.out.println(stringCount.count(text));
        //PriorityQueue priorityQueue = new PriorityQueue(n);
    }
}