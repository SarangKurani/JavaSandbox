package HalvesAreAlike;

import java.util.HashSet;
import java.util.Arrays;

public class HalvesAreAlike {

    public static boolean halvesAreAlike(String s) {
        
        HashSet<Character> vowels = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int stringLength = s.length();
        int mid = stringLength / 2;
        int total = 0;
        
        
        for (int i = 0, j = mid; i < mid; i++, j++) {
            if (vowels.contains(s.charAt(i))) total ++;
            if (vowels.contains(s.charAt(j))) total --;
        }
        
        return total == 0;
    }
    

    public static void main(String[] args) {
        String input = "book"; // true
        // String input = "textbook"; // false
        // String input = "MerryChristmas"; // false
        // String input = "AbCdEfGh"; // true

        System.out.println(halvesAreAlike(input));
    }
}