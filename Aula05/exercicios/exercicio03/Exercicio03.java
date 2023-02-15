package exercicios.exercicio03;

public class Exercicio03 {
    public static void main(String[] args) {
        Placar p1 = new Placar();
        Placar p2 = new Placar("Cruzeiro", "Atlético Mineiro");
        Placar p3 = new Placar("Cruzeiro", 2, 0, "Atlético Mineiro");
        System.out.println(p1.exibir());
        System.out.println(p2.exibir1());
        System.out.println(p3.exibir2());

    }
}
