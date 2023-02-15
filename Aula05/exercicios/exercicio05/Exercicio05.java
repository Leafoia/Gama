package exercicios.exercicio05;

import java.util.Scanner;

public record Exercicio05() {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        final int QTDE_NOMES = 7;
        String nomes[] = new String[QTDE_NOMES];

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Digite os %dº nomes: ", i + 1);
            nomes[i] = scanner.nextLine();
        }

        System.out.println("Nomes lidos: ");
        for (int i = nomes.length - 1; i >= 0 ; i--) {
            System.out.println("nome: " + nomes[i]);
        }
        scanner.close();
    }
}
