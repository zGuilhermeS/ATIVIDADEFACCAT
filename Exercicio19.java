
import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o 1º valor: ");
		int valor = sc.nextInt();
		System.out.println("Digite o 2º valor: ");
		int valor1 = sc.nextInt();

		if (valor > valor1) {
			System.out.println("O maior valor digitado foi: " + valor);
		} else {
			System.out.println("O maior valor digitado foi: " + valor1);
		}
		sc.close();
	}

}
