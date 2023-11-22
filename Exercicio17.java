package QA;

import java.util.Scanner;

public class Exercicio17 {
		 
		public static void main(String[] args) {
			try {
				Scanner sc = new Scanner(System.in);
	 
				System.out.println("Digite o valor da 1ª Nota: ");
				float nota1 = sc.nextFloat();
				System.out.println("\nDigite o valor da 2ª Nota: ");
				float nota2 = sc.nextFloat();
				float media = (nota1 + nota2)/2;
	 
				if ((media < 0) || (media > 10)) {
					System.out.println("\nO programa aceita somente números entre 0 e 10: ");
				} else if (media >= 6) {
					System.out.println("\nAluno(a)foi aprovado(a) com sucesso. Sua média é: " + media);
				} else {
					System.out.println("\nAluno(a)foi reprovado(a). Sua média é: " + media);
				}
				sc.close();
				} catch (Exception e) {
					System.out.println("\nA media calculada é: "+e);
				}
		}
}
