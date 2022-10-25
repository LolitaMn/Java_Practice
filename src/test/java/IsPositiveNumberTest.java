import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    @Test
    public void testPositiveNumber_HappyPath() {
        int number = 555;
        boolean expectedResult = true;
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testNegativeNumber_HappyPath() {
        int number = -555;
        boolean expectedResult = false;
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void test_0_Number_HappyPath() {
        int number = 0;
        boolean expectedResult = true;
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);
        Assert.assertEquals(actualResult, expectedResult);

    }


}
