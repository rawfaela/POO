package escola;

public class Temporario extends Professor {
    protected int data_inicio; //declarando variáveis
    protected int data_fim;
    protected double salario_final;

    public Temporario(String nome, int matricula, String cidade, String estado, int telefone, double salario_base, int data_inicio, int data_fim){
        super(nome, matricula, cidade, estado, telefone, salario_base); //acessando variáveis
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
    }

    public void SalarioFinal(){  //criando método para calcular salário
        salario_final =  salario_base * 1.05;
    }

    public void dadosTemporario(){
        SalarioFinal();  //chamando método para calcular salário
        System.out.println("Salário final: "+salario_final); //mostrando informações
        System.out.println("Data de início: "+data_inicio);
        System.out.println("Data de fim: "+data_fim);
    }
}
