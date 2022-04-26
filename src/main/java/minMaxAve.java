import java.util.Arrays;

public class minMaxAve {

    public static int[] MinMaxAve(int[] array, int index1, int index2) {

        int[] output = new int[3];
        int sum = 0;
        int[] array2 = new int[index2 - index1 + 1];
        for (int i = index1, j = 0; i <= index2; i ++) {
            array2[j] = array[i];
            j++;
        }
        for (int i : array2) {sum += i;}

        Arrays.sort(array2);
        output[0] = array2[0];
        output[1] = array2[array2.length - 1];
        output[2] = sum / array2.length;

        return output;
    }

}
