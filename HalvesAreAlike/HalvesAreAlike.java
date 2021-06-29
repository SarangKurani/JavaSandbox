package HalvesAreAlike;

public class HalvesAreAlike {

    static String vowels = "aeiouAEIOU";

    public static boolean halvesAreAlike(String s) {
        int mid = s.length() / 2, ans = 0;
        for (int i = 0, j = mid; i < mid; i++, j++) {
            if (vowels.indexOf(s.charAt(i)) >= 0) ans++;
            if (vowels.indexOf(s.charAt(j)) >= 0) ans--;
        }
        return ans == 0;
    }
    

    public static void main(String[] args) {
        String input = "book"; // true
        // String input = "textbook"; // false
        // String input = "MerryChristmas"; // false
        // String input = "AbCdEfGh"; // true

        System.out.println(halvesAreAlike(input));
    }
}