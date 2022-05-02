import java.util.Arrays;

public class peakElement {

    /**
     * 10.	Написать алгоритм PeakElement,
     * который принимает на вход массив целых чисел
     * и возвращает значения пиковых элементов (элементы, которые больше своих соседей).
     * Test Data:
     * {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
     */

    public int[] PeakElement(int[] array) {
        int[] output = new int[array.length];
        int len = array.length;
        int lastOutputIndex = 0;
        if (array.length == 0) return output;
        else if (array.length == 1) return array;
        else if (array.length == 2) {
            output[0] = Math.max(array[0], array[1]);
            lastOutputIndex = len - 1;
        } else {
            if (array[0] > array[1]) output[0] = array[0];
            for (int i = 1, j = 0; i < len - 1; i++) {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    output[j] = array[i];
                    j++;
                    lastOutputIndex = j;
                }
            }
        }
        if (array[len - 1] > array[len - 2]) {
            output[lastOutputIndex] = array[len - 1];
            lastOutputIndex++;
        }
        return Arrays.copyOf(output, lastOutputIndex);
    }
}