package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Duracao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a duracao em segundos: ");
		int duracao = sc.nextInt();
		
		int horas = duracao / 3600;
		int resto = duracao % 3600;
		
		int minutos = resto / 60;
		int segundos = resto % 60;
		System.out.println(horas+ ":" + minutos + ":" + segundos);
		System.out.println(" ");
		
		
		
		sc.close();

	}

}

//Problema "duracao" 
//Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no 
//formato horas:minutos:segundos. 