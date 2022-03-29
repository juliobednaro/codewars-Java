package eight.sol7;

import java.util.Random;

public class YesOrNo {
    public static String boolToWord(boolean b) {
        Random rand = new Random();
        int n = rand.nextInt(2);
        b = (n == 1);
        return b ? "Yes" : "No";
    }
}
