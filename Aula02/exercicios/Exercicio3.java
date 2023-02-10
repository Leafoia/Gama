
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        double salarioAtual, salarioAumento;

        System.out.println("Digite o seu salário atual: ");
        salarioAtual = imput.nextDouble();

        salarioAumento = salarioAtual * 1.25;

        System.out.println("Seu salario após o aumento séra de: " + salarioAumento);

        imput.close();

    }
}
