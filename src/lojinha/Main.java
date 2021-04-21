package lojinha;

//import java.util.ArrayList;
import java.util.Scanner;

//dei close nos scanners

public class Main {
    
    public static void main(String args[]) {
    Scanner ler = new Scanner( System.in );
    char letra;
    System.out.println("""
                        =============================MENU=============================
                        Digite a letra 'a' para entrar na área dos produtos
                        Digite a letra 'r' para entrar na área dos clientes
                        Digite a letra 'c' para entrar no carrinho
                        Digite a letra 'n' para sair do programa
                        ==============================================================
                        """);
        letra = ler.next().charAt(0);
        while(letra!= 'n'){
            switch(letra){
                case 'a' -> {
                    itens();
                    break;
                }
                case 'r' -> {
                    cliente();
                    break;
                }
                case 'c' -> {
                    int n=0;
                    int b = 0;
                    System.out.println ("Qual o cpf do cliente que irá reálizar a compra?");
                    Long a = ler.nextLong();
                    for(int i=0; i<Cliente.clientes.size(); i++){
                            if(Cliente.clientes.get(i).cpf == a){
                                n=1;
                                b = i;
                        }
                    }
                    if (n==1){
                        carrinho(b);
                    }
                    else{
                    System.out.println ("Esse cliente ainda não foi cadastrado!");
                    }
                    break;
                }
            }
            System.out.println("""
                            =============================MENU=============================
                            Digite a letra 'a' para entrar na área dos produtos
                            Digite a letra 'r' para entrar na área dos clientes
                            Digite a letra 'c' para entrar no carrinho
                            Digite a letra 'n' para sair do programa
                            ==============================================================
                            """);
            letra = ler.next().charAt(0);
        }
        ler.close();
    }

    //--------------------------------------------CLIENTE--------------------------------------------//
    private static void cliente() {
        Scanner ler = new Scanner( System.in );
        char letra;
        System.out.println("""
                    ===========================CLIENTES===============================
                        Digite a letra 'a' para cadastrar um cliente
                        Digite a letra 'r' para listar os clientes cadastrados
                        Digite a letra 'i' para excluir um cliente cadastrado
                        Digite a letra 'n' para voltar
                    ==================================================================
                    """);
        letra = ler.next().charAt(0);
        while(letra!= 'n'){
            switch(letra){
                case 'a' -> {
                    Cliente p = new Cliente();
                    Cliente.addCliente(p);
                    break;
                }
                case 'r' -> {
                    for(int i=0; i<Cliente.clientes.size(); i++){
                    Cliente.clientes.get(i).status();
                    }
                    break;
                }
                case 'i' -> {
                    System.out.println("Digite o ID do Cliente que você deseja excluir ");
                    int v = ler.nextInt();
                    for(int i=0; i<Cliente.clientes.size(); i++){
                            if(Cliente.clientes.get(i).ID == v){
                                Cliente.removeCliente(i);
                        }
                    }
                }
            }
            System.out.println("""
            ===========================CLIENTES===============================
                Digite a letra 'a' para cadastrar um cliente
                Digite a letra 'r' para listar os clientes cadastrados
                Digite a letra 'i' para excluir um cliente cadastrado
                Digite a letra 'n' para voltar
            ==================================================================
                        """);
            letra = ler.next().charAt(0);
        }
        ler.close();
    }

    //--------------------------------------------ITENS--------------------------------------------//
    private static void itens() {
        Scanner ler = new Scanner( System.in );
        char letra;
        System.out.println("""
                    ===========================PRODUTOS===============================
                        Digite a letra 'a' para adicionar um produto
                        Digite a letra 'r' para listar os produtos existentes
                        Digite a letra 'i' para excluir um produto existente
                        Digite a letra 'n' para voltar
                    ==================================================================
                    """);
        letra = ler.next().charAt(0);
        while(letra!= 'n'){
            switch(letra){
                case 'a' -> {
                    Produto p = new Produto();
                    Produto.addProduto(p);
                    break;
                }
                case 'r' -> {
                    for(int i=0; i<Produto.armazem.size(); i++){
                    Produto.armazem.get(i).status();
                    }
                    break;
                }
                case 'i' -> {
                    System.out.println("Digite o ID do produto que você deseja excluir ");
                    int v = ler.nextInt();
                    for(int i=0; i<Produto.armazem.size(); i++){
                            if(Produto.armazem.get(i).ID == v){
                                Produto.removeProduto(i);
                        }
                    }
                }
            }
            System.out.println("""
                        ===========================PRODUTOS===============================
                            Digite a letra 'a' para adicionar um produto
                            Digite a letra 'r' para listar os produtos existentes
                            Digite a letra 'i' para excluir um produto existente
                            Digite a letra 'n' para voltar
                        ==================================================================
                        """);
            letra = ler.next().charAt(0);
        }
        ler.close();
    }  
    //--------------------------------------------CARRINHO--------------------------------------------//
    private static void carrinho(int id) {
        Cliente pessoa = Cliente.clientes.get(id);
        String nome = pessoa.name;
        System.out.println("Bem Vindo Senhor(a) "+ nome);
        Scanner ler = new Scanner( System.in );
        char letra;
        System.out.println("""
                ===========================CARRINHO===============================
                    Digite a letra 'a' para adicionar um produto no carrinho
                    Digite a letra 'r' para mostrar os produtos do carrinho
                    Digite a letra 'i' para remover um produto do carrinho
                    Digite a letra 'p' para finalizar a compra
                    Digite a letra 'n' para voltar
                ==================================================================
                """);
        letra = ler.next().charAt(0);
        while(letra!= 'n'){
            switch(letra){
                    case 'a' -> {
                        for(int i=0; i<Produto.armazem.size(); i++){
                            Produto.armazem.get(i).status();
                        }
                        System.out.println("""
                                        Escolha pelo ID do produto qual você deseja 
                                        adicionar ao carrinho:    
                                """);
                    
                        int escolha = ler.nextInt();
                        
                        for(int i=0; i<Produto.armazem.size(); i++){
                        
                            if (Produto.armazem.get(i).ID == escolha){
                                pessoa.addToCarrinho(Produto.armazem.get(i),i);
                            }
                        }
                        break;
                    }

                    case 'r' -> {
                       for(int i = 0; i < pessoa.produtos.size(); i++){
                          pessoa.produtos.get(i).status();
                        }
                    }
                    case 'i' -> {
                        for(int i=0; i < pessoa.produtos.size(); i++){
                            pessoa.produtos.get(i).status();
                        }
                            System.out.println("""
                                               Escolha pelo ID do produto qual você deseja 
                                               remover ao carrinho:
                                    """);
                            
                            int escolha = ler.nextInt();
                            
                            for(int i=0; i<pessoa.produtos.size(); i++){
                            
                                if (pessoa.produtos.get(i).ID == escolha){
                                    pessoa.removeFromCarrinho(pessoa.produtos.get(i),i);
                                }
                            }
                        break;
                        
                    }
                    case 'p' -> {
                        pessoa.fechaCompra();
                        break;
                    }
            }
        System.out.println("""
                ===========================CARRINHO===============================
                    Digite a letra 'a' para adicionar um produto no carrinho
                    Digite a letra 'r' para mostrar os produtos do carrinho
                    Digite a letra 'i' para remover um produto do carrinho
                    Digite a letra 'p' para finalizar a compra
                    Digite a letra 'n' para voltar
                ==================================================================
                """);
        letra = ler.next().charAt(0);
        }
        ler.close();
    }  
}