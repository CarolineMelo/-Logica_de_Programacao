package estrutura_repeticao;

import java.util.Scanner;

// ESTRUTURA PARA
//Problema "tabuada" 
//Ler um número inteiro N, daí mostrar na tela a tabuada de N para 1 a 10. 

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, i, produto;
		System.out.println("Deseja a tabuada para qual valor? ");
		n = sc.nextInt();

		for (i = 1; i <= 10; i++) {
			produto = n * i;
			System.out.println(n + " x " + i + " = " + produto);

		}

		sc.close();
	}

}
