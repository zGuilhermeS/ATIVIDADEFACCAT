import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("\nNúmero Positivo");
		}

		else if (num < 0) {
			System.out.println("\nNúmero Negativo");
		} else {
			System.out.println("\nNúmero igual a Zero");
		}
		sc.close();
	}
}
