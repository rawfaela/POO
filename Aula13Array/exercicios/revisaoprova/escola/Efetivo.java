package exercicios.revisaoprova.escola;

public class Efetivo extends Professor{
    protected String disciplina; //declarando variáveis
    protected int nrhoras;
    protected double salario_final;

    public Efetivo(String nome, int matricula, String cidade, String estado, int telefone, double salario_base, String disciplina, int nrhoras){
        super(nome, matricula, cidade, estado, telefone, salario_base);  //acessando variáveis
        this.disciplina = disciplina;
        this.nrhoras = nrhoras;
        SalarioFinal();
    }

    private void SalarioFinal(){ //criando método para calcular salário
        this.salario_final =  salario_base * 1.2;
    }

    @Override
    public String toString(){
        return super.toString()+", Disciplina: "+disciplina+", Nº de horas: "+nrhoras+", Salário final: "+salario_final;
    }
}
