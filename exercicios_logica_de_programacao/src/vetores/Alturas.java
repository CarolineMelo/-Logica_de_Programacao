package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n,i,idade;
		String nome;
		double altura;
		System.out.println("Quantas pessoas serao digitadas?");
		n=sc.nextInt();
		
		double [] vet = new double [n];
		for(i=0;i<n;i++) {
			System.out.println("Dados da "+i+" pessoa: ");
			
					
			System.out.println("Nome.: ");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.println("Idade.: ");
			idade = sc.nextInt();
			System.out.println("Altura.: ");
			altura = sc.nextInt();
			//vet[i]= sc.nextDouble(); double [n] = new vet(nome,idade,altura);
		}
		
		sc.close();

	}

}
