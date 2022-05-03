import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isPositiveNumberTest {

    isPositiveNumber as;

    @BeforeEach
    void setup() {
        as = new isPositiveNumber();
    }

    @Test
    public void isPositiveNumberHappyPathPositive() {
        int initialValue = 555;
        boolean expectedResult = true;
        boolean actualResult = as.IsPositiveNumber(initialValue);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void isPositiveNumberHappyPathNegative() {
        int initialValue = -555;
        boolean expectedResult = false;
        boolean actualResult = as.IsPositiveNumber(initialValue);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void isPositiveNumberHappyPathZero() {
        int initialValue = 0;
        boolean expectedResult = true;
        boolean actualResult = as.IsPositiveNumber(initialValue);

        assertEquals(expectedResult, actualResult);
    }
}