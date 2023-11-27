package exercicios.iniciante.ex2003;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		assertEquals("Atraso maximo: 10", Main.execute("7:10"));
		assertEquals("Atraso maximo: 0", Main.execute("5:00"));
		assertEquals("Atraso maximo: 120", Main.execute("9:00"));
	}

}
