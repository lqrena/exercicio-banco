package testebanco;

import java.util.Scanner;

public class Conta {
        
    
        private double valorDeposito;
        private double saldo;
        private int NumeroConta;
        
        public Conta(int NumeroConta){
            
            this.saldo = 0;
            this.NumeroConta = NumeroConta;
        }

    public double getValorDeposito() {
        return valorDeposito;
    }

    public void setValorDeposito(double valorDeposito) {
        this.valorDeposito = valorDeposito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(int NumeroConta) {
        this.NumeroConta = NumeroConta;
    }
       
                
    public void depositar() {
        
        Scanner read = new Scanner (System.in);
        System.out.println("Digite o valor que deseja depositar: ");
        this.setValorDeposito(read.nextDouble());
        
        
    }

}
