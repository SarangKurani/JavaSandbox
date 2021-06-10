package NumberOfConsistentStrings;

import java.util.Arrays;
import java.util.HashSet;

public class NumberOfConsistentStrings {
    public static int countConsistentStrings(String allowed, String[] words) {
        int consistentStrings = 0;

        System.out.println("allowed: " + allowed);
        System.out.println("words: " + Arrays.toString(words));

        HashSet <Character> allowedSet = new HashSet<Character>();
        allowed.chars().mapToObj(i -> (char)i).forEach(c -> allowedSet.add(c));

        for (String word : words) {
            int flag = 0;
            for (int i = 0; i < word.length(); i++) {
                if (allowedSet.contains(word.charAt(i))) continue;
                else {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) consistentStrings++;
        }

        return consistentStrings;
    }

    public static void main(String[] args) {
        String allowed = "cad";
        String [] words = {"cc","acd","b","ba","bac","bad","ac","d"};

        System.out.println("Result: " + countConsistentStrings(allowed, words));
    }
}
