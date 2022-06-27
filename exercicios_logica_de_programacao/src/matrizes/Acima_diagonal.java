package matrizes;

import java.util.Scanner;

public class Acima_diagonal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, n, soma;
		int[][] mat = new int[9][9];
		System.out.print("Qual a ordem da matriz?");
		n = sc.nextInt();

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]:");
				mat[i][j] = sc.nextInt();

			}
		}
		soma = 0;
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				soma += mat[i][j];
			}
		}
		sc.close();
		System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + soma);
	}
}
