package estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int i, n;
		double numerador, denominador,result;
		System.out.println("Quantos casos voce vai digitar?");
		n = sc.nextInt();
		for (i = 0; i < n; i++) {
			System.out.println("Entre com o numerador: ");
			numerador = sc.nextDouble();
			System.out.println("Entre com o denominador: ");
			denominador = sc.nextDouble();
			
			if (denominador != 0) {
				result = numerador / denominador;
				System.out.println("DIVISÃO = " + String.format("%.2f", result));
			} else {
				System.out.println("DIVISÃO IMPOSSÍVEL");
			}
			sc.close();
		}

	

	}

}

//Problema "divisao" (adaptado de URI 1116)
//Escreva um algoritmo que leia dois números e imprima o resultado da divisão do primeiro pelo 
//segundo. Caso não for possível, mostre a mensagem “DIVISAO IMPOSSIVEL”. 