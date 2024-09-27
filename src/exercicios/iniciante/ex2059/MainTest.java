package exercicios.iniciante.ex2059;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
	    // Caso onde o jogador 1 escolhe ímpar e não rouba, o jogador 2 não acusa, e a soma é ímpar
	    assertEquals("Jogador 1 ganha!", Main.execute(0, 3, 4, 0, 0));

	    // Caso onde o jogador 1 escolhe ímpar e não rouba, o jogador 2 não acusa, e a soma é par
	    assertEquals("Jogador 2 ganha!", Main.execute(0, 2, 4, 0, 0));

	    // Caso onde o jogador 1 rouba e o jogador 2 acusa
	    assertEquals("Jogador 2 ganha!", Main.execute(1, 5, 6, 1, 1));

	    // Caso onde o jogador 1 rouba e o jogador 2 não acusa
	    assertEquals("Jogador 1 ganha!", Main.execute(1, 5, 6, 1, 0));

	    // Caso onde o jogador 1 não rouba e o jogador 2 acusa incorretamente
	    assertEquals("Jogador 1 ganha!", Main.execute(1, 6, 2, 0, 1));

	    // Caso onde o jogador 1 escolhe par e a soma é par, sem roubo ou acusação
	    assertEquals("Jogador 1 ganha!", Main.execute(1, 2, 4, 0, 0));

	    // Caso onde o jogador 1 escolhe par, mas a soma é ímpar, sem roubo ou acusação
	    assertEquals("Jogador 2 ganha!", Main.execute(1, 3, 4, 0, 0));

	    // Caso extremo onde ambos jogadores escolhem os números mais altos (100), sem roubo ou acusação, e a soma é par
	    assertEquals("Jogador 1 ganha!", Main.execute(1, 100, 100, 0, 0));

	    // Caso extremo onde ambos jogadores escolhem os números mais altos (100), sem roubo ou acusação, e a soma é ímpar
	    assertEquals("Jogador 1 ganha!", Main.execute(0, 99, 100, 0, 0));
	}


}
