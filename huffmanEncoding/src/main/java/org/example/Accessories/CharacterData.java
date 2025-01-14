package org.example.Accessories;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CharacterData {

    private Character characterData;

    private Long characterCount;

    public CharacterData getState(){return  this;}

}
