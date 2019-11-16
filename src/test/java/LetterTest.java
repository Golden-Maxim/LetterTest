import org.junit.*;
import org.junit.Test;
import sun.text.normalizer.RangeValueIterator;

import javax.swing.*;
import java.lang.*;
import java.util.Arrays;
import java.util.Random;


public class LetterTest {
    @Test
    public void testComputerLetter() {

        int testLetter[] = new int[25];
        for (int i = 65, j = 0; i < 90; i++, j++) {
            testLetter[j] = i;
        }

        for (int i = 0; i < testLetter.length; i++) {
            if (Letter.computerLetter() == (char) testLetter[i]) {
                System.out.println("The method ComputerLetter is correct");
            }

        }

    }

    @Test
    public void testLenghtString()
    {
        String incorrectStr = "ABC";
        String correctStr = "A";
      Assert.assertFalse(Letter.checkLengthString(incorrectStr));
      Assert.assertTrue(Letter.checkLengthString(correctStr));

    }

    @Test
    public void testCompareLetter()
    {
       Assert.assertTrue(Letter.compareLetter(4,4));
       Assert.assertFalse(Letter.compareLetter(4,1));
    }

    @Test
    public void testLowHightLetter() {
        Assert.assertTrue(Letter.lowHightLetter(10,7));
        Assert.assertFalse(Letter.lowHightLetter(3,5));

    }



}