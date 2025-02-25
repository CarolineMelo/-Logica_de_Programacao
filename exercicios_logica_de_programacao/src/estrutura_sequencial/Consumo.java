package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Distancia percorrida: ");
		double distanciaPercorrida = sc.nextDouble();
		
		System.out.println("Combust�vel gasto: ");
		double combustivelGasto = sc.nextDouble();
		
		double medio = distanciaPercorrida/combustivelGasto;
		System.out.println("Consumo medio = "+ String.format("%.3f", medio));
				
		sc.close();

	}

}

//Problema "consumo" 
//Fazer um programa para ler a dist�ncia total (em km) percorrida por um carro, bem como o total de 
//combust�vel gasto por este carro ao percorrer tal dist�ncia. Seu programa deve mostrar o consumo 
//m�dio do carro, com tr�s casas decimais. 
