package testebanco;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteBanco {

    public static void main(String[] args) {

        
        Scanner read = new Scanner(System.in);
        boolean continuar_programa = true;
       
        System.out.println("MENU DE ENTRADA. BEM VINDO!!!");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Primeiro, selecione uma das opçoes:");
        System.out.println("-----------------------------------------------------------");
        System.out.println("1- Cadastrar conta");
        System.out.println("3- Relatorios");
        System.out.println("4- Movimentação");
        System.out.println("5- Sair");

        GerenciaConta cadastro = new GerenciaConta();
        
        while (continuar_programa) {
            //esta setado manualmente para a opcao de cadastro
            int opcoes_menu = 1;
            switch(opcoes_menu){
                case 1:
                    System.out.println("Voce selecionou a opção de Cadastro!");
                    cadastro.criarCliente();
                    break;
                case 4:
                    
            }
    
            System.out.println("Deseja continuar");
            continuar_programa = read.nextBoolean();
        }

        //quando o while terminar sera mostrado a lista de clientes
        ArrayList<Cliente> todos_clientes = cadastro.todosClientes();
        for (int i = 0; i < todos_clientes.size(); i++) {
            System.out.println("nome do cliente " + todos_clientes.get(i).getNome());
            if(todos_clientes.get(i).getTipoConta() == 1){
                System.out.println("conta do cliente " + todos_clientes.get(i).getConta().getNumeroConta());
                System.out.println("saldo do cliente " + todos_clientes.get(i).getConta().getSaldo());
            }else{
                System.out.println("conta do cliente " + todos_clientes.get(i).getConta_especial().getNumeroConta());
                System.out.println("saldo do cliente " + todos_clientes.get(i).getConta_especial().getSaldo());
            }    
        }
    }
}

