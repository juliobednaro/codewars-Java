package seven.sol2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {
    public static int[] flattenAndSort(int[][] array) {
        List<Integer> flattened = new ArrayList<>();
        int[] flat;

        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                flattened.add(array[i][j]);
            }
        }
        flat = new int[flattened.size()];
        for (int i=0; i<flat.length; i++)  flat[i] = flattened.get(i);
        Arrays.sort(flat);

        return flat;
    }
}
