package org.example;

import org.example.Accessories.Huffman;

public class Main {
    public static void main(String[] args) {
        String text = "sssssssssssssssttttttttteeeeeeeeeepppppppppppppphhhhhhhhhhhhhhhhheeeeeeeeeennnnnnnnnnnnnnnnnnnn mmmmmmmmmmmuuuuiiiiiiiiirrrrrruuuuuu";
        Huffman huffman = new Huffman();
        huffman.huffmanEncodeText(text);
    }
}