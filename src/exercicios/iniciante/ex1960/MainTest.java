package exercicios.iniciante.ex1960;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		assertEquals("I", Main.execute((short) 1));
		assertEquals("V", Main.execute((short) 5));
		assertEquals("X", Main.execute((short) 10));
		assertEquals("L", Main.execute((short) 50));
		assertEquals("C", Main.execute((short) 100));
		assertEquals("D", Main.execute((short) 500));
		assertEquals("M", Main.execute((short) 1000));
		assertEquals("DCLXVI", Main.execute((short) 666));
		assertEquals("LXXXIII", Main.execute((short) 83));
		assertEquals("CMXCIX", Main.execute((short) 999));
	}

}
