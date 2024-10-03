package exercicios.iniciante.ex2059;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
	    // Caso onde o jogador 1 escolhe �mpar e n�o rouba, o jogador 2 n�o acusa, e a soma � �mpar
	    assertEquals("Jogador 1 ganha!", Main.execute(0, 3, 4, 0, 0));

	    // Caso onde o jogador 1 escolhe �mpar e n�o rouba, o jogador 2 n�o acusa, e a soma � par
	    assertEquals("Jogador 2 ganha!", Main.execute(0, 2, 4, 0, 0));

	    // Caso onde o jogador 1 rouba e o jogador 2 acusa
	    assertEquals("Jogador 2 ganha!", Main.execute(1, 5, 6, 1, 1));

	    // Caso onde o jogador 1 rouba e o jogador 2 n�o acusa
	    assertEquals("Jogador 1 ganha!", Main.execute(1, 5, 6, 1, 0));

	    // Caso onde o jogador 1 n�o rouba e o jogador 2 acusa incorretamente
	    assertEquals("Jogador 1 ganha!", Main.execute(1, 6, 2, 0, 1));

	    // Caso onde o jogador 1 escolhe par e a soma � par, sem roubo ou acusa��o
	    assertEquals("Jogador 1 ganha!", Main.execute(1, 2, 4, 0, 0));

	    // Caso onde o jogador 1 escolhe par, mas a soma � �mpar, sem roubo ou acusa��o
	    assertEquals("Jogador 2 ganha!", Main.execute(1, 3, 4, 0, 0));

	    // Caso extremo onde ambos jogadores escolhem os n�meros mais altos (100), sem roubo ou acusa��o, e a soma � par
	    assertEquals("Jogador 1 ganha!", Main.execute(1, 100, 100, 0, 0));

	    // Caso extremo onde ambos jogadores escolhem os n�meros mais altos (100), sem roubo ou acusa��o, e a soma � �mpar
	    assertEquals("Jogador 1 ganha!", Main.execute(0, 99, 100, 0, 0));
	}


}
