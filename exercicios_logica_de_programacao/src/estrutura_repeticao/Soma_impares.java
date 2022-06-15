package estrutura_repeticao;

import java.util.Scanner;

public class Soma_impares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, soma, i, troca;

		System.out.println("Digite dois n�meros: ");
		x = sc.nextInt();
		y = sc.nextInt();

		if (x > y) {
			troca = x;
			x = y;
			y = troca;
		}
		soma = 0;
		for (i = x + 1; i < y; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}

		}
		System.out.println("SOMA DOS �MPARES: " + soma);
		sc.close();

	}

}

//Problema "soma_impares" (adaptado de URI 1071)
//Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre a soma dos n�meros 
//impares entre eles. 