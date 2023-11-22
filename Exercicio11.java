package exercicio5;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Salário fixo do funcionario: ");
		float sl=sc.nextFloat();
		
		System.out.println("Comissão fixa: ");
		float comis=sc.nextFloat();
		
		System.out.println("Número de vendas do funcionário: ");
		float vendas=sc.nextFloat();
		
		System.out.println("Valor total de vendas: ");
		float tvendas=sc.nextFloat();
		
		
		float tcomis=comis*vendas+tvendas*5/100;
		float slf=sl+tcomis;
		
		System.out.println("Total de comissão: R$"+tcomis);
		System.out.println("O Salário Final do funiocionário será: R$"+slf);
		
		
		
	}

}
