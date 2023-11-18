package exercicios.iniciante.ex1985;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		assertEquals("19.50", Main.execute(Map.of((short) 1001, 2, (short) 1005, 3)));
		assertEquals("1750.00", Main.execute(Map.of((short) 1003, 500)));
		assertEquals("2808.50", Main.execute(
				Map.of((short) 1001, 500, (short) 1005, 300, (short) 1003, 23, (short) 1002, 52, (short) 1004, 44)));
	}

}
