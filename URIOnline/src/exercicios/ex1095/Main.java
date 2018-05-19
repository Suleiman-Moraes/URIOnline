package exercicios.ex1095;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.0");
//		 Locale.setDefault(Locale.US);
//		StringBuffer tudo = new StringBuffer();
		int j = 60;
		int i = 1;
		do {
			System.out.println("I=" + i + " J=" + j);
			i += 3;
			j -= 5;
		}while (j >= 0);
	}
}