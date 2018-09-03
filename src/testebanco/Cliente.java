
package testebanco;


class Cliente {
    
    private String endereco;
    private String telefone;
    private String cpf;
    private String nome;
    private int tipoConta;
    private Conta conta;
    private ContaEspecial conta_especial;

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public ContaEspecial getConta_especial() {
        return conta_especial;
    }

    public void setConta_especial(ContaEspecial conta_especial) {
        this.conta_especial = conta_especial;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Cliente(String endereco, String telefone, String cpf, String nome, int tipoConta){
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.nome = nome;
        this.tipoConta = tipoConta;
        
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;  
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    
    }
    
    
}
