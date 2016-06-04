
package br.edu.grupointegrado.controle;

/**
 *
 * @author Jamerson
 */
public class MovParcelas {
    
    private String dtPago;
    private String dtPagamento;
    private double vlPago;
    private double vlPamento;
    
    private MovNf movnf = new MovNf();
    private Pessoa pessoa = new Pessoa();
    private FormaPagamento formapamento = new FormaPagamento();

    public String getDtPago() {
        return dtPago;
    }

    public void setDtPago(String dtPago) {
        this.dtPago = dtPago;
    }

    public String getDtPagamento() {
        return dtPagamento;
    }

    public void setDtPagamento(String dtPagamento) {
        this.dtPagamento = dtPagamento;
    }

    public double getVlPago() {
        return vlPago;
    }

    public void setVlPago(double vlPago) {
        this.vlPago = vlPago;
    }

    public double getVlPamento() {
        return vlPamento;
    }

    public void setVlPamento(double vlPamento) {
        this.vlPamento = vlPamento;
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

    public FormaPagamento getFormapamento() {
        return formapamento;
    }

    public void setFormapamento(FormaPagamento formapamento) {
        this.formapamento = formapamento;
    }
    
    
}
