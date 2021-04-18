package produtos;

import java.util.Vector;

public class Produto {
    private static int nprodutos = 0;
    int ID;
    String name;
    double preco;
    public static Vector<Produto> armazem;


    public Produto(String name, double preco) {
        this.name = name;
        this.preco = preco;
        this.ID = nprodutos++;
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

    
}
