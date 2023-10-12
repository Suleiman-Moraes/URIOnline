package exercicios.iniciante.ex1973;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		final int[] stars1 = { 1, 3, 5, 7, 11, 13, 17, 19 };
		assertEquals("8 68", Main.execute(stars1, 76));

		final int[] vet2 = { 1, 3, 5, 7, 11, 13, 16, 19 };
		assertEquals("7 63", Main.execute(vet2, 75));

		final int[] stars6 = { 1000001, 2000001, 3000001, 4000001, 5000001 };
		assertEquals("5 15000000", Main.execute(stars6, 15000005));
	}

}
