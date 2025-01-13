package org.example;

import org.example.Accessories.PriorityQueue;
import org.example.Accessories.StringCount;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String text = "sssssssssssssssttttttttteeeeeeeeeepppppppppppppphhhhhhhhhhhhhhhhheeeeeeeeeennnnnnnnnnnnnnnnnnnn mmmmmmmmmmmuuuuiiiiiiiiirrrrrruuuuuu";

        StringCount stringCount = text1 -> {
            HashMap<Character, Long> freMap = new HashMap<>();
            for(Character Char : text1.toCharArray()){
                freMap.put(Char, freMap.getOrDefault(Char, 0L)+1L);
            }
            return freMap;
        };

        PriorityQueue priorityQueue = new PriorityQueue(new ArrayList<>(stringCount.count(text).values()));
    }
}