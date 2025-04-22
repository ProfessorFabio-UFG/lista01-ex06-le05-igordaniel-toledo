public class Caixa extends Funcionario {
    private String horario;

    public Caixa(String nome, String matricula) {
        super(nome, matricula);
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public double getRecebimentoAnual() {
        return salario * 12;
    }

    public void exibirDados() {
        System.out.println("Caixa: " + nome + " | Matrícula: " + matricula +
                " | Telefone: " + telefone +
                " | Horário: " + horario +
                " | Salário: " + salario);
    }
}
