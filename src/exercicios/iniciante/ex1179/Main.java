package exercicios.iniciante.ex1179;

import java.util.Scanner;

public class Main {
	
	private static StringBuilder tudo = new StringBuilder("");
	
	public static void main(String[] args) {
//		NumberFormat dec =s new DecimalFormat("#0.0000");
//		Locale.setDefault(Locale.US);
		int[]par = new int[5];
		int[]impar = new int[5];
//		StringBuilder tudo = new StringBuilder("");
		Scanner leia = new Scanner(System.in);
		
		int imp = 0;
		int pa = 0;
		for (int i = 0; i < 15; i++) {
			int x = leia.nextInt();
			
			if(x % 2 == 0){
				par[pa] = x;
				pa ++;
				if(pa == 5){
					imprimirVetor("par", par, par.length);
					par = new int[5];
					pa = 0;
				}
			}
			else{
				impar[imp] = x;
				imp ++;
				if(imp == 5){
					imprimirVetor("impar", impar, impar.length);
					impar = new int[5];
					imp = 0;
				}
			}
		}
		leia.close();
		imprimirVetor("impar", impar, imp);
		imprimirVetor("par", par, pa);
		System.out.print(tudo);
	}
	
	private static void imprimirVetor(String indent, int[] vet, int length) {
		for (int i = 0; i < length; i++) {
			tudo.append(indent).append("[").append(i).append("] = ").append(vet[i]).append("\n");
		}
	}
}