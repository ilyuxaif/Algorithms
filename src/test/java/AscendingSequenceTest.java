import org.junit.jupiter.api.*;

public class AscendingSequenceTest {

    public void testAscendingSequenceHappyPath() {
        int start = 0;
        int end = 5;
        int step = 1;
        int[] expectedResult = {0, 1, 2, 3, 4, 5};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);


    }
}
