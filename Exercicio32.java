import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro time: ");
		String time1 = sc.next();

		System.out.println("\nDigite o primeiro time: ");
		String time2 = sc.next();

		System.out.println("\nGols marcados pelo time: " + time1);
		int gol1 = sc.nextInt();

		System.out.println("\nGols marcados pelo time: " + time2);
		int gol2 = sc.nextInt();

		if (gol1 > gol2) {
			System.out.println("\nVencedor: " + time1);
		} else if (gol1 < gol2) {
			System.out.println("\nVencedor: " + time2);
		} else {
			System.out.println("\nEMPATE");

		}
		sc.close();

	}

}
