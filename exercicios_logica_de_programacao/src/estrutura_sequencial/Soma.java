package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de X: ");
		int x = sc.nextInt();
		
		System.out.print("Digite o valor de y: ");
		int y =sc.nextInt();
		
		int soma = x+y;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}

//Problema "soma" 
//Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela o valor da soma destes 
//números. 
