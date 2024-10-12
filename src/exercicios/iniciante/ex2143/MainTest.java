package exercicios.iniciante.ex2143;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		assertEquals(25, Main.execute(13));
		assertEquals(73, Main.execute(37));
		assertEquals(97, Main.execute(49));
		assertEquals(21, Main.execute(11));
		assertEquals(17, Main.execute(9));
		assertEquals(9, Main.execute(5));
		assertEquals(33, Main.execute(17));
	}
}
