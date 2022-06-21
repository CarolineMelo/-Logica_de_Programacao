package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Media_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int i, n, cont = 0;
		double par = 0, media;

		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();

		double[] vet = new double[n];

		for (i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
		}

		for (i = 0; i < n; i++) {

			if (vet[i] % 2 == 0) {
				par += vet[i];
				cont += 1;
			}
		}

		if (cont == 0) {
			System.out.println("NENHUM NÚMERO PAR");
		} else {
			media = par / cont;
			System.out.println("MÉDIA DOS PARES = " + media);
		}

		sc.close();

	}

}
