
import javax.swing.JOptionPane;




public class prioridade_na_fila {

    public static void main(String[] args) {
        //declaração de variáveis;
        int idade;
        
        JOptionPane.showMessageDialog(null, "Bem vindo ao programa para verificar qual é seu lugar na fila!");
                
        
        //entrada de dados por parte do usuário e conversão da variável:
        idade = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite qual é a sua idade: "));
        
        //processamento dos dados;
        if (idade>=60 && idade <=80) { JOptionPane.showMessageDialog
        (null, "Dirija-se até a fila prioritária");}
        else
        {if (idade>80) { JOptionPane.showMessageDialog(null, "Dirija-se até a fila 80+");
        }else {
            if (idade <60)
            { 
        {JOptionPane.showMessageDialog(null, "Dirija-se até a fila comum");
                }
        
        
        }
    }
}

    }
}