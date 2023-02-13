import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int numero = 0;
        int multiplicador = 1;

        System.out.print("Escreva um numero qualquer: ");
        numero = imput.nextInt();

        while(multiplicador <= numero) {
            if(multiplicador * 2 <= numero){
                System.out.print(multiplicador + ", ");
            } else {
                System.out.print(multiplicador);
            }
            
            multiplicador *= 2;
          
        }
        imput.close();
    }
}
