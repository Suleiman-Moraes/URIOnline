package exercicios.iniciante.ex2147;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		assertEquals(0.09, Main.execute("galopeira"));
		assertEquals(0.25, Main.execute("galopeeeeeeeeeeeeeeeeeira"));
		assertEquals(0.1, Main.execute("galopeeira"));
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 400; i++) {
			builder.append("galopeeeeeeeeeeeeeeeeeira");
		}
		assertEquals(100, Main.execute(builder.toString()));
	}
}
