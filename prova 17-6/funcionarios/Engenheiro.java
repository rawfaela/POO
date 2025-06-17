package funcionarios;

public class Engenheiro extends Funcionarios{
    protected String area_atuacao; //criando variável

    public Engenheiro(int matricula, String nome, String sexo, int idade, double salario_base, String area_atuacao){
        super(matricula, nome, sexo, idade, salario_base); //pegando variáveis da classe pai
        this.area_atuacao = area_atuacao;   //determinando variável
    }

    @Override
    public String calcSalario(){ //calculando o salário final
        double salario_final = salario_base * 1.15;
        return "\nSalário: "+salario_final;
    }

    @Override
    public String toString(){ //mostrando informação adicional
        return super.toString()+"\nÁrea de atuação: "+area_atuacao;
    }
}