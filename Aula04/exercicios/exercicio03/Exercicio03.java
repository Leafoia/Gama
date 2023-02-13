package exercicios.exercicio03;

public class Exercicio03 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Civic", "Honda", -7);

        carro1.especificacoes();

        System.out.println("Consumo: " + carro1.getConsumo() + "Km/l.");
    }
}
