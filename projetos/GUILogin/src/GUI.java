import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent; // Importe isto também para o evento do botão funcionar
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// Pra acionar o evento no botão, a classe precisa ser implementada de ActionListener e java.awt.event.ActionListener
public class GUI implements ActionListener, java.awt.event.ActionListener{

    // Vistos em toda a classe
    private static JLabel usuarioLabel;
    private static JTextField usuarioTexto;
    private static JLabel senhaLabel;
    private static JPasswordField senhaTexto;
    private static JButton botao;
    private static JLabel entrou;

    public static void main(String[] args) {
        
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Entrar na conta");
        frame.add(panel);

        panel.setLayout(null);

        /* CAMPO USUÁRIO */
        usuarioLabel = new JLabel("Usuário");
        usuarioLabel.setBounds(10, 20, 80, 25); 
        panel.add(usuarioLabel);

        usuarioTexto = new JTextField();
        usuarioTexto.setBounds(100, 20, 165, 25);
        panel.add(usuarioTexto);

        /* CAMPO SENHA */
        senhaLabel = new JLabel("Senha");
        senhaLabel.setBounds(10, 60, 80, 25);
        panel.add(senhaLabel);

        senhaTexto = new JPasswordField();
        senhaTexto.setBounds(100, 60, 165, 25);
        panel.add(senhaTexto);

        /* BOTÃO */
        botao = new JButton("Login");
        botao.setBounds(127, 120, 80, 25);
        botao.addActionListener(new GUI()); // Aciona um evento ao clicar no botão
        panel.add(botao);

        /* LABEL DE ENTROU COM SUCESSO */
        entrou = new JLabel("");
        entrou.setBounds(10, 95, 300, 25);
        panel.add(entrou);

        frame.setVisible(true);

    }

    // Quando clicarmos em "Login", irá aparecer a mensagem, que está dentro do método, na janela
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String usuario = usuarioTexto.getText();
        String senha = senhaTexto.getText();

        // Verifica se o usuário e senha fornecidos batem com os esperados aqui
        if(usuario.equals("Lucas") && senha.equals("senha123")){
            entrou.setText("Entrou na conta!");
        }
        else{
            entrou.setText("Informe os dados corretos!");
        }
    }
}
