package exercicios.iniciante.ex2164;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		assertEquals("1.0", Main.execute(1));
		assertEquals("1.0", Main.execute(2));
		assertEquals("2.0", Main.execute(3));
		
	    assertEquals("3.0", Main.execute(4));
	    assertEquals("5.0", Main.execute(5));
	    assertEquals("8.0", Main.execute(6));
	    assertEquals("13.0", Main.execute(7));
	    assertEquals("21.0", Main.execute(8));
	    assertEquals("34.0", Main.execute(9));
	    assertEquals("55.0", Main.execute(10));

	    assertEquals("144.0", Main.execute(12));
	    assertEquals("987.0", Main.execute(16));
	    assertEquals("10946.0", Main.execute(21));
	    assertEquals("75025.0", Main.execute(25));
	    
	    assertEquals("12586269025.0", Main.execute(50));
	}// 1 1 2 3 5
}
