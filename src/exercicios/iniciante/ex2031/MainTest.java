package exercicios.iniciante.ex2031;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		// Teste de Ataque A�reo
        assertEquals("Jogador 1 venceu", Main.execute("ataque", "papel"));  // Ataque A�reo vence Papel
        assertEquals("Jogador 1 venceu", Main.execute("ataque", "pedra"));  // Ataque A�reo vence Pedra
        assertEquals("Aniquilacao mutua", Main.execute("ataque", "ataque"));  // Ataque A�reo vs Ataque A�reo � aniquila��o m�tua
        
        // Teste de Pedra
        assertEquals("Jogador 1 venceu", Main.execute("pedra", "papel"));  // Pedra vence Papel
        assertEquals("Jogador 2 venceu", Main.execute("pedra", "ataque"));  // Ataque A�reo vence Pedra
        assertEquals("Sem ganhador", Main.execute("pedra", "pedra"));  // Pedra vs Pedra n�o tem ganhador
        
        // Teste de Papel
        assertEquals("Jogador 2 venceu", Main.execute("papel", "ataque"));  // Ataque A�reo vence Papel
        assertEquals("Jogador 2 venceu", Main.execute("papel", "pedra"));  // Pedra vence Papel
        assertEquals("Ambos venceram", Main.execute("papel", "papel"));  // Papel vs Papel, ambos vencem
	}

}
