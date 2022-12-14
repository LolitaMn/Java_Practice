import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {


    @Test
    public void testSumOfPositiveNumbersOfArray_HappyPath() {
        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        int actualResult = new SumArray().sumArray(array);
        Assert.assertEquals(actualResult, expectedResult);

    }


    @Test
    public void testSumOfNegativeNumbersOfArray_HappyPath() {
        int[] array = {-7, -3};
        int expectedResult = -10;

        int actualResult = new SumArray().sumArray(array);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testSumOf_0length_OfArray_NegativePath() {
        int[] array = {};
        int expectedResult = 0;

        int actualResult = new SumArray().sumArray(array);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testSumOf_Null_Array_NegativePath() {
        int[] array = {};
        int expectedResult = 0;

        int actualResult = new SumArray().sumArray(array);
        Assert.assertEquals(actualResult, expectedResult);

    }


}
