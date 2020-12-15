public class Produto {
    int codigo, quantidade, quantidadeMinima=8;
    double valor;
    String descricao;

    Produto(int codigo, int quantidade,double valor, String descricao){
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.valor = valor;
        this.descricao = descricao;
    }

    boolean baixar(int quantidade){
        if((this.quantidade - quantidade) < quantidadeMinima){
            return false;
        }
        else{
            this.quantidade -= quantidade;
            return true;
        }
    }

    void repor(int quantidade){
        this.quantidade += quantidade;
    }

    void reajuste(double taxa){
        this.valor = this.valor + ((this.valor / 100) *taxa);
    }

    public String toString(){
        return "Codigo: " + this.codigo + "\nQuantidade: " + this.quantidade + "\nValor: R$" + this.valor + "\nDescricao: " + this.descricao;
    }

    boolean equals(Produto produto){
        if(this.codigo == produto.codigo){
            return true;
        }
        else{
            return false;
        }
    }
}
