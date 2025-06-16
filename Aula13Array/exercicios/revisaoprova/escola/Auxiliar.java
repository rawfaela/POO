package exercicios.revisaoprova.escola;

public class Auxiliar extends Professor {
    private String formacao;
    private double salario_final;

    public Auxiliar(String nome, int matricula, String cidade, String estado, int telefone, double salario_base, String formacao) {
        super(nome, matricula, cidade, estado, telefone, salario_base);
        this.formacao = formacao;
        SalarioFinal();
    }

    private void SalarioFinal() {
        this.salario_final = salario_base * 1.1;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Formação: " + formacao +
               ", Salário Final: " + salario_final;
    }
}
