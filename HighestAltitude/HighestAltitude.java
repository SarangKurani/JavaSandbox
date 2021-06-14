package HighestAltitude;

public class HighestAltitude {
    
    public static int largestAltitude(int [] gain) {
       int max = 0;
       int runningTotal = 0;

       for (int g : gain) {
           runningTotal += g;
           max = runningTotal > max ? runningTotal : max;
       }

       return max;
    }

    public static void main(String[] args) {
        int [] gain = {-4,-3,-2,-1,4,3,2};

        System.out.println("Highest altitude of cyclist is: " + largestAltitude(gain));
    }
}
