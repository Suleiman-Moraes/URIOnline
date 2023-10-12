package exercicios.iniciante.ex1962;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		assertEquals("7986 A.C.", Main.execute(10000));
		assertEquals("2000 D.C.", Main.execute(15));
		assertEquals("1 A.C.", Main.execute(2015));
		assertEquals("2015 D.C.", Main.execute(0));
		assertEquals("2147481633 A.C.", Main.execute(2147483647));
	}

}
