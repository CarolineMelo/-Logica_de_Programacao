package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Mais_velho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int i, n;
		int maior, posMaior;

		System.out.print("Quantas pessoas você vai digitar?");
		n = sc.nextInt();
		String[] nome = new String[n + 1];
		int[] idade = new int[n + 1];

		for (i = 1; i <= n; i++) {
			System.out.println("Dados da " + i + "ª pessoa: ");
			System.out.print("Nome:");

			nome[i] = sc.next();
			System.out.print("Idade:");
			idade[i] = sc.nextInt();

		}
		sc.close();

		maior = idade[0];
		posMaior = 0;
		for (i = 1; i < n; i++) {
			if (idade[i] > maior) {
				maior = idade[i];
				posMaior = i;

			}
		}
		System.out.println();
		System.out.println("PESSOA MAIS VELHA: " + nome[posMaior]);
	}
}
