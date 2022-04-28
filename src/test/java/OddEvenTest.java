import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OddEvenTest {

    @Test
    public void testOddEvenHappyOddPath() {

        int number = -345;
        String expectedResult = "Odd";
        OddEven as = new OddEven();

        String actualResult = as.OddEven(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenHappyEvenPath() {
        int number = 222222;
        String expectedResult = "Even";
        OddEven as = new OddEven();

        String actualResult = as.OddEven(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}