import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class reverseArray {

    public int[] ReverseArray(int[] array) {

        int[] output = new int[array.length];
        for (int i = 0; i < array.length; i ++) {
            output[i] = array[array.length - i - 1];
        }

        return output;
    }
}
