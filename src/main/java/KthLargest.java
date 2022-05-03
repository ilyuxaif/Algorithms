import java.util.Arrays;

public class KthLargest {
    /**
     * Написать алгоритм KthLargest, который принимает
     * на вход массив целых чисел и число k, и возвращает k-тый максимальный элемент.
     * Test Data:
     * ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 3) → 9
     * (12 и 12 - первый и второй самые большие элементы)
     */

    public int KthLargest(int[] array, int element) {
        Arrays.sort(array);
        int[] descArray = new int[array.length];
        for(int i = 0; i < array.length; i ++) {
            descArray[i] = array[(array.length - 1) - i];
        }
        return descArray[element - 1];
    }
}
