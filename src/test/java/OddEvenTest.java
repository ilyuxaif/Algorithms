import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class OddEvenTest {

    OddEven as;
    @BeforeEach
    void setUp(){
        as = new OddEven();
    }
    @Order(1)
    @Test
    public void testOddEvenPositiveOddPath() {

        int number = -345;
        String expectedResult = "Odd";

        String actualResult = as.OddEven(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOddEvenPositiveEvenPath() {
        int number = 222222;
        String expectedResult = "Even";

        String actualResult = as.OddEven(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testOddEvenPositiveUndefinedPath() {

        int number = 2147483647 + 1;
        String expectedResult = "Undefined";

        String actualResult = as.OddEven(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(4)
    @Test
    public void testOddEvenNegativeOddPath() {

        int number = -346;
        String expectedResult = "Odd";

        String actualResult = as.OddEven(number);
        Assertions.assertNotEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testOddEvenNegativeEvenPath() {
        int number = 333333;
        String expectedResult = "Even";

        String actualResult = as.OddEven(number);
        Assertions.assertNotEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testOddEvenNegativeUndefinedPath() {

        int number = 2147483647;
        String expectedResult = "Undefined";

        String actualResult = as.OddEven(number);
        Assertions.assertNotEquals(expectedResult, actualResult);
    }
}