package three;

import java.util.Arrays;

public class Kata {
    public static double find_average(int[] array){
        int sum = 0;
        for (int i : array) sum += i;
        return (double) sum / array.length;
        /*
        Not mine but cool.
        Arrays.stream(array).average().getAsDouble();
         */
    }
}
