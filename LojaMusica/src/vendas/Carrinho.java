package vendas;

import java.util.Vector;
import produtos.Produto;

public class Carrinho {

    double total;
    Vector<Produto> produtos = new Vector<Produto>();

    public Carrinho(){
        this.total = 0.0;
    }

    public String toString(){
        return produtos.toString();
    }

    public void printCarrinho(){
        for(int i = 0; i < produtos.size(); i++){
            System.out.println(produtos.get(i).toString());
        }
    }

    public void addToCarrinho(Produto produto){
        this.produtos.add(produto);
        this.total += produto.getPreco();
        Produto.removeProduto(produto);
    }

    public void removeFromCarrinho(Produto produto){
        this.produtos.remove(produto);
        Produto.addProduto(produto);
    }


}
