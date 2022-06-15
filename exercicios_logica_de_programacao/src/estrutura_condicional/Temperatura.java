package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char escala;
		double F;
		double C;

		System.out.println("Você vai digitar a temperatura em qual escala (C/F)?");
		escala = sc.next().charAt(0);

		if (escala == 'F') {

			System.out.println("Digite a temperatura em Fahrenheit:");
			F = sc.nextDouble();
			C = (F - 32) * 5 / 9;
//				double C =  5/9*(F-32);
			System.out.println("Temperatura equivalente em Celsius: " + String.format("%.2f", C));

		} else if (escala == 'C') {
			System.out.println("Digite a temperatura em Celsius:");
			C = sc.nextDouble();
			F = 9 * C / 5 + 32;
			System.out.println("Temperatura equivalente em Fahrenheit: " + String.format("%.2f", F));
		} else {

			System.out.println("Escolha uma opção válida");
		}
		sc.close();
	}

}
