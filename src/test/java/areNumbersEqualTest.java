import org.junit.jupiter.api.*;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class areNumbersEqualTest {
    areNumbersEqual as;
    Random rand = new Random();

    @BeforeEach
    void setup() {
        as = new areNumbersEqual();
    }
    @Order(1)
    @RepeatedTest(5)

    void areNumbersEqualPositiveFirstLessThanSecond() {
        int a = rand.nextInt(100);
        int b = 100 + rand.nextInt(100);

        int expectedResult = -1;
        int actualResult = as.AreNumbersEqual(a, b);
        assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @RepeatedTest(5)
    void areNumbersEqualPositiveSecondLessThanFirst() {
        int a = 100 + rand.nextInt(100);
        int b = rand.nextInt(100);

        int expectedResult = 1;
        int actualResult = as.AreNumbersEqual(a, b);
        assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @RepeatedTest(5)

    void areNumbersEqualNegativeFirstLessThanSecond() {
        int a = rand.nextInt(100);
        int b = 100 + rand.nextInt(100);

        int expectedResult = 1;
        int actualResult = as.AreNumbersEqual(a, b);
        assertNotEquals(expectedResult, actualResult);
    }

    @Order(4)
    @RepeatedTest(5)

    void areNumbersEqualNegativeSecondLessThanFirst() {
        int a = 100 + rand.nextInt(100);
        int b = rand.nextInt(100);

        int expectedResult = -1;
        int actualResult = as.AreNumbersEqual(a, b);
        assertNotEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    void areNumbersEqualPositiveFirstEqualsSecond() {
        int a = -5;
        int b = -5;

        int expectedResult = 0;
        int actualResult = as.AreNumbersEqual(a, b);
        assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    void areNumbersEqualNegativeSecondEqualsFirst() {
        int a = -5;
        int b = 5;

        int expectedResult = 1;
        int actualResult = as.AreNumbersEqual(a, b);
        assertNotEquals(expectedResult, actualResult);
    }
}