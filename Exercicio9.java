package exercicio5;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário do funcionário : ");
		float SalarioFunc=sc.nextFloat();
		
		System.out.println("Digite a porcentagem % de reajuste :  ");
		float reajus=sc.nextFloat();
		
		float ValorPorc = SalarioFunc*reajus/100;
		System.out.println("\n"+"Porcentagem de reajuste : "+reajus+" %\n");
		float salarioFinal=SalarioFunc+ValorPorc;
		
		System.out.println("A porcentagem em R$ é igual a : "+ValorPorc+" R$");
		System.out.println("O valor do salario com acrescimo é igual : "+salarioFinal+" R$");
		
		sc.close();
	}
}

