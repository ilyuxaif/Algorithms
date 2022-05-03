import java.util.Arrays;

public class negativeOnTheRight {

    /**
     * 13. Написать алгоритм NegativeOnTheRight, который принимает на вход массив целых чисел,
     * и возвращает массив,  в котором все негативные числа находятся во второй половине массива
     * Test Data:
     * {4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
     */

    public int[] negativeOnTheRight(int[] array) {

        int[] output = new int[array.length];
        int j = 0;
        for (int k : array) {
            if (k >= 0) {
                output[j] = k;
                j++;
            }
        }
        for (int k : array) {
            if (k < 0) {
                output[j] = k;
                j++;
            }
        }
        return output;
    }
}
