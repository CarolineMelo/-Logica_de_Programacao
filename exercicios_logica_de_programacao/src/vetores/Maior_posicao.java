package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Maior_posicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int i, n, posicao;
		double maior;
		System.out.print("Quanto números você vai digitar? ");
		n = sc.nextInt();

		double[] vet = new double[n];
		for (i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
		}

		maior = vet[0];
		posicao = 0;
		for (i = 0; i < n; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
				posicao = i;
			}
		}
		System.out.println();
		System.out.println("MAIOR VALOR = " + String.format("%.2f", maior));
		System.out.print("POSIÇÃO DO MAIOR VALOR = " + posicao);
		sc.close();

	}

}
