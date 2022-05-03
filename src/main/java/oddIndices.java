public class oddIndices {
    public int[] OddIndices(int[] array) {

        if (array.length == 0) return new int[]{};
        else {
            int[] output = new int[array.length / 2];
            int j = 0;
            for (int i = 1; i < array.length; i += 2) {
                output[j] = array[i];
                j++;
            }
            return output;
        }
    }
}
