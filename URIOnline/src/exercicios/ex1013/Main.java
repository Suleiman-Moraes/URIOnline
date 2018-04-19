package exercicios.ex1013;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String entrada = leia.nextLine();
		String vet[] = entrada.replaceAll(" ", "#").split("#");
		int[] veto = new int[vet.length];
		for (int i = 0; i < vet.length; i++) {
			veto[i] = Integer.parseInt(vet[i]);
		}
		int resultado = (veto[0] + veto[1] + Math.abs(veto[0] - veto[1])) / 2;
		resultado = (resultado + veto[2] + Math.abs(resultado - veto[2])) / 2;
		System.out.println(resultado + " eh o maior");
		leia.close();
	}
}