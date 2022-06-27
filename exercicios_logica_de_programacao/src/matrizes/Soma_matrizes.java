package matrizes;

import java.util.Scanner;

public class Soma_matrizes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i, j, M, N;
		int[][] A = new int[9][9];
		int[][] B = new int[9][9];
		int[][] C = new int[9][9];

		System.out.print("Quantas linhas vai ter cada matriz?");
		M = sc.nextInt();
		System.out.print("Quantas colunas vai ter cada matriz? ");
		N = sc.nextInt();

		System.out.println("Digite os valores da matriz A:");
		for (i = 0; i < M; i++) {
			for (j = 0; j < N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]:");
				A[i][j] = sc.nextInt();
			}
		}

		System.out.println("Digite os valores da matriz B:");
		for (i = 0; i < M; i++) {
			for (j = 0; j < N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]:");
				B[i][j] = sc.nextInt();
			}
		}
		sc.close();
		System.out.println("MATRIZ SOMA: ");
		for (i = 0; i < M; i++) {
			for (j = 0; j < N; j++) {

				C[i][j] = A[i][j] + B[i][j];
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
	}
}
