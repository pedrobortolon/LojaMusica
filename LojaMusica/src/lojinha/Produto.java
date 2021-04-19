package produtos;

import java.util.Vector;

public class Produto {
    private static int nprodutos = 0;
    int ID;
    String name;
    String marca;
    String desc;
    double preco;
    public static Vector<Produto> armazem;

    public static Vector<Produto> getArmazem() {
        return armazem;
    }

    public Produto(){
        this.ID = ++nprodutos;
    }

    public Produto(String name, String marca, String desc, double preco) {
        this.name = name;
        this.preco = preco;
        this.marca = marca;
        this.desc = desc;
        this.ID = ++nprodutos;
        armazem.add(this);
    }


    @Override
    public String toString() {
        return "Produto ID:" + ID + ", nome:" + name + ", preço:" + preco;
    }


    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void addProduto(Produto produto) {
        armazem.add(produto);
    }

    public static void removeProduto(Produto produto) {
        armazem.remove(produto);
    }

    
}
