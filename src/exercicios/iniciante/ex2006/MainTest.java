package exercicios.iniciante.ex2006;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		assertEquals("2", Main.execute(1, List.of(1, 2, 3, 2, 1).stream().toArray(Integer[]::new)));
		assertEquals("0", Main.execute(3, List.of(4, 1, 1, 2, 1).stream().toArray(Integer[]::new)));
	}

}
