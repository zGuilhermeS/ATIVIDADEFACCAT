import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da 1ª Nota: ");
		float nota1 = sc.nextFloat();
		System.out.println("Digite o valor da 2ª Nota: ");
		float nota2 = sc.nextFloat();
		System.out.println("Digite o valor da 2ª Nota: ");
		float nota3 = sc.nextFloat();
		
		float mediapond = nota1 * 2 + nota2 * 3 + nota3 * 5;
		float medialfinal = mediapond / 10;

		System.out.println("\nA média final do aluno é:  " +medialfinal);

		sc.close();
	}

}
