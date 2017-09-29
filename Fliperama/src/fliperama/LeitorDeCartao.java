package fliperama;

public class LeitorDeCartao {

    private int tiquetes;
    private double saldo;
    private int numCartao;
    private Cartao cartao;
    
    public void passarCartao(Cartao cartao) {        
        tiquetes = cartao.tiquetes();
        saldo = cartao.saldo();
        numCartao = cartao.numCartao();
        this.cartao = cartao;
    }
    
    public int returnTiquetes(){
        return this.tiquetes;
    }
    
    public double returnSaldo(){
        return this.saldo;
    }
    
    public int returnNumCartao(){
        return this.numCartao;
    }
    
    public void addNewSaldo(double saldo){
        this.saldo += saldo;
        this.cartao.addNewSaldo(this.saldo);
    }
    
    public void addNewTiquetes(int tiquetes){
        this.tiquetes += tiquetes;
        this.cartao.addNewTiquete(this.tiquetes);
    }
    
}
