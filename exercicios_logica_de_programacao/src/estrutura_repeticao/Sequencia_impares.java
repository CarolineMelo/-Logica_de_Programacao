package estrutura_repeticao;

import java.util.Scanner;

public class Sequencia_impares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, i;

		System.out.println("Digite o valor de X: ");
		x = sc.nextInt();

		for (i = 1; i < x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}

		}
		sc.close();

	}

}
//Problema "sequencia_impares" (adaptado de URI 1067)
//Leia um valor inteiro X. Em seguida mostre os �mpares de 1 at� X, um valor por linha, inclusive o X, 
//se for o caso. 
