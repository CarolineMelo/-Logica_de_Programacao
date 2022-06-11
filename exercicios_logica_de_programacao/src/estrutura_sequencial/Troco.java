package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Troco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double preco;
		int quantidade;
		double dinheiroRecebido;
		double troco;

		System.out.println("Preço unitário do produto: ");
		preco = sc.nextDouble();

		System.out.println("Quantidade comprada: ");
		quantidade = sc.nextInt();

		System.out.println("Dinheiro recebido: ");
		dinheiroRecebido = sc.nextDouble();

		troco = dinheiroRecebido - (preco * quantidade);

		System.out.println("TROCO = " + String.format("%.2f",troco ));

		sc.close();
	}

}

//Problema "troco" 
//Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia. 
//O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto, 
//e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve 
//mostrar o valor do troco a ser devolvido ao cliente. 
