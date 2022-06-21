package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Abaixo_da_media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int i, n;
		double cont = 0, media;

		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();

		double[] vet = new double[n];
		for (i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
		}
		for (i = 0; i < n; i++) {
			cont = cont + vet[i];

		}
		media = cont / n;
		System.out.println();
		System.out.println("MEDIA DO VETOR = " + media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

		for (i = 0; i < n; i++) {
			if (vet[i] < media) {
				System.out.println(vet[i]);
			}
		}
		sc.close();

	}

}
