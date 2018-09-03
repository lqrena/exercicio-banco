/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testebanco;

import java.util.ArrayList;

/**
 *
 * @author loren
 */
public class GerenciaConta {
    
    ArrayList<Cliente> clientes;
    
    public GerenciaConta(){
        this.clientes = new ArrayList<Cliente>();
    }
    
    public void criarCliente(String nome, String cpf, String endereco, String telefone){
        Cliente novo_cliente = new Cliente(endereco, telefone, cpf, nome);
        
        //tentativa de "se der certo ou nao" seguir enfrente 
        try{
            clientes.add(novo_cliente);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public ArrayList<Cliente> todosClientes(){
        return clientes;
    }
}
