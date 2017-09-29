package a.liga.de.futebol;

public class LigaTeste {

    public static void main(String args[]) {
        Campo campo1 = new Campo("Ibirapuera");
        Campo campo2 = new Campo("Itaquera");
        Time time1 = new Time("Corinthias", campo2);
        Time time2 = new Time("Palmeiras", campo1);
        Time time3 = new Time("Santos", campo1);
        Time time4 = new Time("Gremio", campo2);
        Jogo jogo1 = new Jogo(time1, time2, time3, time4, campo1);

        jogo1.jogar();
        
    }
}
