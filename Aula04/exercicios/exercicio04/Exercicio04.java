package exercicios.exercicio04;

public class Exercicio04 {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(20,44,30);

        relogio.clock();
        
        System.out.println(relogio.getHora() + ":" + relogio.getMinuto()+ ":" + relogio.getSegundo());
    }
}
