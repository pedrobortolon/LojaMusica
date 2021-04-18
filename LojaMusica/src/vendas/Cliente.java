package vendas;

import java.util.Vector;

import produtos.Produto;

public class Cliente {
    
    static int nclientes = 0;
    int ID;
    String name;
    Carrinho carrinho;
    double saldo;
    double total;


    public Cliente(String name) {
        this.name = name;
        this.saldo = 0;
        this.ID = nclientes + 1;
        nclientes += 1;
    }

    public Cliente(String name, double saldo) {
        this.name = name;
        this.saldo = saldo;
        this.ID = nclientes + 1;
        nclientes += 1;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaldo() {
        return saldo;
    }

    public void addSaldo(double credit) {
        this.saldo += credit;
    }

    @Override
    public String toString() {
        return ("ID:" + ID + "\nnome: " + name + "\ntotal:" + total);
    }

    public void addToCarrinho(Produto produto){
        carrinho.produtos.add(produto);
    }

    public void removeFromCarrinho(String produto){
        carrinho.produtos.remove(produto);
    }

}
