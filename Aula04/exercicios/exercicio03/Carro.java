package exercicios.exercicio03;

public class Carro {
    private double consumo;
    private String modelo, marca;

    public void especificacoes() {
        System.out.println("Modelo: " + modelo + "; Marca: " + marca + ".");
        
    }
    public Carro(String modelo, String marca, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        setConsumo(consumo);
    }
    public double getConsumo() {
        return consumo;
    }
    public void setConsumo(double consumo) {
        if(consumo > 0) {
            this.consumo = consumo;
        }
    }
}
