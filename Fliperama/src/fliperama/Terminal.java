package fliperama;

public class Terminal {

    private LeitorDeCartao leitor;
    private CategoriaDePremios premio1;
    private CategoriaDePremios premio2;
    private CategoriaDePremios premio3;

    public Terminal(LeitorDeCartao leitor, CategoriaDePremios premio1, CategoriaDePremios premio2, CategoriaDePremios premio3) {
        this.leitor = leitor;
        this.premio1 = premio1;
        this.premio2 = premio2;
        this.premio3 = premio3;
    }

    public void trocarTiquetesEmPremios(Cartao cartaoComTiquetes, CategoriaDePremios premioEscolhido) {
        leitor.passarCartao(cartaoComTiquetes);
        if (premioEscolhido != premio1 && premioEscolhido != premio2 && premioEscolhido != premio3) {
            System.err.println("Não temos esse premio aqui." + "\n");
        } else if (premioEscolhido == premio1 && cartaoComTiquetes.tiquetes() < premio1.valor()
                || premioEscolhido == premio2 && cartaoComTiquetes.tiquetes() < premio2.valor()
                || premioEscolhido == premio3 && cartaoComTiquetes.tiquetes() < premio3.valor()) {
            System.err.println("Você não tem tiquetes suficiente." + "\n");
        } else if (premioEscolhido == premio1 && cartaoComTiquetes.tiquetes() >= premio1.valor()) {
            System.out.println("Você ganhou um " + premio1.nome() + "\n");
            leitor.addNewTiquetes(-premio1.valor());
            premio1.addNewPremio(-1);
        } else if (premioEscolhido == premio2 && cartaoComTiquetes.tiquetes() >= premio2.valor()) {
            System.out.println("Você ganhou um " + premio2.nome() + "\n");
            leitor.addNewTiquetes(-premio2.valor());
            premio2.addNewPremio(-1);
        } else if (premioEscolhido == premio3 && cartaoComTiquetes.tiquetes() >= premio3.valor()) {
            System.out.println("Você ganhou um " + premio3.nome() + "\n");
            leitor.addNewTiquetes(-premio3.valor());
            premio3.addNewPremio(-1);
        }
    }

    public void colocarCreditos(int valorEmDinheiro, Cartao cartaoASerInserido) {
        this.leitor.passarCartao(cartaoASerInserido);
        if (valorEmDinheiro < 1) {
            System.err.println("Esse valor é invalido" + "\n");
        } else {
            this.leitor.addNewSaldo(valorEmDinheiro * 2);
        }
    }

    public void dadosCartao(Cartao cartaoDados) {
        this.leitor.passarCartao(cartaoDados);
        System.out.println("O numero do seu cartão é : " + leitor.numCartao());
        System.out.println("Seu saldo é " + leitor.saldo());
        System.out.println("Você tem " + leitor.tiquetes() + " tiquetes" + "\n");
    }

    public void tranferirSaldo(Cartao cartaoDeTransferencia, int valorASerTranferido, Cartao cartaoDeRecebimento) {
        if (cartaoDeTransferencia.saldo() < valorASerTranferido) {
            System.out.println("Você não tem todo esse valor para transferir o dinheiro" + "\n");
        } else {
            this.leitor.passarCartao(cartaoDeTransferencia);
            this.leitor.addNewSaldo(-valorASerTranferido);
            this.leitor.passarCartao(cartaoDeRecebimento);
            this.leitor.addNewSaldo(valorASerTranferido);
            System.out.println("O novo saldo do cartao é " + leitor.saldo() + "\n");

        }
    }

    public void tranferirTiquetes(Cartao cartaoDeTransferencia, int valorASerTranferido, Cartao cartaoDeRecebimento) {
        if (cartaoDeTransferencia.tiquetes() < valorASerTranferido) {
            System.out.println("Você não tem todo esse valor para transferir os tiquetes" + "\n");
        } else {
            this.leitor.passarCartao(cartaoDeTransferencia);
            this.leitor.addNewTiquetes(-valorASerTranferido);
            this.leitor.passarCartao(cartaoDeRecebimento);
            this.leitor.addNewTiquetes(valorASerTranferido);
            System.out.println("Você tem " + leitor.tiquetes() + " tiquetes no cartao" + "\n");

        }
    }

    public void dadosTerminal() {
        System.out.println("Nossos premios são " + this.premio1.nome() + ", " + this.premio2.nome() + " e " + this.premio3.nome()
                + "\nO " + this.premio1.nome() + " custa " + this.premio1.valor() + " tiquetes"
                + "\nO " + this.premio2.nome() + " custa " + this.premio2.valor() + " tiquetes"
                + "\nE o " + this.premio3.nome() + " custa " + this.premio3.valor() + " tiquetes" + "\n");
    }
}
