package estrutura_condicional;

import java.util.Scanner;

public class Tempo_de_jogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora,horarioFinal,horarioInicial;
		
		System.out.print("Hora inicial: ");
		horarioInicial = sc.nextInt();
		
		System.out.print("Hora final: ");
		horarioFinal = sc.nextInt();
		
		if (horarioFinal > horarioInicial) {
			hora = horarioFinal - horarioInicial;
		}else {
			hora = (24 - horarioInicial) + horarioFinal;
			
		}
		
		
		System.out.println("O JOGO DUROU "+ hora +"HORAS(S)");
		sc.close();
	}

}
