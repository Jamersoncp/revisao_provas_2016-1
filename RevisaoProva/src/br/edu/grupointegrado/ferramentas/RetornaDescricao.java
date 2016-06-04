package br.edu.grupointegrado.ferramentas;

import br.edu.grupointegrado.conexao.ConexaoOracle;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RetornaDescricao extends ConexaoOracle {

    public String retornadados(JTextField campo, String tabela, String retorno) {
        if (!campo.getText().equals("")) {
            executeSQL(" SELECT " + retorno + " AS RETORNO FROM " + tabela + " WHERE " + campo.getName() + " = " + campo.getText());
            try {
                resultset.first();
                return resultset.getString("RETORNO");

            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Dados não encontrado");
                campo.setText("");
                campo.grabFocus();
                //return "";
            }

        }
        return "";
    }
}
