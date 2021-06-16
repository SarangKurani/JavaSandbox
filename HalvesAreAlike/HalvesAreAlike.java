package HalvesAreAlike;

import java.util.HashSet;
import java.util.Arrays;

public class HalvesAreAlike {

    public static boolean halvesAreAlike(String s) {
        HashSet<Character> vowels = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int stringLength = s.length();
        int gap = stringLength / 2;
        s = s.toLowerCase();
        int firstHalfVowels = 0;
        int secondHalfVowels = 0;

        for (int i = 0; i < gap; i++) {
            firstHalfVowels += vowels.contains(s.charAt(i)) ? 1 : 0;
            secondHalfVowels += vowels.contains(s.charAt(i + gap)) ? 1 : 0;
        }

        return firstHalfVowels == secondHalfVowels;
    }

    public static void main(String[] args) {
        String input = "book"; // true
        // String input = "textbook"; // false
        // String input = "MerryChristmas"; // false
        // String input = "AbCdEfGh"; // true

        System.out.println(halvesAreAlike(input));
    }
}