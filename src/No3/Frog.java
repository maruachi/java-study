package No3;

import java.util.HashMap;
import java.util.Map;

public class Frog {
    private final Map<Character, Character> frogDict;

    private Frog(Map<Character, Character> frontDict){
        this.frogDict = frontDict;
    }

    public static Frog createReverseFrog(){
        Map<Character, Character> frogDict = new HashMap<>();

        char normal = 'A';
        char reverse = 'Z';
        for(int i = 0; i < 26; i++){
            frogDict.put(new Character(normal), new Character(reverse));
            normal++;
            reverse--;
        }

        return new Frog(frogDict);
    }

    public String speak(String word){
        String frogWord = "";
        for(int i = 0; i < word.length();i++){
            Character ch = new Character(word.charAt(i));
            if(ch.equals(new Character(' '))){
                frogWord += " ";
                continue;
            }
            Character reverse = frogDict.get(ch);
            frogWord += reverse;
        }
        return frogWord;
    }
}
