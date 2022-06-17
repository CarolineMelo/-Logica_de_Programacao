package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double soma = 0, media = 0;
		int n, i;
		System.out.print("Quantos números você vai digitar?");
		n = sc.nextInt();

		double[] vet = new double[n];

		for (i = 0; i < n; i++) {
			System.out.print("Digite um número:");
			vet[i] = sc.nextDouble();
		}
		sc.close();
		System.out.print("VALORES = ");
		for (i = 0; i < n; i++) {
			System.out.print(" " + vet[i]);
			soma += vet[i];

		}
		media = soma / n;
		System.out.println();
		System.out.println("SOMA = " + String.format("%.2f", soma));
		System.out.println("Média = " + String.format("%.2f", media));
		

	}

}
