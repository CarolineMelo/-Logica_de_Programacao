package estrutura_condicional;

import java.util.Scanner;

public class Menor_de_tres {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Primeiro valor: ");
		int v1 = sc.nextInt();
		System.out.println("Segundo valor: ");
		int v2 = sc.nextInt();
		System.out.println("Terceiro valor: ");
		int v3 = sc.nextInt();

		if (v1 < v2 && v1 < v3) {
			System.out.println("MENOR = " + v1);
		} else if (v2 < v3) {
			System.out.println("MENOR = " + v2);
		} else {
			System.out.println("MENOR = " + v3);
		}

		sc.close();
	}

}
