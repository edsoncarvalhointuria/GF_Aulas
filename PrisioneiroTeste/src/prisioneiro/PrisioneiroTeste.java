package prisioneiro;

public class PrisioneiroTeste {

    public static void main(String args[]) {
        Cela celaA1 = new Cela("A1", false, 4002);
        Cela celA2 = new Cela("A2", false, 2568);
        Prisioneiro bubba = new Prisioneiro("Bubba", 2.08, 4, null);
        Prisioneiro twich = new Prisioneiro("Twich", 1.73, 3, celaA1);
        
        System.out.println(Prisioneiro.numDPsnro());
        twich.dadosPrisioneiro();
        //celaA1.abrirFechar(4002);
        
        
        
        
        
        System.out.println(bubba == twich ? "Sua cela fica aqui pode entrar" : "Vocês não são da mesma "
                + "cela");

        //bubba.dadosPrisioneiro();
        //bubba.dadosPrisioneiro(false);
        //Prisioneiro p01 = new Prisioneiro();
        //p01.nome = null;
        //System.out.println(p01.nome);
        //System.out.println(p01.altura);
        //System.out.println(p01.anosDeCondenação);
    }
}
