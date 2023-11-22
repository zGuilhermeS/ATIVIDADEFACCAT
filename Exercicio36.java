import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade do primeiro homem: ");
        int idadeH1 = sc.nextInt();

        System.out.print("Digite a idade do segundo homem (diferente da primeira): ");
        int idadeH2 = sc.nextInt();

        while (idadeH1 == idadeH2) {
            System.out.println("As idades dos homens devem ser diferentes. Digite novamente:");
            System.out.print("Digite a idade do segundo homem: ");
            idadeH2 = sc.nextInt();
        }

        System.out.print("Digite a idade da primeira mulher: ");
        int idadeM1 = sc.nextInt();

        System.out.print("Digite a idade da segunda mulher (diferente da primeira): ");
        int idadeM2 = sc.nextInt();

        while (idadeM1 == idadeM2) {
            System.out.println("As idades das mulheres devem ser diferentes. Digite novamente:");
            System.out.print("Digite a idade da segunda mulher: ");
            idadeM2 = sc.nextInt();
        }

        int somaIdades = idadeH2 + idadeM1;

        int produtoIdades = idadeH1 * idadeM2;

        System.out.println("Soma das idades do homem mais velho com a mulher mais nova: " + somaIdades);
        System.out.println("Produto das idades do homem mais novo com a mulher mais velha: " + produtoIdades);

        sc.close();
    }
}
