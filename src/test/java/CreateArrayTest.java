import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {

    @Test
    public void testCreatingArray_HappyPath() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;


        int [] expectedResult = {a, b, c, d, e};
        int[] actualResult = new CreateArray().createArray(a, b, c, d, e);
        Assert.assertEquals(actualResult, expectedResult);

    }


    @Test
    public void testCreateDoubleArray() {
        double a = 1.2;
        double b = 2.2;
        double c = 3.2;
        double d = 4.2;
        double e = 5.2;

        double [] expectedResult = {a, b, c, d, e};
        double[] actualResult = new CreateArray().createDoubleArray(a, b, c, d, e);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateStringArray() {
        String a = "It";
        String b = "was";
        String c = "a";
        String d = "strawberry";
        String e = "pie";

        String [] expectedResult = {a, b, c, d, e};
        String[] actualResult = new CreateArray().createStringArray(a, b, c, d, e);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateArrayFromTex() {
        String sentence = "it was a strawberry pie";

        String [] expectedResult = {"it", "was", "a", "strawberry", "pie"};
        String[] actualResult = new CreateArray().createArrayFromTex(sentence);
        Assert.assertEquals(actualResult, expectedResult);
    }







}
