package bathon.michael.stringlab;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/19/16.
 */
public class SpecMyStringUtils {

    MyStringUtils stringUtils;
    @Before
    public void setUp(){
        stringUtils = new MyStringUtils();
    }

    @Test
    public void testIterateArrayPlusCommas(){
        String[] testStringArr = {"Hey", "Ho", "Hi", "Sup", "Ello"};
        char[] testCharArr = {'a', 'b', 'c', 'd'};

        String expected = "a,b,c,d,";
        String actual = stringUtils.iterateArrayPlusCommas(testCharArr);

        assertEquals("Fails if it doesn't return the String array elements concatenated and separated by commas", expected, actual);
    }

    @Test
    public void testStringNewLineToArray(){
        String testString = "Hello my name is Salty Mike\nI like pork\nI want to make apps\nand live in an igloo\n\n\n\n\n\n\n\n";

        String expected = "I like pork";
        String actual = stringUtils.turnStringIntoArray(testString)[1];

        assertEquals("Fails if the method doesn't take each line and put it into an array",expected, actual);
    }

    @Test
    public void testReverseCapitalizationString(){
        String testString = "rEVERSE-cAPITALIZE eVERY wORD iN tHE sTRING aND rETURN tHE rESULT.";

        String expected = "Reverse-Capitalize Every Word In The String And Return The Result.";
        String actual = stringUtils.reverseCapitalization(testString);

        assertEquals("Fails if it doesn't make the lowercase letters uppercase and the uppercase,lower", expected, actual);

    }

    @Test
    public void testReverseTheOrderOfTheWordsInAString(){
        String testString = "Reverse, Capit,alize";

        String expected = ",esreveR ezila,tipaC";
        String actual = stringUtils.reverseTheOrderOfTheWordsInAString(testString);

        assertEquals("Fails if it doesn't reverse only the words in the string", expected, actual);
    }

    @Test
    public void testRemoveWhiteSpaceAddNewLines(){
        String testString = "Gimmie da loot";

        String expected = "Gimmie\n" +
                "da\n" +
                "loot\n";
        String actual = stringUtils.removeWhiteSpaceAddNewLines(testString);

        assertEquals("Fails if it doesn't put each new word on a new line", expected, actual);
    }

    @Test
    public void testSubstringArray(){
        String testString = "abcde";

        String[] expected = {"a", "ab", "abc", "abcd", "abcde", "b", "bc", "bcd", "bcde", "c", "cd", "cde", "d", "de", "e"};
        String[] actual = stringUtils.produceAllPossibleSubstringCombos(testString);

        assertArrayEquals("Fails if it doesn't add all the possible substrings of a string to an array", expected, actual);
    }





}
