import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

    @Test
    public  void testGreaterDigit_HappyPath() {

        int a = 2000;
        int b = 3000;
        long expectedResult = 3000;
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
