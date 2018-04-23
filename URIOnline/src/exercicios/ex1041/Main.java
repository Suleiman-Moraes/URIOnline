package exercicios.ex1041;

import java.util.Formatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Formatter fmt = new Formatter(System.out);
		String t = leia.nextLine();
		String[] vet = t.split(" ");
		float a = Float.parseFloat(vet[0]);
		float b = Float.parseFloat(vet[1]);
		
		double m = (a + b + c + d) / 10;
		fmt.format("Media: %.1f\n", m);
		if(m < 5.0){
			System.out.println("Aluno reprovado.");
		}else if(m >= 7.0){
			System.out.println("Aluno aprovado.");
		}else{
			System.out.println("Aluno em exame.");
			double e = Double.parseDouble(leia.nextLine());
			fmt.format("Nota do exame: %.1f\n", e);
			double mf = (e + m) / 2;
			if(mf <= 5.0){
				System.out.println("Aluno aprovado.");
				
			}else{
				System.out.println("Aluno reprovado.");
			}
			fmt.format("Media final: %.1f\n", mf);
		}
		fmt.close();
		leia.close();
	}
}