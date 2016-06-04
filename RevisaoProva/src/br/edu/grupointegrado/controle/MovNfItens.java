
package br.edu.grupointegrado.controle;

/**
 *
 * @author Jamerson
 */
public class MovNfItens {
    
    
    private double vlItem;
    private int qtItem;
    
    private Itens iten = new Itens();
    private MovNf movnf = new MovNf();
    private Pessoa pessoa = new Pessoa();

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
