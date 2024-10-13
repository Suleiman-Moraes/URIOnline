package exercicios.iniciante.ex2146;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		assertEquals(1233, Main.execute(1234));
		assertEquals(1999, Main.execute(2000));
		assertEquals(1000, Main.execute(1001));
		assertEquals(9998, Main.execute(9999));
	}
}
