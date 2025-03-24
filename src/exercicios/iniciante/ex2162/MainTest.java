package exercicios.iniciante.ex2162;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		assertEquals("1", Main.execute(new int[]{1, 4, -2}));
		assertEquals("1", Main.execute(new int[]{100, 99, 112, -8, -7}));
		assertEquals("0", Main.execute(new int[]{1, 2, 2, 1}));
	}
}
