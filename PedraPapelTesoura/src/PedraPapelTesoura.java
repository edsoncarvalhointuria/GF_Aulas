
import java.util.Random;
import javax.swing.JOptionPane;

public class PedraPapelTesoura {

    public static void main(String args[]) {
        // Escolha do Jogador
        boolean executarCodigo = false;
        JOptionPane.showMessageDialog(null, "Escolha entre : Pedra(0), Papel(1) e Tesoura(2)");
        String escolhaDoUsuario = JOptionPane.showInputDialog(null, "Digite sua escolha : ", "Entrada", 1);
        int conversao = Integer.parseInt(escolhaDoUsuario);
        String nomeDaEscolha = null;
        if (conversao == 0) {
            nomeDaEscolha = "Pedra";
        } else if (conversao == 1) {
            nomeDaEscolha = "Papel";
        } else if (conversao == 2) {
            nomeDaEscolha = "Tesoura";
        }
        if (conversao == 0 || conversao == 1 || conversao == 2) {
            executarCodigo = true;
            JOptionPane.showMessageDialog(null, "Você escolhe : " + nomeDaEscolha);
        } else {
            JOptionPane.showMessageDialog(null, "Você deve escolher apenas entre : 0 a 2", null, 0);
        }

        // Escolha da machine
        if (executarCodigo == true) {
            Random randm = new Random();
            int numAleatorio = randm.nextInt(3);
            String escolhaDaMaquina = null;
            if (numAleatorio == 0) {
                escolhaDaMaquina = "Pedra";
            } else if (numAleatorio == 1) {
                escolhaDaMaquina = "Papel";
            } else if (numAleatorio == 2) {
                escolhaDaMaquina = "Tesoura";
            }
            JOptionPane.showMessageDialog(null, "Eu escolho :" + escolhaDaMaquina);

            //Resultado
            if (conversao == 0 && numAleatorio == 1 || conversao == 1 && numAleatorio == 2
                    || conversao == 2 && numAleatorio == 0) {
                JOptionPane.showMessageDialog(null, "Yes , eu venci!!", "Resultado", 1);
            } else if (conversao == 1 && numAleatorio == 0 || conversao == 2 && numAleatorio == 1
                    || conversao == 0 && numAleatorio == 2) {
                JOptionPane.showMessageDialog(null, "Ahhh, Você venceu. Você deve ter trapaciado ", "Resultado", 1);
            } else if (conversao == 0 && numAleatorio == 0 || conversao == 1 && numAleatorio == 1
                    || conversao == 2 && numAleatorio == 2) {
                JOptionPane.showMessageDialog(null, "Deu empate .Bem, Pelo menos eu não perdi", "Resultado", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Tem alguma coisa errada. Você deve ter escolhido um numero errado", null, 0);
            }
        }
    }
}
