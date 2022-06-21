package vetores;

import java.util.Scanner;

public class Soma_vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n;

		System.out.print("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();

		int[] vetA = new int[n];
		int[] vetB = new int[n];
		int[] vetResult = new int[n];

		System.out.println("Digite os valores do vetor A: ");
		for (i = 0; i < n; i++) {
			vetA[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do vetor B: ");
		for (i = 0; i < n; i++) {
			vetB[i] = sc.nextInt();
		}
		System.out.println("VETOR RESULTANTE: ");
		for (i = 0; i < n; i++) {
			vetResult[i] = vetA[i] + vetB[i];
			System.out.println(vetResult[i]);

		}

	}

}
