package exercicios.iniciante.ex2159;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		assertEquals("6.0 7.5", Main.execute(17));
		assertEquals("12.8 16.0", Main.execute(50));
		assertEquals("21.7 27.3", Main.execute(100));
	}
}
