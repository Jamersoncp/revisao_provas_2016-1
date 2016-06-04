package br.edu.grupointegrado.ferramentas;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

public class LimparCampos {

    public void LimparCampos(Container container) {
        Component compnents[] = container.getComponents();

        for (Component component : compnents) {
            if (component instanceof JTextField) {
                JTextField field = (JTextField) component;
                field.setText("");
            }
            if (component instanceof JFormattedTextField) {
                JFormattedTextField field = (JFormattedTextField) component;
                field.setText("");
            }
//            if (component instanceof JButton) {
//                JButton field = (JButton) component;
//                field.setText("");
//            }
        }
    }

}
