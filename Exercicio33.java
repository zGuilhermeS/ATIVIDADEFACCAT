import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		int valor1 = sc.nextInt();

		System.out.println("\nDigite o primeiro valor: ");
		int valor2 = sc.nextInt();

		if (valor1 == valor2) {
			System.out.println("\nNumeros iguais\n");

		} else if (valor1 > valor2) {
			System.out.println("\nO Primeiro valor é maior");
		} else {
			System.out.println("\nO Segundo valor é maior");
		}
		sc.close();

	}

}
