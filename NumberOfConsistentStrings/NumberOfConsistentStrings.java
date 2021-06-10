package NumberOfConsistentStrings;

import java.util.HashSet;

public class NumberOfConsistentStrings {

    public static int countConsistentStrings(String allowed, String[] words) {

        int ans = words.length;
        HashSet<Character> hash_set = new HashSet<>();

        for (int k = 0; k < allowed.length(); k++) {
            hash_set.add(allowed.charAt(k));
        }

        for (String s : words) {
            for (int i = 0; i < s.length(); i++) {
                if (!hash_set.contains(s.charAt(i))) {
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String allowed = "cad";
        String[] words = { "cc", "acd", "b", "ba", "bac", "bad", "ac", "d" };

        System.out.println("Result: " + countConsistentStrings(allowed, words));
    }
}
