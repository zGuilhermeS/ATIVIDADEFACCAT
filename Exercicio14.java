import java.util.Scanner;

public class Exercicio14 {
		 
		public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
	 
				System.out.println("Digite um valor: ");
				int valor = sc.nextInt();
				
				if(valor<10) {
					System.out.println("\nNão é maior que 10");
				}else if(valor == 10) {
					System.out.println("\nÉ igual a 10");
				}else {
					System.out.println("\nÉ maior que 10");
				}
				sc.close();
			}

}
