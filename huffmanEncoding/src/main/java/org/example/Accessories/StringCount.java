package org.example.Accessories;

import java.util.HashMap;

@FunctionalInterface
public interface StringCount {
    HashMap<Character, CharacterData> count(String text);
}
