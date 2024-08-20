package org.example;


import Solution.Node;
import Solution.ToLinkedList;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++)
            array[i] = new Random().nextInt(n);


        ToLinkedList toLinkedList = new ToLinkedList();

        Node root = toLinkedList.toLinkedList(array);

        System.out.print("The Original Array : ");
        for (int i : array){
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.print("The Linked List Elements : ");
        while (root != null){
            System.out.print(root.getData()+"\t");
            root = root.getNextNode();
        }
    }
}