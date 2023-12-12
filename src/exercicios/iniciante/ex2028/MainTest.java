package exercicios.iniciante.ex2028;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		assertEquals(Map.of(1l, "0"), Main.execute(0));
		assertEquals(Map.of(2l, "0 1"), Main.execute(1));
		assertEquals(Map.of(4l, "0 1 2 2"), Main.execute(2));
		assertEquals(Map.of(7l, "0 1 2 2 3 3 3"), Main.execute(3));
	}

}
