
// TODO Auto-generated method stub
import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double pesoideal = 0;

		System.out.println("Digite o seu nome: ");
		String nome = sc.next();

		System.out.println("\nDigite o seu sexo: ");
		char sexo = sc.next().charAt(0);

		System.out.println("\nDigite a sua altura com virgula: ");
		float altura = sc.nextFloat();

		if ((sexo == 'm') || (sexo == 'M')) {
			pesoideal = (72.2 * altura) - 58;
			System.out.println("znO peso ideal do(a) " + nome + " é :" + pesoideal + " Kg");
		} else if ((sexo == 'f') || (sexo == 'F')) {
			pesoideal = (62.1 * altura) - 44.7;
			System.out.println("\nO peso ideal do(a) " + nome + " é :" + pesoideal + " Kg");
		} else {
			System.out.println("\nO(s) caracteres digitado(s) não correspondem a nenhum sexo.");
		}
		sc.close();
	}

}
