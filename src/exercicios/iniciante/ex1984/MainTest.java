package exercicios.iniciante.ex1984;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		assertEquals("4321", Main.execute("1234"));
		assertEquals("0123456789", Main.execute("9876543210"));
		assertEquals("21", Main.execute("12"));
		assertEquals("8999999999", Main.execute("9999999998"));
	}

}
