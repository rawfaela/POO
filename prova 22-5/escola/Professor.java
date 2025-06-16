package escola;

public class Professor{
    protected String nome;  //declarando variáveis
    protected int matricula;
    protected String cidade;
    protected String estado;
    protected int telefone;
    protected double salario_base;

    public Professor(String nome, int matricula, String cidade, String estado, int telefone, double salario_base){
        this.nome = nome; //acessando variáveis
        this.matricula = matricula;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.salario_base = salario_base;
    }

    public void dados(String prof){ //"String prof" para mandar e aparecer na tela qual o tipo de professor
        System.out.println(""); //mostrando informações
        System.out.println("Relatório do professor "+prof);
        System.out.println("Nome: "+nome);
        System.out.println("Matrícula: "+matricula);
        System.out.println("Cidade: "+cidade);
        System.out.println("Estado: "+estado);
        System.out.println("Telefone: "+telefone);
        System.out.println("Salario base: "+salario_base);
    }
}