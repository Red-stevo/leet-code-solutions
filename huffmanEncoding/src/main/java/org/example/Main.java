package org.example;

import org.example.Accessories.PriorityQueue;
import org.example.Accessories.StringCount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Long> numbers = new ArrayList<>(List.of(8L, 7L, 6L, 2L, 5L, 4L, 4L, 2L, 3L, 2L, 1L, 1L));

        PriorityQueue priorityQueue = new PriorityQueue(numbers);

        String text = "eber7yfbyufbfyubfbvo8bvvbvybv vb ubtvdf udnaf uebeb";

        StringCount stringCount = text1 -> {


            return null;
        };
        HashMap<Character, Long> frequencyMap = stringCount.count(text);
    }
}