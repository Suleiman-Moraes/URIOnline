package exercicios.iniciante.ex1478;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.0000");
//		Locale.setDefault(Locale.US);
//		StringBuilder tudo = new StringBuilder("");
		Scanner leia = new Scanner(System.in);
		StringBuilder tudo = new StringBuilder();
		while(true) {
			int valor = leia.nextInt();
			if(valor == 0) {
				break;
			}
			int[][] matriz = new int[valor][valor];
			
			int normalizador = -1;
			
			for (int tamanhoMax = valor; tamanhoMax >= 1; tamanhoMax = tamanhoMax -2) {
				normalizador ++;
				for (int linha = 0; linha < tamanhoMax; linha++) {
					for (int coluna = 0; coluna < tamanhoMax; coluna++) {
						if(linha == 0) {
							matriz[linha + normalizador][coluna + normalizador] = coluna + 1;
						}
						else if(linha == tamanhoMax - 1) {
							matriz[linha + normalizador][coluna + normalizador] = tamanhoMax - coluna;
						}
						else if(coluna == 0) {
							matriz[linha + normalizador][coluna + normalizador] = linha + 1;
						}
						else if(coluna == tamanhoMax -1) {
							matriz[linha + normalizador][coluna + normalizador] = tamanhoMax - linha;
						}
					}
				}
			}
			
			for (int l = 0; l < matriz.length; l++) {
				for (int c = 0; c < matriz[l].length; c++) {
					if(c == 0) {
						tudo.append(String.format("%3d", matriz[l][c]));
					}
					else {
						tudo.append(String.format(" %3d", matriz[l][c]));
					}
				}
				tudo.append("\n");
			}
			tudo.append("\n");
		}
		System.out.print(tudo);
		leia.close();
	}
}