package funcionarios;

public class Tecnico extends Funcionarios{
    protected String tipo;  //criando variável

    public Tecnico(int matricula, String nome, String sexo, int idade, double salario_base, String tipo){
        super(matricula, nome, sexo, idade, salario_base);  //pegando variáveis da classe pai
        this.tipo = tipo;  //determinando variável
    }

    @Override
    public String calcSalario(){ //calculando o salário final
        double salario_final = salario_base * 1.1;
        return "\nSalário: "+salario_final;
    }

    @Override
    public String toString(){ //mostrando informação adicional
        return super.toString()+"\nTipo: "+tipo;
    }
}