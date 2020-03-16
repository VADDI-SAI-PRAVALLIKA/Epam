package structural2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class test {
	@Test
	public void test() {
		Bridge B=new Bridge();
		assertEquals("Drawing Circle[ color: red, radius: 10, x: 100, 100]",B.test1());
	}
	@Test
	public void test1() {
		Bridge B1=new Bridge();
		assertEquals("Drawing Circle[ color: green, radius: 10, x: 100, 100]",B1.test2());
	}

}
