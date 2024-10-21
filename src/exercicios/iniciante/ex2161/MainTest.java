package exercicios.iniciante.ex2161;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		assertEquals("YES", Main.execute("Fulano de Tal"));
		assertEquals("NO", Main.execute(
				"Pedro de Alcantara Francisco Antonio Joao Carlos Xavier de Paula Miguel Rafael Joaquim Jose Gonzaga Pascoal Cipriano Serafim"));
	}
}
