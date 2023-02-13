package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int numero;
        System.out.print("Escreva um número inteiro: ");
        numero = imput.nextInt();

        parametro(numero);

        if (parametro(numero)) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é impar.");
        }

        imput.close();

    }

    static boolean parametro(int valor) {
        return (valor % 2) == 0;
    }
}
