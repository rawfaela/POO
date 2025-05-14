package polimorfismo12.empresa;

public class Diretor extends Funcionario{
    protected String areagestao;

    public Diretor(int codigo, String nome, String sexo, int horas, float valor, String areagestao){
        super(codigo, nome, sexo, horas, valor);
        this.areagestao = areagestao;
    }

    public void dadosDiretor(){
        System.out.println("Área de gestão: "+areagestao);
    }

    @Override
    public void Salario(){
        super.Salario();
        salario += salario * 0.02;
    }
}
