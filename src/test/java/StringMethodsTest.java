import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {

    @Test
    public void testRemoveSentenceWithSpace() {
        String sentence = "    Red Rover Car   ";
        String expectedResult = "Extra Spaces were cut off";
        String actualResult = new StringMethods().removeSpaces(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testSentenceHasNoSpace() {
        String sentence = "Range Rover Car";
        String expectedResult = "No Spaces";
        String actualResult = new StringMethods().removeSpaces(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testSentenceIsEmpty() {
        String sentence = "";
        String expectedResult = "Row is empty";
        String actualResult = new StringMethods().removeSpaces(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemove_A_Letter_And_Space() {
        String sentence = "panda   ";
        String expectedResult = "pnd";
        String actualResult = new StringMethods().removeAllAs(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemove_Spaces_FromSentence() {
        String sentence = "    Range Rover Car   ";
        String expectedResult = "Range Rover Car";
        String actualResult = new StringMethods().removeAllAs(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemove_Only_A_FromSentence() {
        String sentence = "taramasalata";
        String expectedResult = "trmslt";
        String actualResult = new StringMethods().removeAllAs(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }


    @Test
    public void testSentenceInvalid_NegativePath() {
        String sentence = "";
        String expectedResult = "Row is empty";
        String actualResult = new StringMethods().removeAllAs(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemoveAll_0_And_Space_FromSentence() {
        String sentence = "3504209706040000 ";
        String expectedResult = "35429764";
        String actualResult = new StringMethods().removeAllZeros(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemoveAll_0_FromSentence() {
        String sentence = "0000000111";
        String expectedResult = "111";
        String actualResult = new StringMethods().removeAllZeros(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testEmptySentence_NegativePath() {
        String sentence = "";
        String expectedResult = "Row is empty";
        String actualResult = new StringMethods().removeAllZeros(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }


    @Test
    public void testRemoveAll_Space_FromSentence() {
        String sentence = "    R a n g e     Ro ve    C  a  r   ";
        String expectedResult = "RangeRoverCar";
        String actualResult = new StringMethods().removeAllSpaces(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCountLetter_A_And_Other() {
        String sentence = "Abracadabra";
        String expectedResult = "5, 6";
        String actualResult = new StringMethods().countAs(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCount_No_Letter_A() {
        String sentence = "Homenum Revelio";
        String expectedResult = "0, 15";
        String actualResult = new StringMethods().countAs(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCount_With_Number_InSentence() {
        String sentence = "3 tarAmasAlatA";
        String expectedResult = "6, 8";
        String actualResult = new StringMethods().countAs(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void test_Java_ExisteInSentence() {
        String sentence = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current "
                + "long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy "
                + "version Java 8 LTS in January 2019 for commercial use, although it will otherwise still support Java"
                + " 8 with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost"
                + " builds of OpenJDK 8 and 11 that are still receiving security and other upgrades";
        String expectedResult = "true";
        String actualResult = new StringMethods().countJava(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void test_No_Java_InSentence() {
        String sentence = "99 little bugs in a code.\n"
                + "99 little bugs in a code.\n"
                + "Take one down, and patch it around.\n"
                + "235 critical bugs in the code";
        String expectedResult = "false";
        String actualResult = new StringMethods().countJava(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void test_InsertQuotes_toSentences() {
        String sentence1 = "The author writes";
        String sentence2 = "Must love life more than the meaning of life.";
        String expectedResult = "\"The author writes: \"Must love life more than the meaning of life.\"";
        String actualResult = new StringMethods().insertQuotes(sentence1, sentence2);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void test_InsertQuotesInQuotes_toSentences() {
        String sentence1 = "Napoleon Bonaparte wrote";
        String sentence2 = "I don't have the word «impossible» in my dictionary.";
        String expectedResult = "\"Napoleon Bonaparte wrote: \"I don't have the word \"impossible\" in my dictionary.\"";
        String actualResult = new StringMethods().insertQuotesInQuotes(sentence1, sentence2);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void test_CityUpperCaseFirstLetter() {
        String sentence = "london";
        String expectedResult = "London";
        String actualResult = new StringMethods().checkCityTitle(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void test_CityLowerCaseRestLetters() {
        String sentence = "londON";
        String expectedResult = "London";
        String actualResult = new StringMethods().checkCityTitle(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void test_IndexOfPart_FromSentence() {
        String sentence = "Abracadabra";
        String index = "b";
        String expectedResult = "bracadab";
        String actualResult = new StringMethods().indexOf(sentence, index);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void test_IndexOfPart_ByDoubleLetter_FromSentence() {
        String sentence = "Whippersnapper";
        String index = "p";
        String expectedResult = "ppersnapp";
        String actualResult = new StringMethods().indexOf(sentence, index);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void test_First_And_Last_LettersEqual() {
        String sentence = "Abracadabra";
        String expectedResult = "true";
        String actualResult = new StringMethods().checkFirstAndLastLetter(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void test_First_And_Last_Letters_Not_Equal() {
        String sentence = "Whippersnapper";
        String expectedResult = "false";
        String actualResult = new StringMethods().checkFirstAndLastLetter(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testTakeSecondWordFromSentence() {
        String sentence = "Range Rover";
        String expectedResult = "Rover";
        String actualResult = new StringMethods().takeSecondWord(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemoveBetweenTwoIndexesFromSentence() {
        String sentence = "Range rover";
        int index1 = 1;
        int index2 = 7;
        String expectedResult = "Rover";
        String actualResult = new StringMethods().RemoveBetweenTwoIndexesFromSentence(sentence,index1, index2);
        Assert.assertEquals(actualResult,expectedResult);
    }


    @Test
    public void testSplitSentence() {
        String sentence = "Apple pie for Everyone";
        String[] expectedResult = {"Apple","pie","for","Everyone"};
        String[] actualResult = new StringMethods().splitSentence(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testSplitSentence_And_AddText() {
        String sentence = "Emily Edward Dickinson";
        String expectedResult = "Name: Emily\n" + "Middle Name: Edward\n" + "Last Name: Dickinson";
        String actualResult = new StringMethods().splitSentenceAndAddText(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRepeatText() {
        String sentence = "one";
        int n = 5;
        String expectedResult = "oneoneoneoneone";
        String actualResult = new StringMethods().repeatText(sentence, n);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testIgnoreCaseText() {
        String sentence1 = "one";
        String sentence2 = "One";
        String sentence3= "ONE";
        boolean expectedResult = true;
        boolean actualResult = new StringMethods().checkWordsSentence(sentence1, sentence2, sentence3);
        Assert.assertEquals(actualResult,expectedResult);
    }






}
