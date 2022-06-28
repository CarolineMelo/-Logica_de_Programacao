package matrizes;

import java.util.Scanner;

public class Diagonal_negativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, i, j, num = 0;
		int[][] mat = new int[9][9];
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();

			}
		}

		System.out.println("DIAGONAL PRINCIPAL: ");

		for (i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");

		}

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					num += 1;

				}
			}
		}
		System.out.println();
		System.out.println("QUANTIDADE DE NEGATIVOS = " + num);

	}

}
