package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IntegerToRoman {

    private Integer number;


    public String convert() {
        if (number == null)
            throw new NullConversionException("Number to Convert Must Not be Null.");
        return convert(number);
    }

    public String convert(@NonNull Integer num){
        char[] c = num.toString().toCharArray();
        int placeValue = 0;
        char[][] placeValues = new char[][]{ {'i', 'v'}, {'x', 'l'}, {'c', 'd'}, {'m'}};
        StringBuilder stringBuilder = new StringBuilder();


        for(int i = c.length-1; i > -1; --i){
            int value = Integer.parseInt(String.valueOf(c[i]));

            if (value == 0);
            else if (value < 4){
                while (value > 0){
                    stringBuilder.append(placeValues[placeValue][0]);
                    --value;
                }
            } else if (value == 4) {
                stringBuilder.append(placeValues[placeValue][1]);
                stringBuilder.append(placeValues[placeValue][0]);
            } else if (value < 9) {
                while (value > 5){
                    stringBuilder.append(placeValues[placeValue][0]);
                    --value;
                }
                stringBuilder.append(placeValues[placeValue][1]);
            }else {
                stringBuilder.append(placeValues[placeValue + 1][0]);
                stringBuilder.append(placeValues[placeValue][0]);
            }

            ++placeValue;
        }
        return stringBuilder.reverse().toString();
    }
}
