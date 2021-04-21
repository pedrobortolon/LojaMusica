package lojinha;


import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Carrinho{
    
    static int nclientes = 0;
    int ID;
    String name;
    long cpf;
    long tel;
    static ArrayList<Cliente> clientes = new ArrayList<Cliente>(); 
    
    public Cliente() {
        Scanner ler = new Scanner( System.in );
        System.out.println("Nome do Cliente: ") ;
        String n = ler.nextLine();
        System.out.println("Telefone: ") ;
        long d = (long) ler.nextDouble();
        System.out.println("CPF: ") ;
        long p = (long) ler.nextDouble();  
        this.setName(n);
        this.setCpf(p);
        this.setTel(d);
        this.ID = ++nclientes;
        ler.close();
    }
        public void status (){
        System.out.println("ID do Cliente: "+ this.ID) ;
        System.out.println("Nome do Cliente: "+ this.name) ;
        System.out.println("CPF: "+ this.cpf) ;
        System.out.println("Telefone: "+ this.tel) ;
        System.out.println("\n") ;
            }

    public static int getNclientes() {
        return nclientes;
    }

    public static void setNclientes(int nclientes) {
        Cliente.nclientes = nclientes;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public double getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }
    public static void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public static void removeCliente(int a) {
        clientes.remove(a);
    }

    //criei essa função
    public void fechaCompra(){
        for(int i=0; i < produtos.size(); i++){
            produtos.get(i).status();
        }
        System.out.println("Nome: " + name);
        System.out.println("CPF: " + cpf);
        System.out.println("Total a pagar: " + total);

        produtos.clear();
    }
}
