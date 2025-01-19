package org.example;

import org.example.Accessories.Huffman;

public class Main {
    public static void main(String[] args) {
        String text = "sssttteeeeevvveee";
        Huffman huffman = new Huffman();
        System.out.println(huffman.huffmanEncodeText(text));
    }
}