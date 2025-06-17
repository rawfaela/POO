package funcionarios;

public class Supervisor extends Funcionarios{
    protected String setor;  //criando variável
    
    public Supervisor(int matricula, String nome, String sexo, int idade, double salario_base, String setor){
        super(matricula, nome, sexo, idade, salario_base);  //pegando variáveis da classe pai
        this.setor = setor; //determinando variável
    }

    @Override
    public String calcSalario(){ //calculando o salário final
        double salario_final = salario_base * 1.2;
        return "\nSalário: "+salario_final;
    }

    @Override
    public String toString(){ //mostrando informação adicional
        return super.toString()+"\nSetor: "+setor;
    }
}