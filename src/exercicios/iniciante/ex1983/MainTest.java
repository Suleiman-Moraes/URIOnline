package exercicios.iniciante.ex1983;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		final String[] enrolls = { "1000", "1001", "1002" };
		final float[] notes = { 5, 10, 6 };
		assertEquals("1001", Main.execute(enrolls, notes));

		final String[] enrolls2 = { "900775", "201553", "5032", "2088" };
		final float[] notes2 = { 5.7f, 7.9f, 6.2f, 2.1f };
		assertEquals("Minimum note not reached", Main.execute(enrolls2, notes2));

		final String[] enrolls3 = { "900775", "999999", "10022", "441002" };
		final float[] notes3 = { 9.4f, 9.9f, 9.7f, 9.8f };
		assertEquals("999999", Main.execute(enrolls3, notes3));
	}

}
