package exercicios.ex1448;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		Scanner leia = new Scanner(System.in);
		a = new Integer(leia.nextLine());

		for (int j = 0; j < a; j++) {
			String[] vet = new String[3];
			for (int i = 0; i < vet.length; i++) {
				vet[i] = leia.nextLine();
			}

			int v[] = new int[2];
			int x[] = new int[2];
			for (int i = 0; i < x.length; i++) {
				x[i] = -1;
			}
			for (int i = 0; i < vet[0].length(); i++) {
				if (i <= vet[1].length() - 1 && vet[0].charAt(i) == vet[1].charAt(i)) {
					v[0]++;
					if (x[0] == -1) {
						x[0] = i;
					}
				}
				if (i <= vet[2].length() - 1 && vet[0].charAt(i) == vet[2].charAt(i)) {
					v[1]++;
					if (x[1] == -1) {
						x[1] = i;
					}
				}

				if (x[0] == x[1]) {
					for (int k = 0; k < x.length; k++) {
						x[k] = -1;
					}
				}
			}
			System.out.println("Instancia " + (j + 1));
			if (v[0] > v[1]) {
				System.out.println("time 1");
			} else if (v[0] < v[1]) {
				System.out.println("time 2");
			} else {
				if (x[0] < x[1] && x[0] != -1) {
					System.out.println("time 1");
				} else if (x[0] > x[1] && x[1] != -1) {
					System.out.println("time 2");
				} else {
					System.out.println("empate");
				}
			}

			System.out.println("");
		}
		leia.close();
	}
}