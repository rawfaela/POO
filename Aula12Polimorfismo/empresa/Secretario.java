package polimorfismo12.empresa;

public class Secretario extends Funcionario{
    protected String categoria;
    protected String setor;

    public Secretario(int codigo, String nome, String sexo, int horas, float valor, String categoria, String setor){
        super(codigo, nome, sexo, horas, valor);
        this.categoria = categoria;
        this.setor = setor;
    }

    public void dadosSecretario(){
        System.out.println("Categoria: "+categoria);
        System.out.println("Setor: "+setor);
    }

    @Override
    public void Salario(){
        super.Salario();
        salario += salario * 0.05;
    }
}
