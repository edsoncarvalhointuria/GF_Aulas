package fliperama;

import java.util.Random;

public class Jogos {

    Random rdm = new Random();
    private double valorJogo;
    private int tiquetesGanhos;
    private LeitorDeCartao lC;

    public Jogos(LeitorDeCartao lC, double valorJogo) {
        this.valorJogo = valorJogo;
        this.lC = lC;
    }

    public void jogar(Cartao cartaoComCreditos) {
        this.lC.passarCartao(cartaoComCreditos);
        if (this.lC.returnSaldo() < valorJogo) {
            System.err.println("Você não tem saldo suficiente\n");
        } else {
            this.tiquetesGanhos = rdm.nextInt(20) + 1;
            System.out.println("Você ganhou " + this.tiquetesGanhos + " tiquetes" + "\n");
            this.lC.addNewTiquetes(tiquetesGanhos);
            this.lC.addNewSaldo(-valorJogo);

        }

    }

    public void jogar(Cartao cartaoComCreditos1, Cartao cartaoComCreditos2) {
        this.lC.passarCartao(cartaoComCreditos1);
        if (cartaoComCreditos1.saldo() < valorJogo) {
            System.err.println("Você não tem saldo suficiente" + "\n");
        } else {
            this.lC.passarCartao(cartaoComCreditos2);
            if (cartaoComCreditos2.saldo() < valorJogo) {
                System.err.println("Você não tem saldo suficiente" + "\n");
            } else {
                this.tiquetesGanhos = rdm.nextInt(20) + 1;
                System.out.println("Você ganhou " + this.tiquetesGanhos + " tiquetes" + "\n");
                this.lC.addNewTiquetes(tiquetesGanhos/2);
                this.lC.addNewSaldo(-valorJogo);
                this.lC.passarCartao(cartaoComCreditos1);
                this.lC.addNewTiquetes(tiquetesGanhos/2);
                this.lC.addNewSaldo(-valorJogo);
            }
        }
    }
}
