package exercicios.exercicio05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        int paginaAlvo;
        Ebook livro;
        Scanner imput = new Scanner(System.in);

        livro = new Ebook("harryPotter", "JK", 390, 1);
       
        livro.book();

        System.out.print("Qual página deseja ir? ");
        paginaAlvo = imput.nextInt();
        
       
        //livro1.setSomarPagina(350);
        livro.setIrPagina(paginaAlvo);
        //livro1.setRetrocederPagina();
        //livro1.setAvancarPagina();

        System.out.print("Você está na página: " + livro.getPaginaAtual());

      imput.close();

    }
}
