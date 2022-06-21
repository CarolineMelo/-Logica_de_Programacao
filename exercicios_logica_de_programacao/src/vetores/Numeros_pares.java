package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Numeros_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int i, n, cont = 0;

		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();

		int[] number = new int[n];
		for (i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			number[i] = sc.nextInt();

		}
		System.out.println();
		System.out.println("NUMEROS PARES: ");
		for (i = 0; i < n; i++) {
			if (number[i] % 2 == 0) {
				cont = cont + 1;
				System.out.print(number[i] + " ");
			}
		}
		System.out.println();
		System.out.print("QUANTIDADE DE PARES = " + cont);
		sc.close();
	}

}
