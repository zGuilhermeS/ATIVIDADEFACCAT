import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ano atual: ");
		
		int anoAtual = sc.nextInt();
		
		System.out.println("\nDigite o seu ano de nascimento: ");
		int anoNascimento = sc.nextInt();
		
		int idade = anoAtual - anoNascimento;
		if (idade >= 16) {
			System.out.println("\nVocê está apta(o) à votar");
		} else {
			System.out.println("\nVocê não está apta(o) à votar");

		}
		sc.close();
	}

}
