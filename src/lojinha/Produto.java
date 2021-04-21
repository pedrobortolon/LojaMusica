package lojinha;

import java.util.Scanner;
import java.util.ArrayList;

public class Produto {
    private static int nprodutos = 0;
    int ID;
    String name;
    String marca;
    String desc;
    double preco;
    static ArrayList<Produto> armazem = new ArrayList<Produto>(); 

    public Produto(){
        Scanner ler = new Scanner( System.in );
        System.out.println("Nome do produto: ") ;
        String n = ler.nextLine();
        System.out.println("Marca do produto: ") ;
        String m = ler.nextLine();
        System.out.println("Descricão do produto: ") ;
        String d = ler.nextLine();
        System.out.println("Preço do produto: ") ;
        float p = ler.nextFloat();  
        this.setName(n);
        this.setMarca(m);
        this.setDesc(d);
        this.setPreco(p);
        this.ID = ++nprodutos;
        ler.close();
    }
    
    public void status (){
        System.out.println("ID do produto: "+ this.ID) ;
        System.out.println("Nome do produto: "+ this.name) ;
        System.out.println("Marca do produto: "+ this.marca) ;
        System.out.println("Descricão do produto: "+ this.desc) ;
        System.out.println("Preço do produto: "+ this.preco) ;
        System.out.println("\n") ;
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

    public static void removeProduto(int a) {
        armazem.remove(a);
    }

    public static int getNprodutos() {
        return nprodutos;
    }

    public static void setNprodutos(int nprodutos) {
        Produto.nprodutos = nprodutos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    
}
