package HighestAltitude;

import java.util.Arrays;

public class HighestAltitude {
    
    public static int largestAltitude(int [] gain) {
        int altiudes [] = new int [gain.length + 1];
        altiudes[0] = 0;

        for (int i = 0; i < gain.length; i++) {
            altiudes[i + 1] = gain[i] + altiudes[i];
        }

        System.out.println(Arrays.toString(altiudes));

        return findMax(altiudes);
    }

    public static int findMax (int [] arr) {
        int max = arr[0];
        
        for (int i : arr) {
            max = max > i ? max : i;
        }

        return max;
    }

    public static void main(String[] args) {
        int [] gain = {-5,1,5,0,-7};

        System.out.println("Highest altitude of cyclist is: " + largestAltitude(gain));
    }
}
