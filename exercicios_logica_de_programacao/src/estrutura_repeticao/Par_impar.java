package estrutura_repeticao;

import java.util.Scanner;

public class Par_impar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, x, i;
		System.out.println("Quantos n�meros voc� vai digitar? ");
		n = sc.nextInt();

		for (i = 0; i < n; i++) {
			System.out.println("Digite um n�mero: ");
			x = sc.nextInt();

			if (x == 0) {
				System.out.println("NULO");

			} else {

				if (x % 2 != 0) {
					if (x > 0) {
						System.out.println("IMPAR POSITIVO");
					} else {
						System.out.println("IMPAR NEGATIVO");
					}

				} else {
					if (x > 0) {
						System.out.println("PAR POSITIVO");
					} else {
						System.out.println("PAR NEGATIVO");
					}

				}

			}

		}

		sc.close();
	}

}
