package estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Experiencias {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n, i, totalCobaias = 0, totalCoelhos = 0, totalRatos = 0, totalSapos = 0, quantity;
		double percentualC, percentualR, percentualS;
		char type;
		System.out.print("Quantos casos de teste serão digitados?");
		n = sc.nextInt();

		for (i = 0; i < n; i++) {
			System.out.print("Quantidade de cobaias: ");
			quantity = sc.nextInt();
			totalCobaias = totalCobaias + quantity;
			System.out.print("Tipo de cobaia: ");
			type = sc.next().charAt(0);

			if (type == 'C') {
				totalCoelhos = totalCoelhos + quantity;
			} else if (type == 'R') {
				totalRatos = totalRatos + quantity;
			} else {
				totalSapos = totalSapos + quantity;
			}
		}sc.close();
		System.out.println("");
		System.out.println("RELATÓRIO FINAL:");
		System.out.println("Total: " + totalCobaias + " cobaias");
		System.out.println("Total de Coelhos: " + totalCoelhos);
		System.out.println("Total de Ratos: " + totalRatos);
		System.out.println("Total de Sapos: " + totalSapos);

		percentualC = (double) totalCoelhos / totalCobaias * 100;
		percentualR = (double) totalRatos / totalCobaias * 100;
		percentualS = (double) totalSapos / totalCobaias * 100;

		System.out.printf("Percentual de coelhos:%.2f%n", percentualC);
		System.out.printf("Percentual de ratos:%.2f%n", percentualR);
		System.out.printf("Percentual de sapos:%.2f%n", percentualS);
		
	}
}
