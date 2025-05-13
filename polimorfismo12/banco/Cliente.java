package polimorfismo12.banco;

public class Cliente {
    protected int codigo;
    protected String nome;
    protected String cliente;
    protected String sexo;
    protected int data;
    protected float saldo;

    public Cliente(int codigo, String nome, String cliente, String sexo, int data, float saldo){
        this.codigo = codigo;
        this.nome = nome;
        this.cliente = cliente;
        this.sexo = sexo;
        this.data= data;
        this.saldo = saldo;
    }

    public void dados(String cliente){
        System.out.println("Relatório dos clientes de conta "+cliente+" do banco!");
        System.out.println("Código: "+codigo);
        System.out.println("Nome: "+nome);
        System.out.println("Cliente: "+cliente);
        System.out.println("Sexo: "+sexo);
        System.out.println("Data: "+data);
        System.out.println("Saldo: "+saldo);
    }
}
