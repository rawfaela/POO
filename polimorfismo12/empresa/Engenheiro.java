package polimorfismo12.empresa;

public class Engenheiro extends Funcionario{
    protected int ncrea;
    protected String especializacao;

    public Engenheiro(int codigo, String nome, String sexo, int horas, float valor, int ncrea, String especializacao){
        super(codigo, nome, sexo, horas, valor);
        this.ncrea = ncrea;
        this.especializacao = especializacao;
    }

    public void dadosEngenheiro(){
        System.out.println("Nº CREA: "+ncrea);
        System.out.println("Especialização: "+especializacao);
    }

    @Override
    public void Salario(){
        super.Salario();
        salario += salario * 0.05;
    }
}