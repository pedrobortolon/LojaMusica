package lojinha;


import java.util.ArrayList;


public class Carrinho {

    double total;
    //removi o static (um carrinho para cada cliente)
    ArrayList<Produto> produtos = new ArrayList<Produto>(); 

    public Carrinho(){
        this.total = 0.0;
    }

    public void addToCarrinho(Produto produto, int a){
        produtos.add(produto);
        this.total += produto.getPreco();
        Produto.removeProduto(a);
    }

    //ajeitei essa função
    public void removeFromCarrinho(Produto produto, int a) {
        produtos.remove(a);
        this.total -= produto.getPreco();
        Produto.addProduto(produto);
    }
}