package java_projects;

import javax.swing.JOptionPane;

public class IMC{
    public static void main(String[] args) {
        // recebe o nome
        String nome = JOptionPane.showInputDialog("Bem-vindo(a) ao programa de cálculo de Índice de Massa Corporal (IMC).\nPara começarmos, informe seu nome!");

        // primeiro nome capitalizado
        String nome_cap = nome.substring(0, 1).toUpperCase() + nome.substring(1);

        // recebe o peso
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Seu peso em quilogramas (kg)"));

        // recebe a altura
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Sua altura em metros (m)"));

        // calcula o IMC
        double imc = peso / (Math.pow(altura, 2));

        // usando o método format da classe String, quis que mostrasse o valor do IMC com 2 casas decimais após a vírgula
        JOptionPane.showMessageDialog(null, nome_cap+", o seu IMC é de "+ String.format("%.2f", imc));
    }
}