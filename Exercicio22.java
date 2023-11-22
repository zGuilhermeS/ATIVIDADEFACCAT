
import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de horas trabalhadas em um mês: \n");
		double quantidadeHorastrabalhadas = sc.nextDouble();
		
		System.out.print("\nDigite o valor recebido por cada hora trabalhada:\n");
		double valorHora = sc.nextDouble();

		if (quantidadeHorastrabalhadas < 161) {
			double salarioFinal = quantidadeHorastrabalhadas * valorHora;
			System.out.print("\nO valor a ser recebido é: R$" + salarioFinal);
		} else {
			double salarioFinal = (160 * valorHora) + (valorHora + valorHora * 50 / 100);
			System.out.printf("\nO valor a ser recebido é: R$  %.2f", salarioFinal);
		}
		sc.close();

	}
}
