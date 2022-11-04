import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenValuesInArrayTest {


    @Test
    public void testQuantityOfEvenValues_HappyPath() {
        int[] array = {1, 2, 3, 4, 5};
        int expectedResult = 2;
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testIfArrayIsEmpty() {
        int[] array = {};
        int expectedResult = -1;
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test
    public void testIfArrayIsNull() {
        int[] array = null;
        int expectedResult = -1;
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);
        Assert.assertEquals(actualResult,expectedResult);

    }


    @Test
    public void testQuantityOfOddValues_HappyPath() {
        int[] array = {1, 2, 3, 4, 5};
        int expectedResult = 3;
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testIfArrayIsEmpty_OddTest() {
        int[] array = {};
        int expectedResult = -1;
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test
    public void testIfArrayIsNull_OddTest() {
        int[] array = null;
        int expectedResult = -1;
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);
        Assert.assertEquals(actualResult,expectedResult);

    }


}
