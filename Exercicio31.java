import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de A: ");
		float a = sc.nextFloat();

		System.out.println("\nDigite o valor de B: ");
		float b = sc.nextFloat();

		System.out.println("\nDigite o valor de C: ");
		float c = sc.nextFloat();

		if (a > b + c || b > a + c || c > a + b) {
			System.out.println("\nÉ um triângulo!!!");
		} else if (a < b + c || b < a + c || c < a + b) {
			System.out.println("\nNão é um triângulo!!!");
		}

		sc.close();

	}

}
