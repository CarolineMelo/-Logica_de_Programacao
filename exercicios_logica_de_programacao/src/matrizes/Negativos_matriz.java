package matrizes;

import java.util.Scanner;

public class Negativos_matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M, N, i, j;
		int[][] mat = new int[99][99];
		System.out.print("Qual a quantidade de linhas da matriz? ");
		M = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz?");
		N = sc.nextInt();
		
		
		for (i = 0; i < M; i++) {
			for (j = 0; j < N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
		
		System.out.println("VALORES NEGATIVOS: ");
		for (i = 0; i < M; i++) {
			for (j = 0; j < N; j++) {
				if (mat[i][j] < 0) {
					System.out.println(mat[i][j]);
					
				}
			}
		}
	}

}
