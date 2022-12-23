package GUIConversorMonetário;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

public class Main implements ActionListener, java.awt.event.ActionListener{
    
    private static JLabel realLabel;
    private static JTextField realTexto;
    private static JLabel dolarLabel;
    private static JLabel dolarTexto;
    private static JButton botao;
    

    public static void main(String[] args) {
        
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setTitle("Conversor Monetário");
        frame.setSize(300, 170);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        panel.setLayout(null);

        /* REAL */
        realLabel = new JLabel("Real (R$)");
        realLabel.setBounds(27,20,150,25);
        panel.add(realLabel);

        realTexto = new JTextField();
        realTexto.setBounds(15, 50, 80, 25);
        panel.add(realTexto);

        /* CAMPO LABEL EM DÓLAR */

        dolarLabel = new JLabel("Dolar (US$)");
        dolarLabel.setBounds(186, 20, 150, 25);
        panel.add(dolarLabel);

        /* CAMPO REAL CONVERTIDO */
        dolarTexto = new JLabel("");
        dolarTexto.setBounds(206, 50, 150, 25);
        panel.add(dolarTexto);

        /* BOTÃO PARA CONVERTER */
        botao = new JButton("Converter");
        botao.setBounds(100,90, 90, 25);
        botao.addActionListener(new Main());
        panel.add(botao);

        frame.setVisible(true);
    }

    // Evento acionado ao clicar no botão
    @Override
    public void actionPerformed(ActionEvent e) {
        
        // No momento o dólar custa US$ 5.17
        double dolar = Double.parseDouble(realTexto.getText()) / 5.17;

        // Criando um objeto para limitar a precisão do double
        DecimalFormat df = new DecimalFormat("0.00");

        dolarTexto.setText(df.format(dolar));
        
    }

}
