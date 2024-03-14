import java.lang.management.ManagementPermission;
import java.util.HashMap;
import java.util.Map;

public class FindTheFirstNonRepeatingCharacter {

    public char solution(String word){
        Map<Character, Integer> characterFrequency = new HashMap<>();
        char[] charArray = word.toCharArray();

        for(char character : charArray){
            characterFrequency.put(character, characterFrequency.getOrDefault(character, 0 ) + 1);
        }

        for(char cha : charArray){
            if(characterFrequency.get(cha) == 1){
                return cha;
            }
        }
        return 0;
    }
}
