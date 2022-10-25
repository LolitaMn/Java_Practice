import org.testng.Assert;
import org.testng.annotations.Test;

public class ConditionalActionsTest {



    @Test(priority = 0)
    public void testMultipleOf_7_And_9_HappyPath() {
        int m = 63;
        String expectedResult = "Good Morning";
        String actualResult = new ConditionalActions().conditionalActions(m);
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test(priority = 1)
    public void testMultipleOf_9_HappyPath() {
        int m = 90;
        String expectedResult = "Bad Number";
        String actualResult = new ConditionalActions().conditionalActions(m);
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test(priority = 2)
    public void testMultipleOf_11_HappyPath() {
        int m = 11;
        String expectedResult = "Poor Number";
        String actualResult = new ConditionalActions().conditionalActions(m);
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test(priority = 3)
    public void testConditionsAreNotSatisfied_NegativePath() {
        int m = -2;
        String expectedResult = "-1";
        String actualResult = new ConditionalActions().conditionalActions(m);
        Assert.assertEquals(actualResult,expectedResult);

    }


    @Test(priority = 4)
    public void testM_Is_0_NegativePath() {
        int m = 0;
        String expectedResult = "Enter number greater than 0";
        String actualResult = new ConditionalActions().conditionalActions(m);
        Assert.assertEquals(actualResult,expectedResult);

    }
}
