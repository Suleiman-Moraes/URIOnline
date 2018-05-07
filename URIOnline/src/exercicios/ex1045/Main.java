package exercicios.ex1045;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float a, b, c;
		Scanner leia = new Scanner(System.in);
		a = leia.nextFloat();
		b = leia.nextFloat();
		c = leia.nextFloat();
		leia.close();
		
		if(b > a){
			float aux = a;
			a = b;
			b = aux;
		}if(c > a){
			float aux = a;
			a = c;
			c = aux;
		}
		if(a >= b+c){
			System.out.println("NAO FORMA TRIANGULO");
		}else{
			if(Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))){
				System.out.println("TRIANGULO RETANGULO");
			}
			if(Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2))){
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if(Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2))){
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if(a == b && b == c){
				System.out.println("TRIANGULO EQUILATERO");
			}
			if((a == b && a != c) || (b == c && b != a) || (c == a && c != b)){
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
	}
}