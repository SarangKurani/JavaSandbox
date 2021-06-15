package UniqueMorseRepresentations;

import java.util.HashSet;

public class UniqueMorseRepresentations {
    public static int uniqueMorseRepresentations(String[] words) {
        String[] encodings = { 
                                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                                 "....", "..", ".---", "-.-", ".-..", "--", "-.", 
                                 "---", ".--.", "--.-", ".-.", "...", "-", "..-", 
                                 "...-", ".--", "-..-", "-.--", "--.." };

        HashSet<String> uniqueWords = new HashSet<String>();

        for (String word : words) {

            StringBuilder sb = new StringBuilder();

            for (char ch : word.toCharArray())
                sb.append(encodings[ch - 'a']);

            uniqueWords.add(sb.toString());
        }

        return uniqueWords.size();
    }

    public static void main(String[] args) {
        String [] input = {"gin", "zen", "gig", "msg"};
        System.out.println("The number of unique MorseRepresentations is: " + uniqueMorseRepresentations(input));
    }
}
