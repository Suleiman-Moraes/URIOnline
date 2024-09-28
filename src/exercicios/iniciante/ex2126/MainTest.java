package exercicios.iniciante.ex2126;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		assertEquals("Caso #1:\nQtd.Subsequencias: 6\nPos: 27\n",
				Main.execute("78954", "7895478954789547895447895478954", 1));
		
		assertEquals("Caso #2:\nNao existe subsequencia\n", Main.execute("464133", "1331646546874694", 2));
		
		assertEquals("Caso #3:\nQtd.Subsequencias: 3\nPos: 24\n", Main.execute("12", "1231321455123214565423112", 3));
		
		 // Test case 4: N1 = "123" appears twice in N2, the last starting at position 6
	    assertEquals("Caso #4:\nQtd.Subsequencias: 2\nPos: 4\n", Main.execute("123", "123123456789", 4));

	    // Test case 5: N1 = "99" does not appear in N2, so no subsequence exists
	    assertEquals("Caso #5:\nNao existe subsequencia\n", Main.execute("99", "1234567890", 5));

	    // Test case 6: N1 = "56" appears only once in N2, starting at position 5
	    assertEquals("Caso #6:\nQtd.Subsequencias: 1\nPos: 5\n", Main.execute("56", "123456789", 6));

	    // Test case 7: N1 = "0" appears 3 times in N2, the last starting at position 10
	    assertEquals("Caso #7:\nQtd.Subsequencias: 6\nPos: 12\n", Main.execute("0", "102030405060", 7));

	    // Test case 8: N1 = "4567" appears only once in N2, starting at position 4
	    assertEquals("Caso #8:\nQtd.Subsequencias: 1\nPos: 4\n", Main.execute("4567", "1234567890", 8));

	    // Test case 9: N1 = "11" appears twice in N2, the last starting at position 15
	    assertEquals("Caso #9:\nQtd.Subsequencias: 7\nPos: 13\n", Main.execute("11", "111111111111111", 9));

	    // Test case 10: N1 = "789" appears 4 times in N2, the last starting at position 16
	    assertEquals("Caso #10:\nQtd.Subsequencias: 5\nPos: 13\n", Main.execute("789", "789789789789789", 10));
	    
	    assertEquals("Caso #11:\nNao existe subsequencia\n", Main.execute("", "", 11));
	}
}
