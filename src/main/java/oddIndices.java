public class oddIndices {
    public static int[] OddIndices(int[] array) {

        int[] output;
        if (array.length == 0) return null;
        else {
            output = new int[array.length / 2];
            int j = 0;
            for (int i = 1; i < array.length; i += 2) {
                output[j] = array[i];
                j++;
            }
        }
        return output;
    }
}
