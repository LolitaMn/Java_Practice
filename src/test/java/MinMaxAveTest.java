import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {


    @Test
    public void testCreatedMassiveBy_PositiveIndexes_HappyPath() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult =  {3, 7, 5};
        int[] actualResult = new MinMaxAve().MinMaxAve(array, index1, index2);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCreatedMassiveBy_OneNegativeIndex_NegativePath() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = -2;
        int index2 = 6;
        int[] expectedResult =  {};
        int[] actualResult = new MinMaxAve().MinMaxAve(array, index1, index2);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
