import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int i = 0;
        int a = 10;

        while (i < 3) {
            a = a + i;
            i++;
            System.out.println(a);
        }

        imput.close();
    }
}
