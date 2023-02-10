
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        double salarioMinimo, valorKw;
        double valorAPagar, valorComDesconto;
        double qtdKw;

        System.out.println("Escreva o valor do salário mínimo: ");
        salarioMinimo = imput.nextDouble();

        System.out.println("Digite quantos quilowatts você consumiu: ");
        qtdKw = imput.nextDouble();

        valorKw = salarioMinimo / 500;
        valorAPagar = (valorKw * qtdKw);
        valorComDesconto = valorAPagar * 0.85;

        System.out.println("O valor do Kw é: " + valorKw);
        System.out.println("O valor da conta de luz será: " + valorAPagar);
        System.out.println("O valor a ser pago com desconto é de: " + valorComDesconto);

        imput.close();

    }
}
