package exercicio5;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor númerico no teclado: ");
		int valor1=sc.nextInt();		

		int antecessor=valor1-1;
		System.out.println("O antecessor do numero escolhido é igual a: "+antecessor);
	
		sc.close();
}
}

