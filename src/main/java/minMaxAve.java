import java.util.Arrays;

public class minMaxAve {

    public int[] MinMaxAve(int[] array, int index1, int index2) {

        int sum = 0;
        int minValue = array[index1];
        int maxValue = array[index2];

        if (array == null || index2 < index1 || index1 < 0 || index2 < 0 || array.length < index2 || array.length < 1) {
            return new int[]{};
        }

        for (int i = index1; i <= index2; i ++) {
            if (minValue > array[i]) minValue = array[i];
            if (maxValue < array[i]) maxValue = array[i];
            sum += i;
        }

        return new int[] {minValue, maxValue, (sum / (index2 - index1 + 1))};
    }

}
