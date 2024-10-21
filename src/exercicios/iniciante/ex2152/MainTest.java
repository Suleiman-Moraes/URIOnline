package exercicios.iniciante.ex2152;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		assertEquals("15:30 - A porta abriu!", Main.execute(15, 30, 1));
		assertEquals("23:50 - A porta fechou!", Main.execute(23, 50, 0));
		assertEquals("00:05 - A porta abriu!", Main.execute(0, 5, 1));
	}
}
