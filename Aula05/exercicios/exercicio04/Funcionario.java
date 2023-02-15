package exercicios.exercicio04;

public class Funcionario {
    private String nome;
    private double horasTrabalhadas, valorHora, salario;

    public Funcionario(String nome, double horasTrabalhadas, double valorHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.nome = nome;
        this.valorHora = valorHora;
        salario();
    }
    public String funcionario() {
        return "Nome: " + nome + " -- Horas trabalhadas: " + horasTrabalhadas + " -- Valor da hora trabalhadas: R$" + valorHora + " -- Salário: R$" + salario; 
    }

    public double salario() {
        return salario = horasTrabalhadas * valorHora;
    }
}
