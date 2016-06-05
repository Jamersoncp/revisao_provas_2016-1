package br.edu.grupointegrado.controle;

import br.edu.grupointegrado.conexao.ConexaoOracle;

/**
 *
 * @author Jamerson
 */
public class MovNf extends ConexaoOracle{

    private int cdNf;
    private String srNF;
    private String dtNf;

    private Operacao operacao = new Operacao();
    private FormaPagamento formapagamento = new FormaPagamento();
    private Pessoa pessoa = new Pessoa();

    StringBuffer sql = new StringBuffer();

    public MovNf() {

    }

    public void incluirMovNf() {

        sql.delete(0, sql.length());
        setCdNf(Integer.parseInt(super.ultimasequencia("MOV_NF", "CD_NF")));

        sql.append("INSERT INTO MOV_NF (CD_NF,SR_NF,CD_PESSOA,DT_NF,CD_OPERACAO,CD_FORMA) VALUES (");
        sql.append(getCdNf()).append(",");
        sql.append(getSrNF()).append(",");
        sql.append(getPessoa().getCdPessoa()).append(",'");
        sql.append(getDtNf()).append("',");
        sql.append(getOperacao().getCdOperacao()).append(",");
        sql.append(getFormapagamento().getCdForma()).append(")");
        
        System.out.println(sql.toString());
        
        super.incluirsql(sql.toString());
    }
    
      public void excluirOs() {

        sql.delete(0, sql.length());
        sql.append("DELETE FROM MOV_NF WHERE CD_NF = ").append(getCdNf());
        super.deleteSQL(sql.toString());

//        sql.delete(0, sql.length());
//        sql.append("DELETE FROM MOV_OS_SERVICO WHERE CD_OS = ").append(getCdNf());
//        super.deleteSQL(sql.toString());
//
//        sql.delete(0, sql.length());
//        sql.append("DELETE FROM CAD_OS WHERE CD_OS = ").append(getCdNf());
//        System.out.println(sql.toString());
        super.deleteSQL(sql.toString());
    }

    public int getCdNf() {
        return cdNf;
    }

    public void setCdNf(int cdNf) {
        this.cdNf = cdNf;
    }

    public String getSrNF() {
        return srNF;
    }

    public void setSrNF(String srNF) {
        this.srNF = srNF;
    }

    public String getDtNf() {
        return dtNf;
    }

    public void setDtNf(String dtNf) {
        this.dtNf = dtNf;
    }

    public Operacao getOperacao() {
        return operacao;
    }

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    public FormaPagamento getFormapagamento() {
        return formapagamento;
    }

    public void setFormapagamento(FormaPagamento formapagamento) {
        this.formapagamento = formapagamento;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

}
