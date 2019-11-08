import org.junit.*;
import org.junit.Test;
import sun.text.normalizer.RangeValueIterator;

import javax.swing.*;
import java.lang.*;
import java.util.Arrays;
import java.util.Random;


public class LetterTest {
    @Test
    public void TestComputerLetter() {

        int testLetter[] = new int[25];
        for (int i = 65, j = 0; i < 90; i++, j++) {
            testLetter[j] = i;
        }

        for (int i = 0; i < testLetter.length; i++) {
            if (Letter.ComputerLetter() == (char) testLetter[i]) {
                System.out.println("The method ComputerLetter is correct");
            }

        }

    }

    @Test
    public void TestLenghtString()
    {
        String incorrectStr = "ABC";
        String correctStr = "A";
      /*  if(Letter.CheckLengthString(str)) {
            System.out.println("it's working wrong");
        }else System.out.println("The method LengthString is correct");*/
      Assert.assertFalse(Letter.CheckLengthString(incorrectStr));
      Assert.assertTrue(Letter.CheckLengthString(correctStr));

    }

    @Test
    public void TestCompareLetter()
    {
       Assert.assertTrue(Letter.CompareLetter(4,4));
       Assert.assertFalse(Letter.CompareLetter(4,1));
    }

    @Test
    public void TestLowHightLetter() {
        Assert.assertTrue(Letter.LowHightLetter(10,7));
        Assert.assertFalse(Letter.LowHightLetter(3,5));
    }

}