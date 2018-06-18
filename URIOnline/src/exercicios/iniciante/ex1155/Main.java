package exercicios.iniciante.ex1155;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.00");
//		Locale.setDefault(Locale.US);
//		StringBuffer tudo = new StringBuffer("");
//		Scanner leia = new Scanner(System.in);
		double soma = 0;
		
		for (int i = 1; i <= 100; i++) {
			soma += 1.0/i;
		}
		
		System.out.printf("%.2f\n", soma);
	}
}