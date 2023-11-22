package exercicio5;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de fábrica do carro: ");
		float Carro=sc.nextFloat();
		
		float impds=Carro*28/100;
		float imposto=Carro*45/100;
		float totalcon=Carro+impds+imposto;
		
		System.out.println("O valor final do carro para o consumidor é igual a: R$ "+totalcon);
		
		sc.close();
	}

}
