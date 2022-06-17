package estrutura_repeticao;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i;
		int fatorial=1;
		
		System.out.print("Digite o valor de N: ");
		n = sc.nextInt();
		
		for(i=1;i<=n;i++) {
			fatorial = fatorial * i;
			
		}
		System.out.println("FATORIAL = " + fatorial);
		sc.close();

	}

}

//Problema "fatorial" (adaptado de URI 1153)
//Fazer um programa para ler um número natural N (valor máximo: 15), e depois calcular e mostrar o 
//fatorial de N. 
