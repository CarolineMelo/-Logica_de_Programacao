package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Dardo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double d1;
		double d2;
		double d3;
	
		System.out.println("Digite as tr�s dist�ncias:");
		d1=sc.nextDouble();
		d2=sc.nextDouble();
		d3=sc.nextDouble();
		
		if (d1>d2 && d1> d3) {
			System.out.println("MAIOR DIST�NCIA = "+ String.format("%.2f", d1));
		}else if(d2>d3) {
			System.out.println("MAIOR DIST�NCIA = "+ String.format("%.2f", d2));
		}else {
			System.out.println("MAIOR DIST�NCIA = "+ String.format("%.2f", d3));
		}
		
		sc.close();
	}

}
//Problema "dardo" 
//No arremesso de dardo, o atleta tem tr�s chances para lan�ar o dardo � maior dist�ncia que conseguir. 
//Voc� deve criar um programa para, dadas as medidas das tr�s tentativas de lan�amento, informar qual 
//foi a maior. 