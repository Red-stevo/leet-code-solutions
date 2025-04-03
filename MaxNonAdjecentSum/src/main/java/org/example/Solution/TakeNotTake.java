package org.example.Solution;

import lombok.Builder;

import java.util.Arrays;
import java.util.List;

@Builder
public class TakeNotTake {

    private List<Integer> arr;

    public void takeNotTake(int index, List<Integer> list) {

        if (index >= arr.size()) {
            System.out.println(Arrays.toString(list.toArray()));
            return;
        }

        list.add(arr.get(index));

        takeNotTake(index+1, list);

        list.remove(list.size()-1);

        takeNotTake(index+1, list);
    }
}