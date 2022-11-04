import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {


    @Test
    public void testMupltiplyArrayToNumber_HappyPath() {
        int number = 3;
        int [] array = {1, 2, 3, 4, 5};
        int[] expectedResult = {3, 6, 9, 12, 15};
        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array, number);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testNumberIsZero_NegativePath() {
        int number = 0;
        int [] array = {1, 2, 3, 4, 5};
        int[] expectedResult = array;
        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array, number);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testArrayIs_Zero_NegativePath() {
        int number = 3;
        int [] array = {};
        int[] expectedResult = {};
        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array, number);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testArrayIs_Null_NegativePath() {
        int number = 3;
        int [] array = null;
        int[] expectedResult = {};
        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array, number);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testCreatingDoubleArrayFromIntArray_HappyPath() {
        int[] array = {1, 2, 3, 4, 5};
        double[] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreatingIntegerArrayFromDoubleArray_HappyPath() {
        double[] array = {1.0, 2.2, 3.0, 4.0, 5.1};
        int[] expectedResult = {1, 2, 3, 4, 5};
        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);
        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testCreatingStringArrayFromIntArray_HappyPath() {
        int[] array = {1, 2, 3, 4, 5};
        String[] expectedResult = {"1", "2", "3", "4", "5"};
        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreatingStringArrayFromDoubleArray_HappyPath() {
        double[] array = {1.2, 2.0, 3.4, 4.1, 5.0};
        String[] expectedResult = {"1.2", "2.0", "3.4", "4.1", "5.0"};
        String[] actualResult = new ManipulationsWithArrays().toStringArrayFromDouble(array);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testArrayValuesAreGreaterThanNumber_HappyPath() {
        int[] array = {7, 2, 3, 4, 5};
        int number = 1;
        boolean expectedResult = true;
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testArrayValuesAreNotGreaterThanNumber_HappyPath() {
        int[] array = {1, 2, 3, 4, 5};
        int number = 4;
        boolean expectedResult = false;
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);
        Assert.assertEquals(actualResult, expectedResult);
    }





}
