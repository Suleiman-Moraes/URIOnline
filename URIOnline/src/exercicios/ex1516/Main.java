package exercicios.ex1516;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b, n = 1, m = 0;
		Scanner leia = new Scanner(System.in);
		n = leia.nextInt();
		m = leia.nextInt();
		
		do{
			
			String[] vet = new String[n]; 
			leia.nextLine();
			for (int i = 0; i < n; i++) {
				vet[i] = leia.nextLine();
			}
			
			a = leia.nextInt();
			b = leia.nextInt();
//			leia.nextLine();
//			leia.nextLine();
			
			String[] veto = new String[a];
			
			for (int i = 0; i < n; i++) {
				vet[i] = clonar(vet[i], (b/m));
			}
			
			int cont = 0;
			for (int i = 0; i < vet.length; i ++) {
				String[] aux = clonarLinha(vet[i], (a/n));
				for (int j = 0; j < aux.length; j++) {
					veto[cont] = aux[j];
					cont ++;
				}
			}
			
			for (int i = 0; i < veto.length; i++) {
				System.out.println(veto[i]);
			}
			System.out.println();
			
			n = leia.nextInt();
			m = leia.nextInt();
		}while(n + m != 0);
		leia.close();
	}
	
	public static String clonar(String x, int c){
		String y = "";
		for (int i = 0; i < x.length(); i++) {
			for (int j = 0; j < c; j++) {
				y += x.charAt(i);
			}
		}
		return y;
	}
	
	public static String[] clonarLinha(String x, int v){
		String vet[] = new String[v];
		for (int i = 0; i < vet.length; i++) {
			vet[i] = x;
		}
		return vet;
	}
}