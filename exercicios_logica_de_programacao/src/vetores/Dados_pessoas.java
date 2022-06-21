package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Dados_pessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n, i, contM, contF;
		double maior, menor,soma,media;

		System.out.print("Quantas pessoas ser�o digitadas? ");
		n = sc.nextInt();
		double[] altura = new double[n + 1];
		char[] genero = new char[n + 1];

		for (i = 1; i <= n; i++) {
			System.out.print("Altura da " + i + "� pessoa:");
			altura[i] = sc.nextDouble();
			System.out.print("G�nero " + i + "� pessoa:");
			genero[i] = sc.next().charAt(0);
		}
		menor = altura[1];
		maior = altura[1];
		for (i = 2; i <= n; i++) {
			if (altura[i] > maior) {
				maior = altura[i];
			} else if (altura[i] < menor) {
				menor = altura[i];
			}

		}

		System.out.println("Menor altura = " + menor);
		System.out.println("Maior altura = " + maior);
		soma = 0;
		contF = 0;
		for (i = 1; i <= n; i++) {
			if (genero[i] == 'F') {
				soma += altura[i];
				contF += 1;
			}
		}

		if (contF == 0) {
			System.out.println("imposs�vel calcular a altura m�dia das mulheres");
		} else {
			media = soma / contF;
			System.out.println("M�dia das alturas das mulheres = " + String.format("%.2f", media));
		}

		contM = n - contF;
		System.out.println("N�mero de homens = " + contM);
		sc.close();

	}

}
