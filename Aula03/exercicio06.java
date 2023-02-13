import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int tabulada, cont;

        System.out.println("Qual a tabuada?");
        tabulada = imput.nextInt();
        
        cont = 0;
        while (cont < 11) {
            // print formatado
            // %d = número, 2 é o número de casas numéricas.
            
            System.out.println(tabulada + " X " + cont + " = " + (tabulada * cont));
            System.out.printf("%d X %2d = %d\n", tabulada, cont, (tabulada * cont));
            cont++;
        }
        
        imput.close();
    }
}
