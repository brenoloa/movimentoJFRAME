import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game {
    JLabel texto;
    int x = 200;
    int y = 40;
    public Game() {
        JFrame tela = new JFrame("JOGO");

        tela.setSize(500, 500);
        tela.setResizable(false);
        tela.setDefaultCloseOperation(tela.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);
        
        
        texto = new JLabel("$$$");
        texto.setBounds(x, y, 70, 70);
        texto.setFont(new Font("ARIAL", Font.BOLD, 40));
        
        tela.add(texto);
        
        JButton botao1 = new JButton("<");
        botao1.setBounds(150, 300, 80, 50);
        JButton botao2 = new JButton(">");
        botao2.setBounds(240, 300, 80, 50);
        JButton botao3 = new JButton("^");
        botao3.setBounds(210, 215, 50, 80);
        JButton botao4 = new JButton("^");
        botao4.setBounds(210, 355, 50, 80);


        tela.add(botao4);
        tela.add(botao3);
        tela.add(botao2);
        tela.add(botao1);
        
        botao2.addActionListener(this::direita);
        botao1.addActionListener(this::esquerda);
        botao3.addActionListener(this::cima);
        botao4.addActionListener(this::baixo);
        
        tela.setVisible(true);
        


    }

    private void direita(ActionEvent e) {
        x += 15;
        texto.setBounds(x, y, 70, 70);
    
    }

    private void esquerda(ActionEvent e) {
        x -= 15;
        texto.setBounds(x, y, 70, 70);
    
    }

    private void cima(ActionEvent e) {
        y -= 15;
        texto.setBounds(x, y, 70, 70);
    
    }

    private void baixo(ActionEvent e) {
        y += 15;
        texto.setBounds(x, y, 70, 70);
    
    }

    
    
    
}
