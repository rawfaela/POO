package exercicios.revisaoprova.escola;

public class Professor {
    protected String nome;
    protected int matricula;
    protected String cidade;
    protected String estado;
    protected int telefone;
    protected double salario_base;

    public Professor(String nome, int matricula, String cidade, String estado, int telefone, double salario_base) {
        this.nome = nome;
        this.matricula = matricula;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.salario_base = salario_base;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
               ", Matrícula: " + matricula +
               ", Cidade: " + cidade +
               ", Estado: " + estado +
               ", Telefone: " + telefone +
               ", Salário Base: " + salario_base;
    }
}
