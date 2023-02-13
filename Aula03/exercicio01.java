import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner imput = new Scanner (System.in);
        int numero;

        System.out.print("Digite um numero inteiro: ");
        numero = imput.nextInt();

        if (numero > 20) {
            numero /= 2;
        }
        System.out.println("resultado = " + numero);

     imput.close();
    }
}
