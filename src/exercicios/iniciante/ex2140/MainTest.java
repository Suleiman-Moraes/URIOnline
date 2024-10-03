package exercicios.iniciante.ex2140;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		assertEquals("possible", Main.execute(11, 23));
		assertEquals("possible", Main.execute(500, 650));
		assertEquals("impossible", Main.execute(100, 600));
		assertEquals("possible", Main.execute(9948, 9963));
		assertEquals("impossible", Main.execute(1, 2));
		assertEquals("impossible", Main.execute(2, 4));
	}

}
