package estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class TesteEnquanto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x;
		int soma;
		
		System.out.println("Exercício: Estrutura repetitiva enquanto");
		
		System.out.print("Digite o primeiro número: ");
		x = sc.nextInt();
		soma = 0;
		while (x !=0) {
			soma = soma + x;
			System.out.print("Digite outro número: ");
			x= sc.nextInt();
		}
		System.out.println("SOMA = "+ soma);
		sc.close();
	}

}
