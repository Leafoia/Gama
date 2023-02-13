package exemplos.exemplo03;

public class Exemplo03 {
    public static void main(String[] args) {
        // criando um obnjeto do tipo pessoa
        Pessoa pessoa1 = new Pessoa("Alan", 28);
        Pessoa pessoa2 = new Pessoa("Natalia",30);

        /*pessoa1.nome = "Alan";
        pessoa1.idade = 49;
        pessoa2.nome = "Natália";
        pessoa2.idade = 30;*/
      
        pessoa1.apresentar();
        pessoa2.apresentar();

    }
}
