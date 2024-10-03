package exercicios.iniciante.ex2139;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		assertEquals("E vespera de natal!", Main.execute(12, 24));
		assertEquals("Faltam 31 dias para o natal!", Main.execute(11, 24));
		assertEquals("Ja passou!", Main.execute(12, 29));
		assertEquals("Faltam 355 dias para o natal!", Main.execute(1, 5));
		assertEquals("E natal!", Main.execute(12, 25));
	}

}
