package fliperama;

public class CategoriaDePremios {

    private String nome;
    private int tiquetesNecessarios;
    private int quantidade;

    public CategoriaDePremios(String nome, int tiquetesNecessarios, int quantidade) {

        this.nome = nome;
        this.tiquetesNecessarios = tiquetesNecessarios;
        this.quantidade = quantidade;
    }
    
    public String nome(){
        return this.nome;
    }
    
    public int valor(){
        return this.tiquetesNecessarios;
    }
    
    public int quantidadeDeItems(){
        return this.quantidade;
    }
    
    public void addNewPremio(int newValorDePremios){
        this.quantidade += newValorDePremios;
    }

}
