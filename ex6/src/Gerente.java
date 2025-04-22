public class Gerente extends Funcionario {
    private double bonificacao;
    private String tipo; // PF ou PJ

    public Gerente(String nome, String matricula) {
        super(nome, matricula);
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double getRecebimentoAnual() {
        return (salario * 12) + (bonificacao * 12);
    }

    public void exibirDados() {
        System.out.println("Gerente: " + nome + " | Matrícula: " + matricula +
                " | Telefone: " + telefone +
                " | Tipo: " + tipo +
                " | Salário: " + salario +
                " | Bonificação: " + bonificacao);
    }
}
