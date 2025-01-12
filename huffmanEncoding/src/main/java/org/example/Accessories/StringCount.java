package org.example.Accessories;

import java.util.HashMap;

@FunctionalInterface
public interface StringCount {
    HashMap<Character, Long> count(String text);
}
