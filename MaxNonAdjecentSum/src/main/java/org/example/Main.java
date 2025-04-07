package org.example;

import org.example.Solution.MaxNonAdjacentSum;
import org.example.Solution.TakeNotTake;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int N = 10000;
        Random r = new Random();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = r.nextInt(100);
        }

        /*TakeNotTake takeNotTake = TakeNotTake
                .builder()
                .arr(new ArrayList<>(List.of(1, 2, 3, 4)))
                .build();

        takeNotTake.takeNotTake(0, new ArrayList<>());*/

        MaxNonAdjacentSum max = new MaxNonAdjacentSum();

        System.out.println(max.run(new int[]{9, 1, 2, 3}));
    }


}