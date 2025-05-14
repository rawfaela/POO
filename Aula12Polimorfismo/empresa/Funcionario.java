package polimorfismo12.empresa;

public class Funcionario {
    protected int codigo;
    protected String nome;
    protected String sexo;
    protected int horas;
    protected float valor;
    public float salario;

    public Funcionario(int codigo, String nome, String sexo, int horas, float valor){
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.horas = horas;
        this.valor = valor;
    }

    public void Salario(){
        salario = horas*valor;
    }

    public void dados(String func){
        Salario();
        System.out.println("Relatório do funcionário "+func+"!");
        System.out.println("Código: "+codigo);
        System.out.println("Nome: "+nome);
        System.out.println("Sexo: "+sexo);
        System.out.println("Horas: "+horas);
        System.out.println("Valor: "+valor);
        System.out.println("Salário: "+salario);
    }
}
