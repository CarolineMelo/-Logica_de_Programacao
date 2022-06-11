package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Medidas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a ;
		double b ;
		double c ;
		double quadrado;
		double triangulo;
		double trapezio;
		
		System.out.print("Digite a medida A: ");
		a = sc.nextDouble();
		System.out.print("Digite a medida B: ");
		b = sc.nextDouble();
		System.out.print("Digite a medida C: ");
		c = sc.nextDouble();		
		
		quadrado = a * a;
		triangulo = a * b/2;
		trapezio = (a + b) * c/2;
		System.out.println("AREA DO QUADRADO = " + String.format("%.4f", quadrado));
		System.out.println("AREA DO TRIANGULO = " + String.format("%.4f", triangulo));
		System.out.println("AREA DO TRAPEZIO = " + String.format("%.4f", trapezio));
		sc.close();
	}

	
}

//Problema "medidas" 
//Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e mostrar (imprimir os dados 
//com quatro casas decimais): 
//a) a área do quadrado que tem lado A 
//b) a área do triângulo retângulo que base A e altura B 
//c) a área do trapézio que tem bases A e B, e altura C 
//Exemplo 1: 
//Digite a medida A: 4.0
//Digite a medida B: 3.5
//Digite a medida C: 5.2
//AREA DO QUADRADO = 16.0000 
//AREA DO TRIANGULO = 7.0000 
//AREA DO TRAPEZIO = 19.5000 