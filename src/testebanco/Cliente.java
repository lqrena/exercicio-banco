
package testebanco;


class Cliente {
    
    private String endereco;
    private String telefone;
    private String cpf;
    private String nome;

    public Cliente(String endereco, String telefone, String cpf, String nome){
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.nome = nome;
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
