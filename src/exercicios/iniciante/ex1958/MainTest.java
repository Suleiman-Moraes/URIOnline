package exercicios.iniciante.ex1958;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		assertEquals("+3.1416E+00", Main.execute("3.141592"));
		assertEquals("+1.6180E+00", Main.execute("1.618033"));
		assertEquals("+6.0221E+23", Main.execute("602214085774747474747474"));
		assertEquals("-2.7000E-05", Main.execute("-0.000027"));
		assertEquals("-1.0000E+100", Main.execute("-10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"));
	}

}
