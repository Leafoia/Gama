import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        double salario, prestacoes, prestacao, produto;

        System.out.print("Informe o valor do seu salário: ");
        salario = imput.nextDouble();

        System.out.print("Qual o valor do produto? ");
        produto = imput.nextDouble();

        System.out.print("Parcelará a compra em quantas vezes? ");
        prestacoes = imput.nextDouble();

        prestacao = produto / prestacoes;

        if (prestacao > salario * 0.3) {
            System.out.println("Empréstimo não pode ser concedido.");
        } else {
            System.out.println("Empréstimo pode ser concedido.");
        }
        imput.close();

    }
}
