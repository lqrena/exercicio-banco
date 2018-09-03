
package testebanco;

import java.util.ArrayList;
import java.util.Scanner;


public class TesteBanco {

   
    public static void main(String[] args) {
        
        String nome, cpf, endereco, telefone;
        Scanner read = new Scanner(System.in);
        boolean continuar_programa = true;
        GerenciaConta gerente = new GerenciaConta();
        while(continuar_programa){
            System.out.println("Criar cliente");
            nome = read.nextLine();
            cpf = read.nextLine();
            endereco = read.nextLine();
            telefone = read.nextLine();

            gerente.criarCliente(nome, cpf, endereco, telefone);
            System.out.println("Deseja continuar");
            continuar_programa = read.nextBoolean();
        }
        
        ArrayList<Cliente> todos_clientes = gerente.todosClientes();
        for(int i = 0; i < todos_clientes.size(); i++){
            System.out.println("nome do cliente " + todos_clientes.get(i).getNome());
        }
    }
//    Scanner read = new Scanner(System.in);
//    Cliente myBank = new Cliente();
//    int contaTipo;
//
//    int serChoice = 2;
//    
//   System.out.println("MENU DE ENTRADA. BEM VINDO!!!");
//    System.out.println("-----------------------------------------------------------");
//    System.out.println("Primeiro, selecione uma das opçoes:");
//    System.out.println("-----------------------------------------------------------");
//    System.out.println("1- Contas especiais");
//    System.out.println("2- Contas normais");
//    
//    
//    contaTipo= read.nextInt();
//    
//    Conta deposito = new Conta();
//    deposito.depositar();
//    
//    if(contaTipo == 1){
//        
//        System.out.println("1) Abrir uma nova conta");
//        System.out.println("2) Depositos");
//        System.out.println("3) Saques");
//        
//        
//    } else if(contaTipo == 2){
//        
//        System.out.println("1) Abrir uma nova conta");
//        System.out.println("2) Depositos");
//        System.out.println("3) Saques");
//        
//    } else 
//        
//        System.out.println("Opção invalida. Selecione uma opção correta!");
//    
//    }
    
}
