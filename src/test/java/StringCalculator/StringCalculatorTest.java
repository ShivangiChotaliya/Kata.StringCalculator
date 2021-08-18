package StringCalculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}

	@Test
    public final void emptyStringReturnZero() {
        // for empty String retun 0
            Assert.assertEquals(0, StringCalculator.add(""));
    }  
}
