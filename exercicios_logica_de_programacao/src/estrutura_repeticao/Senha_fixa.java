package estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Senha_fixa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int senha;
		System.out.println("Digite sua senha: ");
		senha = sc.nextInt();
		
		while (senha != 2002){
					System.out.print("Senha Inválida! Tente novamente:");
					senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido!");
		sc.close();
		

	}

}
//
//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de 
//senha incorreta informada, escrever a mensagem "Senha Invalida! Tente novamente:". Quando a senha 
//for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo 
//encerrado. Considere que a senha correta é o valor 2002. 

