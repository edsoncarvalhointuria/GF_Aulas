
import javax.swing.JOptionPane;


public class TesteVarsStrings {

    public static void main(String args[]) {
        //Teste length
        String nome = "Edson";
        System.out.println(nome.length() + nome);

        //Teste indexOf
        String pessoa = "Edson Carvalho Inturia ZZZZZZZ";
        int idxOf = pessoa.indexOf(' ');
        System.out.println(pessoa.indexOf('C') + "    " + idxOf);

        //Teste charAt
        String nomePessoa = "Edson";
        char cAt = nomePessoa.charAt(3);
        System.out.println(nomePessoa.charAt(0) +"    " + cAt);
        
        //teste substring
        String pessoaNome, edson, virgula, carvalho;
        pessoaNome = "Edson , Carvalho , Inturia";
        edson = pessoaNome.substring(0, 5);
        virgula = pessoaNome.substring(5, 8);
        carvalho = pessoaNome.substring(8, 16);
        System.out.println(edson + "   " + virgula + "    " + carvalho);
        
        //teste replace
        String cara = "Edson , dson , son , on , n";
        // Não muda a variavel apenas muda a impreçao
        System.out.println(cara.replace("on", "ON"));  
        
        //replaceFirst()
        System.out.println(cara.replaceFirst("on", "Onu"));
        
        // teste compareTo()
        System.out.println(nome.compareTo(pessoaNome));
        
        //Teste JOptionPane
        String pmrNome = JOptionPane.showInputDialog(null, "Digite seu primeiro nome", "PrimeiroNome", 3);
        String nomeDM = JOptionPane.showInputDialog(null, "Digite seu nome do meio", "NomeDoMeio", 3);
        String ultmNome = JOptionPane.showInputDialog(null, "Digite seu ultimo nome", "UltimoNome", 3);
        String nomeDeUsuario = pmrNome + " " + nomeDM + " " + ultmNome;
        int somatoria = (pmrNome.length()) + (nomeDM.length()) + (ultmNome.length());
        JOptionPane.showMessageDialog(null,nomeDeUsuario + "  Contem : " + somatoria + " letras.",null, 1);
        
    }
}
