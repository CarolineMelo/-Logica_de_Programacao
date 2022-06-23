package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Comerciante {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n, abaixo = 0, entre = 0, acima = 0;
		double lucro = 0, totalCompra = 0, totalVenda = 0, percentual;
		double[] compra = new double[99];
		double[] venda = new double[99];
		String[] nomeProduto = new String[99];
		
		System.out.print("Serão digitados dados de quantos produtos? ");
		n = sc.nextInt();

		for (i = 1; i <= n; i++) {
			System.out.println("Produto " + i + ":");
			System.out.print("Nome: ");
			nomeProduto[i] = sc.next();
			System.out.print("Preco de compra: ");
			compra[i] = sc.nextDouble();
			System.out.print("Preco de venda: ");
			venda[i] = sc.nextDouble();

		}
		sc.close();

		for (i = 1; i <= n; i++) {

			lucro = (double) (venda[i] - compra[i]);
			percentual = (lucro * 100 / compra[i]);
			if (percentual < 10) {
				abaixo += 1;
			} else if (percentual <= 20) {
				entre += 1;
			} else
				acima += 1;
		}
		
		for (i = 1; i <= n; i++) {
			totalCompra += compra[i];
			totalVenda += venda[i];
		}
		double totalLucro = totalVenda - totalCompra;
		System.out.println("RELATÓRIO:");
		System.out.println("Lucro abaixo de 10%: " + abaixo);
		System.out.println("Lucro entre 10% e 20%: " + entre);
		System.out.println("Lucro acima de 20%: " + acima);
		System.out.println("Valor total de compra: R$" + String.format("%.2f", totalCompra));
		System.out.println("Valor total de venda: R$" + String.format("%.2f", totalVenda));
		System.out.println("Lucro total: R$" + String.format("%.2f", totalLucro));
	}
}
