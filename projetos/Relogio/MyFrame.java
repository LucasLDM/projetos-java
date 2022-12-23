package Relogio;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame{

    SimpleDateFormat tempoFormato; // Mostra a data
    SimpleDateFormat diaFormato;
    SimpleDateFormat dataFormato;

    JLabel tempoLabel; // Mostra o tempo
    JLabel diaLabel;
    JLabel dataLabel;

    String tempo;
    String dia;
    String data;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Meu Relógio");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        tempoFormato = new SimpleDateFormat("hh:mm:ss a");
        diaFormato = new SimpleDateFormat("EEEE"); // Nome completo do dia da semana
        dataFormato = new SimpleDateFormat("dd MMMM, yyyy");

        /* TEMPO */
        tempoLabel = new JLabel();
        tempoLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
        tempoLabel.setForeground(new Color(0xBD2A2E)); // Cor do tempo
        tempoLabel.setBackground(new Color(0x3B3936));
        tempoLabel.setOpaque(true); // Mostra o background

        /* DIA */
        diaLabel = new JLabel();
        diaLabel.setFont(new Font("Verdana", Font.PLAIN, 35));

        /* DATA */
        dataLabel = new JLabel();
        dataLabel.setFont(new Font("Verdana", Font.PLAIN, 15));

        // Adicionando ao frame
        this.add(tempoLabel);
        this.add(diaLabel);
        this.add(dataLabel);

        this.setVisible(true);

        setTempo();
    }

    public void setTempo(){

        // Vai mostrar o relógio "rodando" a cada segundo
        while(true){
            
            tempo = tempoFormato.format(Calendar.getInstance().getTime()); // O atributo "tempo" recebe a hora atual
            tempoLabel.setText(tempo); // O texto que irá aparecer será as horas pegas pelo atributo "tempo"

            dia = diaFormato.format(Calendar.getInstance().getTime());
            diaLabel.setText(dia); // O texto que irá aparecer o dia da semana

            data = dataFormato.format(Calendar.getInstance().getTime());
            dataLabel.setText(data);

            try {
                Thread.sleep(1000); // 1000millis = 1 segundo
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
