package exemplos.exemplo03;

public class Pessoa {
    // características = ATRIBUTOS
    String nome;
    int idade;
    // ações = MÉTODOS
    void apresentar() {
        System.out.println("Olá, Eu sou o(a) " + nome);
       System.out.println("Tenho " + idade + " anos.");
    }
        Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
    }
