public class biggerValue {
    /**
     * <b>BiggerValue</b> returns bigger value of inputted two numbers (<b>a</b>, <b>b</b>),
     * and <b>-1</b> if numbers are equal.
     * @return max value of (a, b)
     */
    public int BiggerValue (int a, int b) {
        if (a == b) return -1;
            else return (Math.max(a, b));
    }
}
