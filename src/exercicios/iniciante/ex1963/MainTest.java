package exercicios.iniciante.ex1963;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		assertEquals("50.00%", Main.execute(20, 30));
		assertEquals("100.00%", Main.execute(50, 100));
		assertEquals("0.00%", Main.execute(10, 10));
		assertEquals("14.29%", Main.execute(7, 8));
		assertEquals("-7.94%", Main.execute(15.75f, 14.5f));
	}

}
