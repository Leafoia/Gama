import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        double numero1, numero2;

        System.out.print("Digite um número: ");
        numero1 = imput.nextDouble();
        System.out.print("Digite outro número: ");
        numero2 = imput.nextDouble();

        if (numero1 > numero2) {
            System.out.print(numero1 + ", " + numero2);

        }
        
        imput.close();
    }
}