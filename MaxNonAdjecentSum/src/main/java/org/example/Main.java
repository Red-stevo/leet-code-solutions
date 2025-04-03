package org.example;

import org.example.Solution.MaxNonAdjacentSum;
import org.example.Solution.TakeNotTake;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TakeNotTake takeNotTake = TakeNotTake
                .builder()
                .arr(new ArrayList<>(List.of(1, 2, 3, 4)))
                .build();

        takeNotTake.takeNotTake(0, new ArrayList<>());
    }
}