import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

    @Test
    public  void testB_Greater_ADigit_HappyPath() {

        int a = 2000;
        int b = 3000;
        long expectedResult = b;
        long actualResult =  new BiggerValue().biggerValue(a, b);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public  void testA_GreaterB_Digit_HappyPath() {

        int a = 3000;
        int b = 2000;
        long expectedResult = a;
        long actualResult =  new BiggerValue().biggerValue(a, b);
        Assert.assertEquals(actualResult, expectedResult);

    }


    @Test
    public  void testEqualDigit() {

        int a = 2000;
        int b = 2000;
        long expectedResult = a;
        long actualResult =  new BiggerValue().biggerValue(a, b);
        Assert.assertEquals(actualResult, expectedResult);

    }






}
