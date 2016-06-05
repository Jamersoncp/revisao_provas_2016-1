package br.edu.grupointegrado.controle;

import br.edu.grupointegrado.conexao.ConexaoOracle;
import java.sql.SQLException;

/**
 *
 * @author Jamerson
 */
public class Itens {

    private int cdItem;
    private String dsItem;
    private double vlItem;
    private int qtEstoque;

    public int getCdItem() {
        return cdItem;
    }

    public void setCdItem(int cdItem) {
        this.cdItem = cdItem;
    }

    public String getDsItem() {
        return dsItem;
    }

    public void setDsItem(String dsItem) {
        this.dsItem = dsItem;
    }

    public double getVlItem() {
        return vlItem;
    }

    public void setVlItem(double vlItem) {
        this.vlItem = vlItem;
    }

    public int getQtEstoque() {
        return qtEstoque;
    }

    public void setQtEstoque(int qtEstoque) {
        this.qtEstoque = qtEstoque;
    }

}
