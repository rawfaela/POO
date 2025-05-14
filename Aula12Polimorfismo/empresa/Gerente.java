package polimorfismo12.empresa;

public class Gerente extends Funcionario{
    protected String setor;

    public Gerente(int codigo, String nome, String sexo, int horas, float valor, String setor){
        super(codigo, nome, sexo, horas, valor);
        this.setor=setor;
    }

    public void dadosGerente(){
        System.out.println("Setor: "+setor);
    }

    @Override
    public void Salario(){
        super.Salario();
        salario += salario * 0.02;
    }
}
