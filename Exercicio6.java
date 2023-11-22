package exercicio5;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa que efetua o calculo da area do retangulo!!!\n");
		
		System.out.println("Digite o valor da base do retangulo em metros: ");
		float base= sc.nextFloat();
		
		System.out.println("Digite o valor da altura do retangulo em metros: ");
		float altura=sc.nextFloat();
		
		float area=base*altura;
		System.out.println("A área do retângulo é igual a: "+area+" m2");
		
		sc.close();
	
	}

}
