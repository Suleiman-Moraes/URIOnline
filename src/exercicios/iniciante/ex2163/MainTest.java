package exercicios.iniciante.ex2163;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testExecute() {
        int[][] matrix1 = {
            {7, 7, 7, 7, 7},
            {7, 42, 7, 7, 7},
            {7, 7, 7, 7, 7},
            {7, 7, 7, 7, 7}
        };
        assertEquals("2 2", Main.execute(matrix1));

        int[][] matrix2 = {
            {7, 7, 7, 7},
            {7, 42, 7, 7},
            {7, 7, 7, 7},
            {7, 7, 7, 7}
        };
        assertEquals("2 2", Main.execute(matrix2));

        int[][] matrix3 = {
            {7, 7, 7, 7},
            {7, 7, 7, 7},
            {7, 7, 7, 7},
            {7, 7, 42, 7}
        };
        assertEquals("0 0", Main.execute(matrix3));
        

        int[][] matrix4 = {
            {7, 7, 7, 7},
            {7, 8, 7, 7},
            {7, 7, 7, 7},
            {7, 7, 7, 7}
        };
        assertEquals("0 0", Main.execute(matrix4));

        int[][] matrix5 = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix5[i][j] = 7;
            }
        }
        matrix5[5][5] = 42;
        assertEquals("6 6", Main.execute(matrix5));

        int[][] matrix6 = {
            {8, 8, 8, 8, 8},
            {8, 42, 8, 8, 8},
            {8, 8, 8, 8, 8},
            {8, 8, 8, 8, 8}
        };
        assertEquals("0 0", Main.execute(matrix6));
	}
}
