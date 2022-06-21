package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, i, cont = 0;
		String[] nome = new String[9];
		int[] idade = new int[9];
		double[] altura = new double[9];
		double porcentagem;
		System.out.print("Quantas pessoas serao digitadas?");
		n = sc.nextInt();

		for (i = 1; i <= n; i++) {
			System.out.println("Dados da " + i + "ª pessoa: ");

			System.out.print("Nome.: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade.: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura.: ");
			altura[i] = sc.nextDouble();

		}
		sc.close();

		double soma = 0;
		for (i = 1; i <= n; i++) {
			soma = soma + altura[i];
		}
		double media = soma / n;
		System.out.println();
		System.out.println("Altura média: " + String.format("%.2f", media));

		for (i = 1; i <= n; i++) {
			if (idade[i] < 16) {
				cont = cont + 1;
			}

		}
		porcentagem = cont * 100 / n;
		System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");

		for (i = 1; i <= n; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}

	}
}
