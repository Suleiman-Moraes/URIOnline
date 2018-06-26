package exercicios.iniciante.ex1156;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.00");
//		Locale.setDefault(Locale.US);
//		StringBuffer tudo = new StringBuffer("");
//		Scanner leia = new Scanner(System.in);
		double soma = 0;
		int num = 1;
		int den = 1;
		
		while (num <= 39) {
			soma += num/(double)den;
			num += 2;
			den += den;
		}
		
		System.out.printf("%.2f\n", soma);
	}
}