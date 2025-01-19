package org.example.Accessories;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
public class CharacterData {

    private Character characterData;

    private Long characterCount;

    private CharacterData leftChild;

    private CharacterData rightChild;

    public CharacterData(Character characterData, Long characterCount){
        this.characterData = characterData;
        this.characterCount = characterCount;
    }

    @Override
    public String toString() {
        return "{" + characterData +
                ", " + characterCount +
                ", " + leftChild +
                ", " + rightChild +
                "}\t";
    }
}
