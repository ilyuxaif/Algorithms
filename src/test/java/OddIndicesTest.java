import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;



class OddIndicesTest {

    oddIndices as;

    @BeforeEach
    void setup () {
        as = new oddIndices();
    }

    @Test
    public void oddIndicesHappyPathPositiveArray() {
        int[] initialArray = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};
        int[] actualResult = as.OddIndices(initialArray);

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void oddIndicesHappyPathEmptyArray() {
        int[] initialArray = {};
        int[] expectedResult = {};
        int[] actualResult = as.OddIndices(initialArray);

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void oddIndicesHappyPathOneElementArray() {
        int[] initialArray = {-45};
        int[] expectedResult = {};
        int[] actualResult = as.OddIndices(initialArray);

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void oddIndicesHappyPathTwoNumbersArray() {
        int[] initialArray = {-45, 590};
        int[] expectedResult = {590};
        int[] actualResult = as.OddIndices(initialArray);

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void oddIndicesHappyPathThreeNumbersArray() {
        int[] initialArray = {-45, 590, 234};
        int[] expectedResult = {590};
        int[] actualResult = as.OddIndices(initialArray);

        assertArrayEquals(expectedResult, actualResult);
    }





}