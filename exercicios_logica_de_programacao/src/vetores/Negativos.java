package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		int n,i;
		
		System.out.print("Quantos n�meros voc� vai digitar?");
		n=sc.nextInt();
		int []vet = new int[n];
		
		
		
		for(i =0; i <n;i++) {
			System.out.print("Digite um n�mero:");
			vet[i]=sc.nextInt();
		}
		sc.close();
		System.out.println();
		System.out.println("N�MEROS NEGATIVOS:");

		for(i=0;i<n;i++) {
			if(vet[i] <0) {
				System.out.println(vet[i]);
			}
		}
	}

}
