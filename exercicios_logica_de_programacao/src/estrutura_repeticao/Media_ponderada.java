package estrutura_repeticao;
import java.util.Locale;
import java.util.Scanner;

public class Media_ponderada {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1,n2,n3,media;
		int n,i;
		System.out.print("Quantos casos você vai digitar? ");
		n = sc.nextInt();
		
		for(i=0;i<n;i++) {
			System.out.println("Digite três números: ");
			n1=sc.nextDouble();
			n2=sc.nextDouble();
			n3=sc.nextDouble();
			media = (n1*2+n2*3+n3*5)/10;
			System.out.println("MÉDIA = "+ String.format("%.1f", media));
			
		}
		sc.close();
	}
	

}

//Problema "media_ponderada" (adaptado de URI 1079)
//Leia um valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de 
//teste consiste de 3 valores reais, para os quais você deverá calcular e mostrar a média ponderada, sendo 
//que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5. Vale lembrar 
//que a média ponderada é a soma de todos os valores multiplicados pelo seu respectivo peso, dividida 
//pela soma dos pesos. 
