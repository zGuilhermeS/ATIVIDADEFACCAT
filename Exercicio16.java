import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite a quantidade de maças compradas: ");
			int macas = sc.nextInt();
			sc.close();
			if (macas < 1) {
				System.out.println("\nDigite o valor da duzia de maças: ");
			} else if (macas < 12) {
				double resultado = macas * 1.3;
				System.out.println("\nQual o valor a ser pago: R$" + resultado);

			} else {
				System.out.println("\nO valor a ser pago é : R$" + macas);
			}

		} catch (Exception e) {
			System.out.println("\nDigite somente número total" + e);
			
		}
		
	}
	
}

