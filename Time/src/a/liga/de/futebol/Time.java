package a.liga.de.futebol;

public class Time {

    private int vitorias;
    private int derrotas;
    private int empates;
    private int golsMarcados;
    private int golsSofridos;
    private String nomeEquipe;
    private Campo campoDoTime;

    public Time(String nomeEquipe, Campo campoDoTime) {
        this.nomeEquipe = nomeEquipe;
        this.campoDoTime = campoDoTime;
    }

    //Getters
    public Campo getCampo(){
        return campoDoTime;
    }
    
    public int getVitorias() {
        return this.vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    public int getGolsMarcados() {
        return this.golsMarcados;
    }

    public int getGolsSofridos() {
        return this.golsSofridos;
    }

    public String getNomeEquipe() {
        return this.nomeEquipe;
    }

    //Setters
    public void setVitoria(int i) {
        this.vitorias += i;
    }

    public void setDerrota(int i) {
        this.derrotas += i;
    }

    public void setEmpate(int i) {
        this.empates += i;
    }

    public void setGolsMarcados(int i) {
        this.golsMarcados += i;
    }

    public void setGolsSofridos(int i) {
        this.golsSofridos += i;
    }

}
