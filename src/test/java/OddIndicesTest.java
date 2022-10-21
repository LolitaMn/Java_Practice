import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {


    @Test
    public void testPrintOddIndexesFromArray() {
        int [] array = {-45, 590, 234, 985, 12, 68};
        int [] expectedResult = {590, 985, 68};

        int [] actualResult = new OddIndices().oddIndices(array);
        Assert.assertEquals(actualResult,expectedResult);

    }


    @Test
    public void testNegativePrintOddIndexesFromArray() {
        int [] array = {};
        int [] expectedResult = {};

        int [] actualResult = new OddIndices().oddIndices(array);
        Assert.assertEquals(actualResult,expectedResult);

    }

}
