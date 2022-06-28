package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Matriz_geral {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int i, j, n;
		double[][] mat = new double[9][9];
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]:");
				mat[i][j] = sc.nextDouble();
			}
		}

		double soma = 0;

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (mat[i][j] > 0) {
					soma += mat[i][j];
				}
			}
		}
		System.out.println();
		System.out.println("SOMA DOS POSITIVOS: " + soma);

		System.out.println();
		System.out.print("Escolha uma linha:");
		int linha = sc.nextInt();
		System.out.print("Linha escolhida: ");
		for (j = 0; j < n; j++) {
			System.out.print(+mat[linha][j] + " ");
		}

		System.out.println();
		System.out.println();
		System.out.print("Escolha uma coluna: ");
		int coluna = sc.nextInt();
		System.out.print("Coluna escolhida: ");
		for (i = 0; i < n; i++) {
			System.out.print(+mat[i][coluna] + " ");
		}

		sc.close();

		System.out.println();
		System.out.println();
		System.out.print("DIAGONAL PRINCIPAL: ");
		for (i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");

		}

		System.out.println();
		

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (mat[i][j] < 0) {

					mat[i][j] = (mat[i][j] * mat[i][j]);
				}
			}
		}
		System.out.println();
		System.out.println("MATRIZ ALTERADA:  ");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
