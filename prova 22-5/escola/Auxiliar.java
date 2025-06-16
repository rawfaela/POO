package escola;

public class Auxiliar extends Professor{
    protected String formacao; //declarando variáveis
    protected double salario_final;

    public Auxiliar(String nome, int matricula, String cidade, String estado, int telefone, double salario_base, String formacao){
        super(nome, matricula, cidade, estado, telefone, salario_base);  //acessando variáveis
        this.formacao = formacao;
    }

    public void SalarioFinal(){ //criando método para calcular salário
        salario_final =  salario_base * 1.1;
    }

    public void dadosAuxiliar(){ 
        SalarioFinal(); //chamando método para calcular salário
        System.out.println("Salário final: "+salario_final);  //mostrando informações
        System.out.println("Formação: "+formacao);
    }
}
