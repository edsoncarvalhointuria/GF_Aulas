package fliperama;

import java.util.ArrayList;

public class Terminal {

    private LeitorDeCartao leitor;
    private ArrayList<CategoriaDePremios> premios = new ArrayList();

    public Terminal(LeitorDeCartao leitor, CategoriaDePremios premio1, CategoriaDePremios premio2, CategoriaDePremios premio3) {
        this.leitor = leitor;
        premios.add(premio1);
        premios.add(premio2);
        premios.add(premio3);
    }

    public void trocarTiquetesEmPremios(Cartao cartaoComTiquetes, CategoriaDePremios premioEscolhido) {
        leitor.passarCartao(cartaoComTiquetes);
        if (premioEscolhido != premios.get(0) && premioEscolhido != premios.get(1) && premioEscolhido != premios.get(2)) {
            System.err.println("Não temos esse premio aqui.\n");
        } else if (premioEscolhido == premios.get(0) && leitor.returnTiquetes() < premios.get(0).valor()
                || premioEscolhido == premios.get(1) && leitor.returnTiquetes() < premios.get(1).valor()
                || premioEscolhido == premios.get(2) && leitor.returnTiquetes() < premios.get(2).valor()) {
            System.err.println("Você não tem tiquetes suficiente." + "\n");
        } else if (premioEscolhido == premios.get(0) && premios.get(0).quantidadeDeItems() < 1
                || premioEscolhido == premios.get(1) && premios.get(1).quantidadeDeItems() < 1
                || premioEscolhido == premios.get(2) && premios.get(2).quantidadeDeItems() < 1) {
            System.err.println("Este item acabou");
        } else {
            for (int i = 0; i < premios.size(); i++) {
                if (premioEscolhido == premios.get(i)) {
                    System.out.println("Você ganhou um " + premios.get(i).nome() + "\n");
                    leitor.addNewTiquetes(-premios.get(i).valor());
                    premios.get(i).addNewPremio(-1);
                }
            }
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
        System.out.println("O numero do seu cartão é : " + leitor.returnNumCartao());
        System.out.println("Seu saldo é " + leitor.returnSaldo());
        System.out.println("Você tem " + leitor.returnTiquetes() + " tiquetes" + "\n");
    }

    public void tranferirSaldo(Cartao cartaoDeTransferencia, int valorASerTranferido, Cartao cartaoDeRecebimento) {
        if (cartaoDeTransferencia.saldo() < valorASerTranferido) {
            System.out.println("Você não tem todo esse valor para transferir o dinheiro" + "\n");
        } else {
            this.leitor.passarCartao(cartaoDeTransferencia);
            this.leitor.addNewSaldo(-valorASerTranferido);
            this.leitor.passarCartao(cartaoDeRecebimento);
            this.leitor.addNewSaldo(valorASerTranferido);
            System.out.println("O novo saldo do cartao é " + leitor.returnSaldo() + "\n");

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
            System.out.println("Você tem " + leitor.returnTiquetes() + " tiquetes no cartao" + "\n");

        }
    }

    public void dadosTerminal() {
        System.out.println("Nossos premios são " + premios.get(0).nome() + ", " + premios.get(1).nome() + " e " + premios.get(2).nome()
                + "\nO " + premios.get(0).nome() + " custa " + premios.get(0).valor() + " tiquetes"
                + "\nO " + premios.get(1) + " custa " + premios.get(1).valor() + " tiquetes"
                + "\nE o " + premios.get(2).nome() + " custa " + premios.get(2).valor() + " tiquetes" + "\n");
    }
}
