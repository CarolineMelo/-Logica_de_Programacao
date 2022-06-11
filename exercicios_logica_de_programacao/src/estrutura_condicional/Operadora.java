package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Operadora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double valorPago = 50.00;
		System.out.println("Digite a quantidade de minutos: ");
		int minutos = sc.nextInt();
		if (minutos > 100) {
			valorPago = valorPago + 2 * (minutos - 100);
		}
		
		System.out.println("Valor a pagar: R$ " + String.format("%.2f", valorPago));

		
		
		sc.close();
	}

}

//Problema "operadora" 
//Uma operadora de telefonia cobra R$ 50.00 por um plano b�sico que d� direito a 100 minutos de 
//telefone. Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para 
//ler a quantidade de minutos que uma pessoa consumiu, da� mostrar o valor a ser pago. 
