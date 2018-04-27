package exercicios.ex1048;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float a;
		Scanner leia = new Scanner(System.in);
		a = leia.nextFloat();
		leia.close();
		
		float r = 0;
		int p = 0;
		
		if(a <= 400.00){
			p = 15;
		}else if(a <= 800.00){
			p = 12;
		}else if(a <= 1200.00){
			p = 10;
		}else if(a <= 2000.00){
			p = 7;
		}else{
			p = 4;
		}
		
		r = (float) (p/100.0 * a);
		a = a + r;
		
		System.out.printf("Novo salario: %.2f\n", a);
		System.out.printf("Reajuste ganho: %.2f\n", r);
		System.out.println("Em percentual: " + p + " %");
	}
}