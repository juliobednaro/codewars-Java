package four;

import java.util.Arrays;

public class Kata {
    public static int[] invert(int[] array) {
        return Arrays.stream(array).map(operand -> operand * (-1)).toArray();
    }
    /*
    Other, not mine but cool:
    Arrays.stream(array).map(operand -> -operand).toArray();
     */
}
