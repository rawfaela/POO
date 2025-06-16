package escola;

public class Efetivo extends Professor{
    protected String disciplina; //declarando variáveis
    protected int nrhoras;
    protected double salario_final;

    public Efetivo(String nome, int matricula, String cidade, String estado, int telefone, double salario_base, String disciplina, int nrhoras){
        super(nome, matricula, cidade, estado, telefone, salario_base);  //acessando variáveis
        this.disciplina = disciplina;
        this.nrhoras = nrhoras;
    }

    public void SalarioFinal(){ //criando método para calcular salário
        salario_final =  salario_base * 1.2;
    }

    public void dadosEfetivo(){
        SalarioFinal(); //chamando método para calcular salário
        System.out.println("Salário final: "+salario_final);   //mostrando informações
        System.out.println("Disciplina: "+disciplina);
        System.out.println("Nº de horas: "+nrhoras);
    }
}
