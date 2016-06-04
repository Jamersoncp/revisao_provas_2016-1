package br.edu.grupointegrado.controle;

/**
 *
 * @author Jamerson
 */
public class MovNf {
    
    private int cdNf;
    private String srNF;
    private String dtNf;
    
    private Operacao operacao = new Operacao();
    private FormaPagamento formapagamento = new FormaPagamento();
    private Pessoa pessoa = new Pessoa();

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
