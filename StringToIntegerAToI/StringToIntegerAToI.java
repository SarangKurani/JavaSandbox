package StringToIntegerAToI;

/**
 * StringToIntegerAToI
 */
public class StringToIntegerAToI {

    public static int myAtoi(String s) {
        s = s.trim();
        int multiplier = 1;

        StringBuilder sb = new StringBuilder("");

        char ch = s.charAt(0);
        if (ch == '+' || ch == '-') {
            if (ch == '-') {
                if (ch == '-')
                    multiplier *= -1;
            }
        }

        else if (Character.isDigit(ch))
            sb.append(ch);

        for (int i = 1; i < s.length(); i++) {
            ch = s.charAt(i);
            if (!Character.isDigit(ch)) {
                break;
            } else {
                sb.append(ch);
            }
        }

        if (sb.toString().equals(""))
            return 0;

        else
            return multiplier * Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        // String input = "42";
        String input = "   -42";
        // String input = "4193 with words";
        // String input = "words and 987";
        // String input = "-91283472332";

        int result = myAtoi(input);
        System.out.println(String.format("\"%s\" formatted as an integer is %d", input, result));
    }
}