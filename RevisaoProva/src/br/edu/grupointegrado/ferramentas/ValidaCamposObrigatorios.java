package br.edu.grupointegrado.ferramentas;

import br.edu.grupointegrado.conexao.ConexaoOracle;
import java.awt.Component;
import java.awt.Container;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ValidaCamposObrigatorios extends ConexaoOracle {

    private boolean retorno;

    public void ValidaCamposObrigatorios(Container container, String tabela) {

        executeSQL("SELECT * FROM " + tabela + " WHERE ROWNUM = 1");
        setRetorno(true);
        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                JTextField field = (JTextField) component;
                String nome = field.getName();
                String conteudo = field.getText();
                String text = field.getToolTipText();
                int chave = field.getColumns();

                try {

                    int numCols = metaData.getColumnCount();

                    for (int conta = 1; conta <= numCols; conta++) {
                        String colsName = metaData.getColumnName(conta);
                        int obrigatorio = metaData.isNullable(conta);
                        if (colsName.equals(nome)) {
                            if (conteudo.equals("") && obrigatorio == 0) {
                                if (chave != 1) {
                                    JOptionPane.showMessageDialog(null, "Campo " + text + " é obrigatório");
                                    field.grabFocus();
                                    setRetorno(false);
                                    return;
                                }
                            }
                        }
                    }

                } catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, erro);
                }
            }
        }
    }

    public boolean getRetorno() {
        return retorno;
    }

    public void setRetorno(boolean retorno) {
        this.retorno = retorno;
    }

    

}
