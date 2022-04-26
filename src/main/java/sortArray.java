import java.util.Arrays;

public class sortArray {

    public int[] SortArray(int[] array) {

        Arrays.sort(array);
        return Arrays.copyOf(array, array.length);
    }
}
