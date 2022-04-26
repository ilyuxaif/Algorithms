public class oddEven {
    public static String OddEven(int number) {

        if (number < -2147483647 || number > 2147483647) return "Undefined";
            else return (number % 2 != 0 ? "Odd" : "Even");
    }
}