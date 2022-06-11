package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base;
		double h;
		double area;
		double perimetro;
		double diagonal;
		
		
		System.out.println("Base do retangulo: ");
		base = sc.nextDouble();
		
		
		System.out.println("Altura do retangulo: ");
		h = sc.nextDouble();
		
		
		area = base * h;
		perimetro = 2 * (base + h); 
		diagonal = Math.sqrt(Math.pow(base,2) + Math.pow(h,2));
		
		System.out.println("AREA = " + String.format("%.4f",area));
		
		System.out.println("PERIMETRO = " + String.format("%.4f",perimetro));
		
		System.out.println("DIAGONAL = " + String.format("%.4f", diagonal));
		
		sc.close();
		
	}


}

//Problema "retangulo" 
//Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor 
//da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos. 

