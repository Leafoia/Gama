import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        String nome = "";
        float provas, trabalhos, media = 0.0f;

        System.out.println("Digite seu nome:");
        nome = imput.nextLine();

        System.out.println("Olá " + nome);
        System.out.println("Digite a nota total das suas provas: ");
        provas = imput.nextFloat();

        System.out.println("Digite a nota dos seus trabalhos: ");
        trabalhos = imput.nextFloat();

        media = (trabalhos + provas) / 2;

        System.out.println("Sua nota média foi: " + media);

        imput.close();
    }
}
