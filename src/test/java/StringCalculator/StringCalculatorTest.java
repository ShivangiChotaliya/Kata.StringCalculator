
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
    
    // if more then two numbers then expected error
    @Test(expected = RuntimeException.class)
    public final void threeNumbersReturnSum() {
        Assert.assertEquals(1+2+2,StringCalculator.add("1,2,2"));
    }
}
