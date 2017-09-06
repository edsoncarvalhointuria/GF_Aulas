package prisioneiro;

public class Cela {

    private String nome;
    private boolean portaEstaAberta;
    private final int codigoDeSeguranca;

    public Cela(String nome, boolean portaEstaAberta, int codigoDeSeguranca) {
        this.nome = nome;
        this.portaEstaAberta = portaEstaAberta;
        this.codigoDeSeguranca = codigoDeSeguranca;
    }
    
    public void abrirFechar(int codigo) {
        if (codigo == codigoDeSeguranca && portaEstaAberta == false) {
            portaEstaAberta = true;
            System.out.println("A porta esta aberta");
        }else if (codigo == codigoDeSeguranca && portaEstaAberta == true){
              portaEstaAberta = false;
            System.out.println("A porta esta fechada");
        }else{
            System.out.println("Codigo Incorreto");
        }
    }

    public String numDaCela() {
        return nome;
    }

    public boolean estaAberta() {
        return portaEstaAberta;
    }
}
