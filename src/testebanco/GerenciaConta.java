/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testebanco;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author loren
 */
public class GerenciaConta {

    ArrayList<Cliente> clientes;

    public GerenciaConta() {
        this.clientes = new ArrayList<Cliente>();
    }

    public void criarCliente() {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = read.nextLine();
        System.out.println("Digite seu cpf:");
        String cpf = read.nextLine();
        System.out.println("Digite seu endereço");
        String endereco = read.nextLine();
        System.out.println("Digite seu telefone:");
        String telefone = read.nextLine();
        System.out.println("Digite 1 para conta Comum ou 2 para conta especial!");
        int tipoConta = read.nextInt();
        
       //Cria um novo cliente
        Cliente novo_cliente = new Cliente(endereco, telefone, cpf, nome, tipoConta);
        //Cria uma conta e atrela ao mesmo cliente
        this.CriarConta(novo_cliente);
            
        try {
            clientes.add(novo_cliente);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

        public void CriarConta(Cliente cliente){
            
            if(cliente.getTipoConta()== 1){
              Scanner read = new Scanner(System.in);
              System.out.println("Digite o numero da sua conta:");
              cliente.setConta( new Conta( read.nextInt() ) );
            }else{
                Scanner read = new Scanner(System.in);
                System.out.println("Digite o numero da sua conta:");
                cliente.setConta_especial(new ContaEspecial() );
            }
        }
        
    
    public ArrayList<Cliente> todosClientes() {
        return clientes;
    }
}
