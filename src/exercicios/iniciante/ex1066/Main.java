package exercicios.iniciante.ex1066;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Locale.setDefault(Locale.US);
		int[] a = new int[5];
		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = leia.nextInt();
		}
		leia.close();
		
		int par = 0;
		int pos = 0;
		int zero = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == 0){
				zero ++;
			}
			else{
				if(a[i] > 0){
					pos ++;
				}
			}
			if(a[i] % 2 == 0){
				par ++;
			}
		}
		System.out.println(par + " valor(es) par(es)\n" +
				(a.length - par) + " valor(es) impar(es)\n" +
				pos + " valor(es) positivo(s)\n" +
				(a.length - pos - zero) + " valor(es) negativo(s)"); 
	}
}