import org.junit.jupiter.api.*;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class sortArrayTest {

    sortArray as;

    @BeforeEach
    void setup() {
        as = new sortArray();
    }

    @Order(1)
    @Test
    void sortArrayHappyPathWithNumbers() {
        int[] expectedResult = new int[]{2, 3, 4, 4, 5, 7, 9, 12, 12};
        int[] actualResult = as.SortArray(new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12});
        assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    void sortArrayHappyPathWithOneNumber() {
        int[] expectedResult = new int[]{2};
        int[] actualResult = as.SortArray(new int[]{2});
        assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    void sortArrayHappyPathEmpty() {
        int[] expectedResult = new int[]{};
        int[] actualResult = as.SortArray(new int[]{});
        assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    void sortArrayHappyPathWithEqualNumbers() {
        int[] expectedResult = new int[]{2, 2};
        int[] actualResult = as.SortArray(new int[]{2, 2});
        assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    void sortArrayHappyPathWithMinusNumbers() {
        int[] expectedResult = new int[]{-2, 0, 2};
        int[] actualResult = as.SortArray(new int[]{0, 2, -2});
        assertArrayEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    void sortArrayHappyPathWith_INT_MAX_MIN_VALUE_Numbers() {
        int[] expectedResult = new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE};
        int[] actualResult = as.SortArray(new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE});
        assertArrayEquals(expectedResult, actualResult);
    }

    // NEGATIVE TESTS
    @Order(7)
    @Test
    void sortArrayUnHappyPathWithNumbers() {
        int[] expectedResult = new int[]{3, 2, 4, 4, 5, 7, 9, 12, 12};
        int[] actualResult = as.SortArray(new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12});
        assertFalse(Arrays.equals(expectedResult, actualResult));
    }

    @Order(8)
    @Test
    void sortArrayUnHappyPathWithOneNumber() {
        int[] expectedResult = new int[]{};
        int[] actualResult = as.SortArray(new int[]{2});
        assertFalse(Arrays.equals(expectedResult, actualResult));
    }

    @Order(9)
    @Test
    void sortArrayUnHappyPathEmpty() {
        int[] expectedResult = new int[]{2};
        int[] actualResult = as.SortArray(new int[]{});
        assertFalse(Arrays.equals(expectedResult, actualResult));
    }

    @Order(10)
    @Test
    void sortArrayUnHappyPathWithEqualNumbers() {
        int[] expectedResult = new int[]{-2, 2};
        int[] actualResult = as.SortArray(new int[]{2, 2});
        assertFalse(Arrays.equals(expectedResult, actualResult));
    }

    @Order(11)
    @Test
    void sortArrayUnHappyPathWithMinusNumbers() {
        int[] expectedResult = new int[]{0, -2, 2};
        int[] actualResult = as.SortArray(new int[]{0, 2, -2});
        assertFalse(Arrays.equals(expectedResult, actualResult));
    }

    @Order(12)
    @Test
    void sortArrayUnHappyPathWith_INT_MAX_MIN_VALUE_Numbers() {
        int[] expectedResult = new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
        int[] actualResult = as.SortArray(new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE});
        assertFalse(Arrays.equals(expectedResult, actualResult));
    }

}