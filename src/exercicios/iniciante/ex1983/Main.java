package exercicios.iniciante.ex1983;

import java.io.IOException;
import java.util.Scanner;

/**
 * beecrowd | 1983
 * 
 * As aulas do Prof. Jatob� est�o dando o que falar. Os representantes do MEC
 * vieram at� a UNIME de Lauro de Freitas para saber mais detalhes sobre essa
 * nova forma de ensinar Algoritmos. Al�m disso, eles queriam selecionar 1 aluno
 * para participar da OBI-Tec (Olimp�ada Brasileira de Inform�tica N�vel
 * T�cnica) e representar a rede Kroton na competi��o, pois sabem que l� est�o
 * os melhores. Para selecionar o melhor, eles t�m dispon�vel uma lista com o
 * n�mero de inscri��o de cada aluno e a sua respectiva nota na disciplina. Sua
 * tarefa � ajudar o pessoal do MEC a encontrar o aluno mais apto a representar
 * a institui��o e quem sabe garantir sua vaga. S� tem um detalhe, se a nota
 * mais alta n�o for maior ou igual a 8, voc� dever� imprimir �Minimum note not
 * reached�.
 * 
 * Entrada O arquivo cont�m primeiro a quantidade de alunos (3 <= n <= 100)
 * existentes e em seguida, os n alunos contendo o n�mero da matr�cula (0 < m <
 * 1000000) de cada um, seguido da respectiva nota (0 <= nota <= 10.0, com 1
 * casa decimal).
 * 
 * Obs.: as notas n�o ser�o repetidas. Ou seja, n�o tem chance de ter dois
 * alunos com a mesma nota.
 * 
 * Sa�da Voc� deve imprimir o n�mero do estudante que obteve a maior pontua��o
 * ou "Minimum note not reached" (sem aspas) caso nenhum estudante tenha tirado
 * uma nota maior ou igual a 8.
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		final byte times = scan.nextByte();
		String[] enrolls = new String[times];
		float[] notes = new float[times];
		for (int i = 0; i < times; i++) {
			enrolls[i] = scan.next();
			notes[i] = Float.valueOf(scan.next());
		}
		StringBuilder txt = new StringBuilder();
		txt.append(execute(enrolls, notes)).append("\n");
		System.out.print(txt);
		scan.close();
	}

	public static String execute(String[] enrolls, float[] notes) {
		int bigger = -1;
		float biggerNote = 8.0f;
		for (int i = 0; i < notes.length; i++) {
			final float note = notes[i];
			if (note >= biggerNote) {
				bigger = i;
				biggerNote = note;
				if (biggerNote == 10.0) {
					break;
				}
			}
		}
		if (bigger > 0) {
			return enrolls[bigger];
		} else {
			return "Minimum note not reached";
		}
	}
}