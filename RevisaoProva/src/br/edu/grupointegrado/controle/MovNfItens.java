package br.edu.grupointegrado.controle;

import br.edu.grupointegrado.conexao.ConexaoOracle;
import static br.edu.grupointegrado.conexao.ConexaoOracle.resultset;


/**
 *
 * @author Jamerson
 */
public class MovNfItens extends ConexaoOracle{

    private double vlItem;
    private int qtItem;

    private Itens iten = new Itens();
    private MovNf movnf = new MovNf();
    private Pessoa pessoa = new Pessoa();

    StringBuffer sql = new StringBuffer();

    public MovNfItens() {

    }

    public void incluirItensNf() {

        sql.delete(0, sql.length());
        sql.append("INSERT INTO MOV_NF_ITEM (CD_ITEM,SR_NF,CD_NF,CD_PESSOA,VL_ITEM,QT_ITEM) VALUES (");
        sql.append(getIten().getCdItem()).append(",");
        sql.append(getMovnf().getSrNF()).append(",");
        sql.append(getMovnf().getCdNf()).append(",");
        sql.append(getPessoa().getCdPessoa()).append(",");
        sql.append(getVlItem()).append(",");
        sql.append(getQtItem()).append(")");

        System.out.println(sql.toString());

        super.incluirsql(sql.toString());
    }
    


    public double getVlItem() {
        return vlItem;
    }

    public void setVlItem(double vlItem) {
        this.vlItem = vlItem;
    }

    public int getQtItem() {
        return qtItem;
    }

    public void setQtItem(int qtItem) {
        this.qtItem = qtItem;
    }

    public Itens getIten() {
        return iten;
    }

    public void setIten(Itens iten) {
        this.iten = iten;
    }

    public MovNf getMovnf() {
        return movnf;
    }

    public void setMovnf(MovNf movnf) {
        this.movnf = movnf;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

}
