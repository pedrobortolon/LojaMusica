package vendas;

import java.util.Vector;

import produtos.Produto;

public class Carrinho extends Produto{
    Vector<Produto> produtos;
    double total;

    public void addProduto(Produto produto){
        this.produtos.add(produto);
        this.total += produto.getPreco();
    }

    public String toString(){
        return produtos.toString();
    }

    public void printCarrinho(){
        for(int i = 0; i < produtos.size(); i++){
            System.out.println(produtos.get(i).toString());
        }
    }
}
