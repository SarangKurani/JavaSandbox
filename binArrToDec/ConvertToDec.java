package binArrToDec;

public class ConvertToDec {
    public static int converter(int [] input) {
        int result = 0;
        int len = input.length;

        for (int n: input) {
            result += Math.pow(2, len-1) * n;
            len--;
        }

        return result;
    }

    public static void main(String [] args) {
        int [] input = {1,0,1,0,1,0,0,1,1,1,1,0,0,0,0,0,1,0};
        int res = converter(input);
        System.out.println("The result is " + res);
    }
} 