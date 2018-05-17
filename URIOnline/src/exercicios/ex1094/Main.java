package exercicios.ex1094;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static int q = 0;
	static char c = ' ';
	static int a;

	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.0");
//		 Locale.setDefault(Locale.US);
//		StringBuffer tudo = new StringBuffer();
		Map<String, Integer> mapa = new HashMap<>();
		Scanner leia = new Scanner(System.in);
		a = leia.nextInt();
		
		for (int x = 0; x < a; x++) {
			q = leia.nextInt();
			c = leia.next().charAt(0);
			
			if(mapa.keySet().contains(c+"")){
				mapa.put(c+"", (mapa.get(c+"") + q));
			}
			else{
				mapa.put(c+"", q);
			}
		}
		
		a = 0;
		mapa.keySet().forEach(x -> {
			a += mapa.get(x);
		});
		System.out.println("Total: " + a + " cobaias");
		System.out.println("Total de coelhos: " + mapa.get("C"));
		System.out.println("Total de ratos: " + mapa.get("R"));
		System.out.println("Total de sapos: " + mapa.get("S"));
		System.out.printf("Percentual de coelhos: %.2f", ((mapa.get("C") * 100.0) / a));
		System.out.println(" %");
		System.out.printf("Percentual de ratos: %.2f", ((mapa.get("R") * 100.0) / a));
		System.out.println(" %");
		System.out.printf("Percentual de sapos: %.2f", ((mapa.get("S") * 100.0) / a));
		System.out.println(" %");
		leia.close();//System.out.printf("%.1f\n", soma);
	}
}