package exercicios.iniciante.ex1959;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		assertEquals("3", Main.execute(3, (short) 1));
		assertEquals("72", Main.execute(9, (short) 8));
		assertEquals("1000000000", Main.execute(1000000, (short) 1000));
		assertEquals("4000000000", Main.execute(1000000, (short) 4000));
	}

}
