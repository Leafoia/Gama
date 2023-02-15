package exercicios.exercicio03;

public class Placar {
    private int scoreCasa, scoreVisitante;
    private String timeCasa, timeVisitante;

    public Placar() {
        this.timeCasa = "Time da casa";
        this.timeVisitante = "Time Visitante";
    }

    public String exibir() {
        return timeCasa + " " + scoreCasa + " X " + scoreVisitante + " " + timeVisitante;
    }

    public Placar(String timeCasa, String timeVisitante) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;

    }

    public String exibir1() {
        return timeCasa + " " + scoreCasa + " X " + scoreVisitante + " " + timeVisitante;
    }

    public Placar(String timeCasa, int scoreCasa, int scoreVisitante, String timeVisitante) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.scoreCasa = scoreCasa;
        this.scoreVisitante = scoreVisitante;
    }

    public String exibir2() {
        return timeCasa + " " + scoreCasa + " X " + scoreVisitante + " " + timeVisitante;
    }

}
