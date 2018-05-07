package exercicios.ex1051;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float a;
		Scanner leia = new Scanner(System.in);
		a = leia.nextFloat();
		leia.close();
		
		float x = 0;
		
		if(a <= 2000.00) System.out.println("Isento");
		else{
			a = a - 2000;
			if(a <= 1000.00){
				x = (float) (x + (a * 0.08));
			}
			else{
				a = a - 1000;
				x = (float) (x + (1000.00 * 0.08));
				
				if(a <= 1500.00){
					x = (float) (x + (a * 0.18));
				}
				else{
					a = a - 1500;
					x = (float) (x + (1500.00 * 0.18));
					
					if(a > 0){
						x = (float) (x + (a * 0.28));
					}
				}
			}
			System.out.printf("R$ %.2f\n", x);
		}
		
		
	}
}