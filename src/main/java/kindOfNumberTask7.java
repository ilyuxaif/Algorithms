public class kindOfNumberTask7 {

    public String KindOfNumberTask7(int m) {
        if (m % 3 == 0 && m % 5 == 0) return "Good Number";
            else if (m % 3 == 0 && m % 5 != 0) return "Bad Number";
                else if (m % 5 == 0 && m % 3 != 0) return "Poor Number";
        return "-1";
    }
}
