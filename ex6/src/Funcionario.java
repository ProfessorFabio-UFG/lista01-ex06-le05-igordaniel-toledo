public abstract class Funcionario extends Pessoa {
    protected String matricula;
    protected double salario;

    public Funcionario(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public void aumentarSalario(double percentual) {
        salario += salario * (percentual / 100);
    }

    public abstract double getRecebimentoAnual();

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
