import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class intersectionTest {

    intersection as;

    @BeforeEach
    void setup() {
        as = new intersection();
    }

    @Test
    public void intersectionPositiveNotEmptyPositiveNumbers() {
        int [] initialArray = {1, 2, 4, 5, 89};
        int [] checkedNumbersArray = {8, 9, 4, 2};

        int[] expectedResult = {2, 4};
        int[] actualResult = as.Intersection(initialArray, checkedNumbersArray);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void intersectionPositiveNotEmptyNegativeNumbers() {
        int [] initialArray = {-1, -2, -4, -5, -89};
        int [] checkedNumbersArray = {-8, -9, -4, -2};

        int[] expectedResult = {-2, -4};
        int[] actualResult = as.Intersection(initialArray, checkedNumbersArray);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void intersectionPositiveEmpty() {
        int [] initialArray = {};
        int [] checkedNumbersArray = {-8, -9, -4, -2};

        int[] expectedResult = {};
        int[] actualResult = as.Intersection(initialArray, checkedNumbersArray);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void intersectionNegativeEmpty() {
        int [] initialArray = {};
        int [] checkedNumbersArray = {-8, -9, -4, -2};

        int[] expectedResult = {-2, -4};
        int[] actualResult = as.Intersection(initialArray, checkedNumbersArray);
        assertFalse(Arrays.equals(expectedResult, actualResult));
    }

    @Test
    public void intersectionNegativeNotEmptyNegativeNumbers() {
        int [] initialArray = {-1, -2, -4, -5, -89};
        int [] checkedNumbersArray = {-8, -9, -4, -2};

        int[] expectedResult = {2, 4};
        int[] actualResult = as.Intersection(initialArray, checkedNumbersArray);
        assertFalse(Arrays.equals(expectedResult, actualResult));
    }

    @Test
    public void intersectionNegativeNotEmptyPositiveNumbers() {
        int [] initialArray = {1, 2, 4, 5, 89};
        int [] checkedNumbersArray = {-8, -9, -4, -2};

        int[] expectedResult = {2, 4};
        int[] actualResult = as.Intersection(initialArray, checkedNumbersArray);
        assertFalse(Arrays.equals(expectedResult, actualResult));
    }
}