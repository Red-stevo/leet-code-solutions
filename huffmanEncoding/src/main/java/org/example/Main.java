package org.example;

import org.example.Accessories.Huffman;

public class Main {
    public static void main(String[] args) {
        String text = "Delta compression using up to 4 threads\n" +
                "Compressing objects: 100% (58/58), done.\n" +
                "Writing objects: 100% (90/90), 7.53 KiB | 513.00 KiB/s, done.\n" +
                "Total 90 (delta 35), reused 0 (delta 0), pack-reused 0\n" +
                "remote: Resolving deltas: 100% (35/35), completed with 4 local objects.\n" +
                "To github.com:Red-stevo/leet-code-solutions.git\n" +
                "   88dce71..fa3a06d  main -> main\n";

        System.out.println(new Huffman().huffmanEncodeText(text));
    }
}