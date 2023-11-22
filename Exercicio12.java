import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		float f;
		
		System.out.println("Informe a temperautra em Fahrenheit: ");
		f= sc.nextFloat();
		
		System.out.println("A temperatura em Graus Celsius é: "+((f-32)*5/9)+"ºC");
		
		sc.close();
	}
	

}


