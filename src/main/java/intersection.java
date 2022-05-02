import java.util.Arrays;
import java.util.function.DoubleToIntFunction;

public class intersection {

    public int[] Intersection(int[] array1, int[] array2) {
        if (array1.length == 0) {
            return new int[]{};
        } else {
            int[] output = new int[array1.length];
            int count = 0;


            for (int j : array1) {
                for (int k : array2) {
                    if (j == k) {
                        output[count] = j;
                        count++;
                    }
                }
            }
            return Arrays.copyOf(output, count);
        }
    }
}
