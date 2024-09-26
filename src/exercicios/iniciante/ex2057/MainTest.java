package exercicios.iniciante.ex2057;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		assertEquals("20", Main.execute(10, 7, 3));
		assertEquals("2", Main.execute(22, 6, -2));
		assertEquals("23", Main.execute(0, 3, -4));

		assertEquals("15", Main.execute(10, 5, 0)); // Caso básico
		assertEquals("20", Main.execute(10, 7, 3)); // Fuso positivo
		assertEquals("2", Main.execute(22, 6, -2)); // Fuso negativo
		assertEquals("0", Main.execute(23, 1, 0)); // Exatamente 24
		assertEquals("0", Main.execute(0, 24, 0)); // Múltiplo de 24
		assertEquals("10", Main.execute(18, 12, 4)); // Viagem longa
		assertEquals("23", Main.execute(3, 1, -5)); // Ajuste negativo extremo
		assertEquals("21", Main.execute(0, 2, -5)); // Limite inferior de fuso
		assertEquals("16", Main.execute(23, 12, 5)); // Tempo de viagem máximo
		assertEquals("17", Main.execute(7, 5, 5)); // Fuso igual ao tempo de viagem
	}

}
