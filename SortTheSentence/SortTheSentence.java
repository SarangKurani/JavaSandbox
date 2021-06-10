package SortTheSentence;
import java.util.Arrays;

public class SortTheSentence {
    
    public static String sort(String input) {
        String [] inputAsArray = input.split(" ");
        System.out.println(Arrays.toString(inputAsArray));

        String [] result = new String [inputAsArray.length];

        for (String word: inputAsArray) {
            int pos = Character.getNumericValue(word.charAt(word.length() - 1));
            result[pos - 1] = word.split("[1-9]")[0];
        }

        return String.join(" ", result);
    }

    public static void main(String[] args) {
        String input = "is2 sentence4 This1 a3";
        System.out.println(sort(input)); 
    }
}
