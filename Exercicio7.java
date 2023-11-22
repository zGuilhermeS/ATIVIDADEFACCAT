package exercicio5;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de anos vividos:");
		byte ano=sc.nextByte();
		System.out.println("Digite a quantidade de meses vividos depois do seu aniversario: ");
		byte mes=sc.nextByte();
		System.out.println("Digite a quantidade de dias vividos: ");
		byte dias=sc.nextByte();
		
		int total = ano*365+mes*30+dias;
		
		System.out.println("A quantidade de dias vividos pela pessoa é de: "+total+" dias\n");
		System.out.println("\nSua idade é igual a: "+total/365+" anos");
		sc.close();
	}

}
