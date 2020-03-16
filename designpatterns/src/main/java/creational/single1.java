package creational;
import static org.junit.Assert.*;

import org.junit.Test;

public class single1 {
	@Test
	public void testShowMessage() 
	{
		main m=new main();
		assertEquals("I'm a singleton object!",m.main());
		single s=new single();
		assertEquals("I'm a singleton object!",s.showMessage());
	}

}
