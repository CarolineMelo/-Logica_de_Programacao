package estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.println("Digite dois números: ");
		x= sc.nextInt();
		y= sc.nextInt();
		while (x != y) {
			if (x< y){
				 System.out.println("Crescente");
				 
			 }else {
				 System.out.println("Decrescente");
			 }
			System.out.println("Digite outros dois números: ");
			x= sc.nextInt();
			y= sc.nextInt();
			sc.close();
		}
		
	}

}
