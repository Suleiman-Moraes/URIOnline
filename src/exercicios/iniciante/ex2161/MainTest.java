package exercicios.iniciante.ex2161;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		assertEquals("3.0000000000", Main.execute(0));
		assertEquals("3.1666666667", Main.execute(1));
		assertEquals("3.1622776623", Main.execute(5));
	}
}
