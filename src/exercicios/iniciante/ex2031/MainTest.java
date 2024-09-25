package exercicios.iniciante.ex2031;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		// Teste de Ataque Aéreo
        assertEquals("Jogador 1 venceu", Main.execute("ataque", "papel"));  // Ataque Aéreo vence Papel
        assertEquals("Jogador 1 venceu", Main.execute("ataque", "pedra"));  // Ataque Aéreo vence Pedra
        assertEquals("Aniquilacao mutua", Main.execute("ataque", "ataque"));  // Ataque Aéreo vs Ataque Aéreo é aniquilação mútua
        
        // Teste de Pedra
        assertEquals("Jogador 1 venceu", Main.execute("pedra", "papel"));  // Pedra vence Papel
        assertEquals("Jogador 2 venceu", Main.execute("pedra", "ataque"));  // Ataque Aéreo vence Pedra
        assertEquals("Sem ganhador", Main.execute("pedra", "pedra"));  // Pedra vs Pedra não tem ganhador
        
        // Teste de Papel
        assertEquals("Jogador 2 venceu", Main.execute("papel", "ataque"));  // Ataque Aéreo vence Papel
        assertEquals("Jogador 2 venceu", Main.execute("papel", "pedra"));  // Pedra vence Papel
        assertEquals("Ambos venceram", Main.execute("papel", "papel"));  // Papel vs Papel, ambos vencem
	}

}
