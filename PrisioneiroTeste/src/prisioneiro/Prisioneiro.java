package prisioneiro;

public class Prisioneiro {

    //private String celaDoPrisioneiro;
    private String nome;
    private double altura;
    private int anosDeCadeia;
    private Cela cela;
    private static int contagemDosPrisioneiros = 2;
    private int numeroDeReserva = numDPsnro();
    
    public Prisioneiro(String nome, double altura, int anosDeCadeia, Cela cela) {
        this.nome = nome;
        this.altura = altura;
        this.anosDeCadeia = anosDeCadeia;
        this.cela = cela;

    }
    
    public void pensar() {
        System.out.println("Terei minha vingança");
    }

    public void dadosPrisioneiro() {
        System.out.println("Nome : " + nome);
        System.out.println("Altura : " + altura);
        System.out.println("Sentença : " + anosDeCadeia);
        System.out.println("Cela : " + celaPrisioneiro().numDaCela());
        System.out.println("O numero de reserva é : " + numeroDeReserva);
        System.out.println("A contagem atual dos prisioneiros são : " + contagemDosPrisioneiros);
        
        System.out.println("");
    }

    public static int numDPsnro(){
        return contagemDosPrisioneiros;
    }
    
    public void dadosPrisioneiro(boolean estouPensando) {
        dadosPrisioneiro();
        if (estouPensando == true) {
            pensar();
        }
    }

    public Cela celaPrisioneiro() {
        return cela;
    }

    public String nomePrisioneiro() {
        return this.nome;
    }
    
    public double alturaPrisioneiro() {
        return this.altura;
    }

    public int sentença() {
        return this.anosDeCadeia;
    }

}
/*


public void definirCampos(String nome, double altura, int anosDeCondenação) {
        //System.out.println(nome);
        nm = nome;
        atr = altura;
        adc = anosDeCondenação;
    }*/
