package exercicios.exercicio02;

public class Exercicio02 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Sieg", "Khan", 2020, "Alannana", "9999999");

        System.out.println(animal1.getDados());

        Proprietario pr1 = new Proprietario("Nana", "99999999");

        Animal animal2 = new Animal("lily", "gato", 2021, pr1);

        System.out.println(animal2.getDados());

        animal1.getProprietario().setTelefone("889644");
        System.out.println(animal1.getDados());
    }
}
