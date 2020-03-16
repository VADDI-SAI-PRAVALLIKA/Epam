package behavioral;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StateTest {

	@Test
	public void test() {
		StatePattern S=new StatePattern();
		assertEquals("Player is in start stateStart State",S.get());
	}
	@Test
	public void test1() {
		StatePattern S=new StatePattern();
		assertEquals("Player is in stop stateStop State",S.Stop());
	}

}
