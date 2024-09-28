package exercicios.iniciante.ex2061;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
		// Test 1: Start with 2 tabs, perform a CLICK action (should close one tab)
        assertEquals(1, Main.execute(2, Main.CLICKED));

        // Test 2: Start with 1 tab, perform a CLOSE action (should add 1 tab, resulting in 2 tabs)
        assertEquals(2, Main.execute(1, Main.CLOSED));

        // Test 3: Start with 3 tabs, perform two CLOSE actions (should add 2 tabs, ending with 5 tabs)
        int result = Main.execute(3, Main.CLOSED); // After first close: 4 tabs
        result = Main.execute(result, Main.CLOSED); // After second close: 5 tabs
        assertEquals(5, result);

        // Test 4: Start with 5 tabs, perform a CLICK action (should reduce to 4 tabs)
        assertEquals(4, Main.execute(5, Main.CLICKED));

        // Test 5: Start with 3 tabs, perform multiple mixed actions: CLOSE, CLICK, CLOSE
        result = Main.execute(3, Main.CLOSED); // After close: 4 tabs
        result = Main.execute(result, Main.CLICKED); // After click: 3 tabs
        result = Main.execute(result, Main.CLOSED); // After close: 4 tabs
        assertEquals(4, result);

        // Test 6: Edge case: Start with 1 tab, perform a CLICK action (should result in 0 tabs)
        assertEquals(0, Main.execute(1, Main.CLICKED));
	}

}
