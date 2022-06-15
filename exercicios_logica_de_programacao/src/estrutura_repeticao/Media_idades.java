package estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Media_idades {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int idade;
		double media = 0.00;
		int soma = 0;
		int cont = 0;

		System.out.println("Digite as idades: ");
		idade = sc.nextInt();

		while (idade >= 0) {
			cont = cont + 1;
			soma = soma + idade;
		
			idade = sc.nextInt();

		}
		if (cont == 0) {
			System.out.println("IMPOSSÍVEL CALCULAR");
		} else {
			media = soma / cont;
			System.out.println("MÉDIA = " + String.format("%.2f", media));

		}
		sc.close();

	}
}
