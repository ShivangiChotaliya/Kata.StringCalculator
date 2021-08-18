
package StringCalculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class StringCalculatorTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}

	//  when string is empty, return 0  
 	@Test
    public final void emptyStringReturnZero() {
        // for empty String return 0
            Assert.assertEquals(0, StringCalculator.add(""));
    }  
	 
 	// one number
	@Test
	public final void oneNumberReturnNumber() {
	         Assert.assertEquals(5, StringCalculator.add("5"));
	}
	 
 
	// add alphabets throws error
    @Test(expected = RuntimeException.class)
    public final void nonNumberOneAlphabet() {
             StringCalculator.add("P");
    }

    // add two alphabets throws error
    @Test(expected = RuntimeException.class)
    public final void nonNumberTwoAlphabet() {
             StringCalculator.add("P,S");
    }

    // allow two numbers and return sum
    @Test
    public final void twoNumbersReturnSum() {
        Assert.assertEquals(8+20,StringCalculator.add("8,20"));
    }
    
    // Add numbers
    @Test
    public final void threeNumbersReturnSum() {
        Assert.assertEquals(1+2+2,StringCalculator.add("1,2,2"));
    }
    
    // add more than 2 numbers  
    @Test
    public final void moreThanTwoNumbers() {
        StringCalculator.add("0,99,18");
    }

    // add alaphabets with two numbers throws error
    @Test(expected = RuntimeException.class)
    public final void moreThanTwoNumbersAndOneNonNumber() {
        StringCalculator.add("2,88,A");
    }

    // allow  unknown amount of numbers
    @Test
       public final void anyNumbers() {
           Assert.assertEquals(7+35+50+6+81+90, StringCalculator.add("7,35,50,6,81,90"));
    }
    
    // allow  space before and after number
    @Test
       public final void allowSpaceBeforeAndAfterNumber() {
           Assert.assertEquals(7+35, StringCalculator.add(" 7,35"));
    }
    
    // allow newline insted of comma
    @Test
    public final void allowNewLine() {
           Assert.assertEquals(1+2+3, StringCalculator.add("1\n2,3"));
    }

    // allow newline   
    @Test
    public final void allowNewLineExTwo() {
           Assert.assertEquals(1+2+3, StringCalculator.add("1,2\n,3"));
    }

    // allow newline   
    @Test
    public final void allowNewLineExThree() {
           Assert.assertEquals(1+2+3, StringCalculator.add("1,2\n,3\n"));
    }
  
    // allow different delimiters
    @Test
    public final void allowDiffrentDelimiter() {
           Assert.assertEquals(1+2+3, StringCalculator.add("1;2\n;3;"));
    }

    // allow delimiter like ;
     @Test
    public final void allowDiffrentDelimiterTwo() {
           Assert.assertEquals(1+2+3, StringCalculator.add("1;2\n;3;"));
    }

     //  allow different delimiters to when String starts with //
     @Test
     public final void allowDiffrentDelimiterTwoWithDoubleSlash() {
            Assert.assertEquals(2, StringCalculator.add("//;\n;2"));
     }

 
     @Test
     public final void allowDiffrentDelimiterTwoWithDoubleSlashTwo() {
            Assert.assertEquals(150, StringCalculator.add("//;\n50;50;50"));
     }
     
     // 5th problem   
     @Test(expected = RuntimeException.class)
 	public final void negativeNumberNotAllowSoExceptionIsThrown() {
 		StringCalculator.add("10,-2");
 	}

 	@Test
 	public final void negativeNumberNotAllowSoExceptionIsThrownExampleTwo(){
 		RuntimeException exception = null;
 		try {
 			StringCalculator.add("75,-45,19,-20,0,5");
 		} catch (RuntimeException e) {
 			exception = e;
 		}
 		Assert.assertNotNull(exception);
 		Assert.assertEquals("Negatives not allowed: [-45, -20]", exception.getMessage());
 	}
 	
 	 // number which is greater than 1000 is ignored 
 	 @Test
     public final void numbersGreaterThan1000IsUsedThenItIsNotIncludedInSum() {
             Assert.assertEquals(4+1000+5, StringCalculator.add("4,1200,1000,5,2333"));
     }
 	 
 	 @Test
     public final void numbersGreaterThan1000IsUsedThenItIsNotIncludedInSumExTwo() {
             Assert.assertEquals(0, StringCalculator.add("1200,"));
     }
 	 
 	// allow delimiter with format: “//[delimiter]\n”
     //  for example: “//[***]\n1***2***3”    
     @Test
     public final void delimiterExample() {
             Assert.assertEquals(1+2+3, StringCalculator.add("//[***]\n1***2***3"));
     }


     @Test
     public final void delimiterExampleOne() {
             Assert.assertEquals(4+20+6, StringCalculator.add("//**;[***]\n4,***20**6"));
     }

   //Allow multiple delimiters like this: “//[delim1][delim2]\n”
     @Test
     public final void delimiteWithPercentageAddedExampleOne() {
             Assert.assertEquals(1+2+3, StringCalculator.add("//[*][%]\n1*2%3"));
     }

     @Test
     public final void delimiterWithPercentageAddedExampleTwo() {
             Assert.assertEquals(1+2+3, StringCalculator.add("//[*][***][*][%][%][%][%]\n1*2%3"));
     }
     
     // handle multiple delimiters with length longer than one char
     @Test
     public final void handleMultipleCharacterWithLengthLongExampleOne() {
             Assert.assertEquals(1+2+3, StringCalculator.add("//[**][%%]\n1**2%%3 "));
     }


     @Test
     public final void handleMultipleCharacterWithLengthLongEXampleTwo() {
             Assert.assertEquals(1+2+3, StringCalculator.add("//;;;[,,,][**]\n1**2%%3 "));
     }
     
     @Test
     public final void handleMultipleCharacterWithLengthLongEXampleThree() {
             Assert.assertEquals(1+2+3, StringCalculator.add("//\n\n\n[,,,*][];;[%%%];;;;[**]\n1**2%%3 "));
     }
}
