package exercicios.iniciante.ex2029;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		assertEquals("ALTURA = 2.96\nAREA = 490.62", Main.execute(1450.0, 25.0));
		assertEquals("ALTURA = 0.61\nAREA = 1256.00", Main.execute(760.0, 40.0));
		assertEquals("ALTURA = 42.46\nAREA = 176.62", Main.execute(7500.0, 15.0));
	}

}
