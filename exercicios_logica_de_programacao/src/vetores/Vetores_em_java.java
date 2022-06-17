package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_em_java {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n,i;
		
		System.out.println("Quantos n�meros voc� vai digitar? ");
		n=sc.nextInt();
		
		double[] vet = new double[n];
		
		for (i=0; i < n; i++) {
			System.out.print("Digite um n�mero:");
			vet[i]= sc.nextDouble();
			
		}
		
		System.out.print("N�meros digitados:");
		for(i=0;i<n;i++) {
			System.out.println(String.format("%.1f", vet[i]));
		}
		sc.close();
		

	}

}
