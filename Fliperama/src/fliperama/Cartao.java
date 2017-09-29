package fliperama;

public class Cartao {

    private double saldo;
    private int tiquetes;
    private int numCartao;

    public Cartao(int numCartao) {
        this.numCartao = numCartao;
        
    }

    public int numCartao() {
        return this.numCartao;
    }

    public double saldo() {
        return this.saldo;
    }

    public int tiquetes() {
        return this.tiquetes;
    }

    public void addNewSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void addNewTiquete(int tiquete) {
        this.tiquetes = tiquete;
    }

}
