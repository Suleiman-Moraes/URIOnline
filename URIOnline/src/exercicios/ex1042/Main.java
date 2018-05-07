package exercicios.ex1042;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b, c;
		Scanner leia = new Scanner(System.in);
		a = leia.nextInt();
		b = leia.nextInt();
		c = leia.nextInt();
		leia.close();
		String tudo = "\n"+a+"\n"+b+"\n"+c;
		if(a > b){
			int aux = a;
			a = b;
			b = aux;
		}if(b > c){
			int aux = b;
			b = c;
			c = aux;
		}if(a > b){
			int aux = a;
			a = b;
			b = aux;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(tudo);
	}
}