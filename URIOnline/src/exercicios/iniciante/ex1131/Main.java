package exercicios.iniciante.ex1131;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.00");
//		Locale.setDefault(Locale.US);
		int a, b, x;
		StringBuffer tudo = new StringBuffer("");
		Scanner leia = new Scanner(System.in);
		
		int inter = 0;
		int gremio = 0;
		int empate = 0;
		int cont = 0;
		do {
			a = leia.nextInt();
			b = leia.nextInt();
			
			if(a > b) inter++;
			else if(b > a) gremio++;
			else empate ++;
			cont ++;
			
			tudo.append("Novo grenal (1-sim 2-nao)\n");
			x = leia.nextInt();
		} while (x != 2);
		
		tudo.append(cont).append(" grenais\n");
		tudo.append("Inter:").append(inter).append("\n");
		tudo.append("Gremio:").append(gremio).append("\n");
		tudo.append("Empates:").append(empate).append("\n");
		
		if(inter > gremio){
			tudo.append("Inter venceu mais\n");
		}
		else if(gremio > inter){
			tudo.append("Gremio venceu mais\n");
		}
		else{
			tudo.append("Nao houve vencedor\n");
		}
		
		System.out.print(tudo);
		leia.close();
	}
}