package funcionarios;

public class Funcionarios {
    protected int matricula;
    protected String nome;
    protected String sexo;
    protected int idade;
    protected double salario_base;  //criando variáveis

    public Funcionarios(int matricula, String nome, String sexo, int idade, double salario_base){
        this.matricula = matricula;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.salario_base = salario_base;  //determinando variáveis
    }

    public String calcSalario(){  //calculando o salário base
        double salario_final =  0;
        return "\nSalário: "+salario_final;
    }

    @Override
    public String toString(){   //mostrando informações 
        return "\nRelatório do Funcionário\nMatrícula: "+matricula+"\nNome: "+nome+"\nSexo: "+sexo+"\nIdade: "+idade+calcSalario();  //chamando função do cálculo do salário
    }
}