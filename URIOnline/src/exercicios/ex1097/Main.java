package exercicios.ex1097;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.0");
//		 Locale.setDefault(Locale.US);
//		StringBuffer tudo = new StringBuffer();
		int i = 1;
		int j = 2;
		do {
			j += 5;
			for (int k = 0; k < 3; k++) {
				System.out.println("I=" + i + " J=" + j);
				j--;
			}
			i += 2;
		}while (i <= 9);
	}
}