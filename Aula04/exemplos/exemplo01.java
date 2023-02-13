package exemplos;

public class exemplo01 {
    public static void main(String[] args) {
        linha(7);
        System.out.println("Bom dia");

        linha2(7, '*');

        linha3("contando os caracteres", '=');
    }

    static void linha(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    static void linha2(int tamanho, char simbolo) {
        
        for (int i = 0; i < tamanho; i++) {
            System.out.print(simbolo);
        }
        System.out.println();
    }
   
    static void linha3(String mensagem, char simbolo) {
        System.out.println(mensagem);
        for (int i = 0; i < mensagem.length(); i++) {
         System.out.print(simbolo);
        }
        System.out.println();
    }
}