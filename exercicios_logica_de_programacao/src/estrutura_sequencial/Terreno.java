package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Terreno {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double largura;
		double comprimento;
		double valorMetro;
		double area;
		double preco;

		System.out.println("Digite a largura do terreno: ");
		largura = sc.nextDouble();

		System.out.println("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();

		System.out.println("Digite o valor do metro quadrado: ");
		valorMetro = sc.nextDouble();

		area = (largura * comprimento);
		preco = area * valorMetro;
		System.out.println("Area do terreno =  " + String.format("%.2f", area));

		System.out.println("Preco do terreno = " + String.format("%.2f", preco));
		sc.close();
	}

}

//Problema "terreno" 
//Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma 
//casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida, 
//o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com 
//duas casas decimais, conforme exemplo. 