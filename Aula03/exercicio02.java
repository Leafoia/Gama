import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        double nota1, nota2, media;
        double peso1 = 0.4;
        double peso2 = 0.6;

        System.out.print("Digite o valor da sua primeira prova: ");
        nota1 = imput.nextDouble();

        System.out.print("Digite o valor da sua segunda prova: ");
        nota2 = imput.nextDouble();

        media = ((nota1 * peso1) + (nota2 * peso2)) / (peso1 + peso2);
        System.out.println("Sua média ponderada foi: " + (media));

        if (media >= 6.0) {
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado");
        }

        imput.close();

    }
}
