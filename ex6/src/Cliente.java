public class Cliente extends Pessoa {
    private int idade;
    private String cpf;
    private char status; // 'A' ou 'I'

    public Cliente(String nome, String telefone, int idade, String cpf) {
        super(nome);
        this.telefone = telefone;
        this.idade = idade;
        this.cpf = cpf;
        this.status = 'A'; // ativo por padrão
    }

    public void desativar() {
        if (status == 'A') {
            status = 'I';
            System.out.println("Cliente " + nome + " desativado.");
        }
    }

    public String mostrarDados() {
        String estado = (status == 'A') ? "ativo" : "inativo";
        return nome + " – Tel:" + telefone + " – idade: " + idade + " anos – cpf: " + cpf + " - " + estado;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
}

