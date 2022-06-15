package estrutura_repeticao;

import java.util.Scanner;

public class Dentro_fora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, i;
		int x;
		int dentro = 0;
		int fora = 0;

		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();

		for (i = 0; i < n; i++) {

			System.out.print("Digite um número:");
			x = sc.nextInt();
			if (x >= 10 && x < 20) {
				dentro = dentro + 1;
			} else {
				fora = fora + 1;
			}
		}
		System.out.println("Dentro = " + dentro);
		System.out.println("Fora = " + fora);

		sc.close();

	}

}
