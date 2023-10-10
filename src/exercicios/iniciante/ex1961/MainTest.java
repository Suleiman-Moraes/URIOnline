package exercicios.iniciante.ex1961;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		final byte[] vet1 = { 1, 3, 6, 9, 7, 2, 4, 5, 8, 3 };
		assertEquals("YOU WIN", Main.execute((byte) 5, vet1));

		final byte[] vet2 = { 2, 2 };
		assertEquals("YOU WIN", Main.execute((byte) 1, vet2));
		
		final byte[] vet3 = { 1, 3 };
		assertEquals("GAME OVER", Main.execute((byte) 1, vet3));
		
		final byte[] vet4 = { 2, 4, 2, 3, 2 };
		assertEquals("YOU WIN", Main.execute((byte) 2, vet4));
		
		final byte[] vet5 = { 2, 4, 2, 3, 2, 5 };
		assertEquals("GAME OVER", Main.execute((byte) 2, vet5));

		final byte[] vet6 = { 2, 4, 2, 3, 4, 5, 2 };
		assertEquals("GAME OVER", Main.execute((byte) 2, vet6));
	}

}
