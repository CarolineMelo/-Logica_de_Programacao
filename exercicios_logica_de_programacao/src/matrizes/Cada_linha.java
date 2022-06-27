package matrizes;

import java.util.Scanner;

public class Cada_linha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i, j, n;
		int[][] mat = new int[9][9];
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]:");
				mat[i][j] = sc.nextInt();
			}
		}

		sc.close();
		System.out.println("MAIOR ELEMENTO DE CADA LINHA: ");

		for (i = 0; i < n; i++) {
			int maior = mat[i][0];
			for (j = 1; j < n; j++) {

				if (mat[i][j] > maior)
					maior = mat[i][j];

			}
			System.out.println(maior);
		}

	}

}
