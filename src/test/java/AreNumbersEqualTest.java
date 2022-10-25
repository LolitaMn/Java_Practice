import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {

    @Test(priority = 1)
    public void testFirstNumberGreater_HappyPath() {
        int a = 89;
        int b = -89;
        int expectedResult = 1;
        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);
        Assert.assertEquals(actualResult, expectedResult);

    }


    @Test(priority = 2)
    public void testSecondNumberGreater_HappyPath() {
        int a = -89;
        int b = 89;
        int expectedResult = -1;
        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test(priority = 3)
    public void testBothNumbersAreEqual_HappyPath() {
        int a = 89;
        int b = 89;
        int expectedResult = 0;
        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);
        Assert.assertEquals(actualResult, expectedResult);

    }


}
