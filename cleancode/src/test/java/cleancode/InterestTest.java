package cleancode;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Test;
public class InterestTest {

	@Test
	public void testSimpleinterest() {
		 Interest c=new  Interest();
		assertEquals(24000.00,c.Simpleinterest(100000.00, 6, 4),0);
	}

	@Test
	public void testCompoundinterest() 
	{
		 Interest c=new  Interest();
		assertEquals(156000.00,c.Compoundinterest(150000,4,1),0);
		
	}

}