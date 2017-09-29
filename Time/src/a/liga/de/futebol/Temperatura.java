package a.liga.de.futebol;

import java.util.ArrayList;

public class Temperatura {

    private ArrayList<Double> temperatura = new ArrayList();

    public ArrayList getTemperatura() {
        return temperatura;
    }

    public void addTemperatura(double i) {
        this.temperatura.add(i);
    }

    /*public static void main(String[] args) {
    Temperatura t = new Temperatura();
    t.getTemperatura().add(10);
    t.getTemperatura().add(11);
    t.getTemperatura().add(12);
    t.getTemperatura().add(13);
    t.getTemperatura().add(14);
    for (int i = 0; i < 6; i++) {
    System.out.println(t.getTemperatura().get(i));
    }
    }*/

}
