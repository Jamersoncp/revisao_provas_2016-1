package br.edu.grupointegrado.ferramentas;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

public class ValidaInteiro {

    public String valida;

    public void ValidaInterio(JFormattedTextField Numero) {
        long valor;

        if (!Numero.getText().equals("")) {
            String texto = Numero.getText();

            if (texto.indexOf('-') != -1) {

                JOptionPane.showMessageDialog(null, "Esse campo só aceita numeros inteiros positivos!",
                        "Informação", JOptionPane.INFORMATION_MESSAGE);
                Numero.setText("");
                Numero.grabFocus();
                valida = "F";
                return;

            } else {

                valida = "V";
            }

            if ((Numero.getText().length() != 0) && (valida.equals("V"))) {
                try {
                    valor = Long.parseLong(Numero.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Esse campo só aceita números!", "Informação",
                            JOptionPane.INFORMATION_MESSAGE);
                    Numero.setText("");
                    Numero.grabFocus();
                }

            }

        }
    }

}
