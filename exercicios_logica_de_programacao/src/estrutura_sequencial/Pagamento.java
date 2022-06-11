package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("NOME : ");
		String nome = sc.nextLine();
		
		System.out.print("Valor por hora: ");
		double valorPorHora = sc.nextDouble();
		
		System.out.print("Horas trabalhadas: ");
		int horasTRabalhadas = sc.nextInt();
		double pagamento =(valorPorHora * horasTRabalhadas);
		System.out.println("O pagamento para "+nome+" deve ser "+ String.format("%.2f", pagamento));
		sc.close();
	}

}
//Problema "pagamento" 
//Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e a 
//quantidade de horas trabalhadas por ele(a). Ao final, mostrar o valor do pagamento do funcionário com 
//uma mensagem explicativa, conforme exemplo. 
