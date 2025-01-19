package org.example;

import org.example.Accessories.CharacterData;
import org.example.Accessories.Huffman;
import org.example.Accessories.PriorityQueue;
import org.example.Accessories.StringCount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = "sssssssssssssssttttttttteeeeeeeeeepppppppppppppphhhhhhhhhhhhhhhhheeeeeeeeeennnnnnnnnnnnnnnnnnnn mmmmmmmmmmmuuuuiiiiiiiiirrrrrruuuuuu";
        Huffman huffman = new Huffman();
        huffman.huffmanEncodeText(text);
    }
}