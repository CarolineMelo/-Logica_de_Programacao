package estrutura_sequencial;

import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double media;

		System.out.println("Dados da primeira pessoa");

		System.out.println("Nome: ");
		String nome = sc.nextLine();
		sc.nextLine();
		System.out.println("Idade: ");
		int idade = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Dados da segunda pessoa");

		System.out.println("Nome: ");
		String nome2 = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Idade: ");
		int idade2 = sc.nextInt();

		media = (double) (idade + idade2) / 2;
		System.out.println("A idade média de " + nome + " e " + nome2 + " é " + media + "anos");
		sc.close();
	}

}

//Problema "idades" 
//Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os 
//nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo. 
