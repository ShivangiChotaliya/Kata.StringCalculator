
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
	 
 
}
