package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int i, n;
		System.out.print("Quantos alunos serão digitados?");
		n = sc.nextInt();
		double nota;
		double[] nota1 = new double[99];
		double[] nota2 = new double[99];
		String[] nome = new String[99];
		for (i = 1; i <= n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + i + "º aluno: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}

		sc.close();
		System.out.println("Alunos aprovados: ");

		for (i = 1; i <= n; i++) {
			nota = (nota1[i] + nota2[i]) / 2;

			if (nota >= 6) {
				System.out.println(nome[i]);
			}
		}
	}

}
