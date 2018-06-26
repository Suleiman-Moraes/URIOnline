package exercicios.iniciante.ex1036;

import java.util.Formatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String t = leia.nextLine();
		String[] vet = t.split(" ");
		double a = Double.parseDouble(vet[0]);
		double b  = Double.parseDouble(vet[1]);
		double c = Double.parseDouble(vet[2]);
		if(a == 0){
			System.out.println("Impossivel calcular");
		}else{
			double d = Math.pow(b, 2) - (4 * a * c);
			if(d < 0){
				System.out.println("Impossivel calcular");
			}else{
				Formatter fmt = new Formatter(System.out);
				double b1 = (-b + Math.sqrt(d)) / (2 * a);
				double b2 = (-b - Math.sqrt(d)) / (2 * a);
				fmt.format("R1 = %.5f\n", b1);
				fmt.format("R2 = %.5f\n", b2);
				fmt.close();
			}
		}
		
		leia.close();
	}
}