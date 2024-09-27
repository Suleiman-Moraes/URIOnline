package exercicios.iniciante.ex2060;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		// Teste 1: Verifica se o número 2 atualiza corretamente o mapa
		final String map1 = Main.execute(Main.initMap(), 2);
		assertEquals("{2=1, 3=0, 4=0, 5=0}", map1.toString());

		// Teste 2: Verifica se o número 3 atualiza corretamente o mapa
		final String map2 = Main.execute(Main.initMap(), 3);
		assertEquals("{2=0, 3=1, 4=0, 5=0}", map2.toString());

		// Teste 3: Verifica se o número 4 atualiza corretamente o mapa
		final String map3 = Main.execute(Main.initMap(), 4);
		assertEquals("{2=1, 3=0, 4=1, 5=0}", map3.toString());

		// Teste 4: Verifica se o número 5 atualiza corretamente o mapa
		final String map4 = Main.execute(Main.initMap(), 5);
		assertEquals("{2=0, 3=0, 4=0, 5=1}", map4.toString());

		// Teste 5: Verifica uma lista com múltiplos de vários números
		Map<Integer, Integer> map5 = Main.initMap();
		int[] numbers = { 2, 3, 4, 5, 6, 10, 12, 15 };
		for (int number : numbers) {
			Main.execute(map5, number);
		}
		assertEquals("{2=5, 3=4, 4=2, 5=3}", map5.toString());
	}

}
