package ex.dois.produto;

public class Produto {

    private String produto = null;
    private Double  valor = null;

    public Produto(String produto, Double valor){
        this.produto = produto;
        this.valor = valor;
    }

    public String getProduto(){
        return this.produto;
    }

    public Double getValor(){
        return this.valor;
    }
}
