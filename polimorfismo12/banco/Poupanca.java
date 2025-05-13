package polimorfismo12.banco;

public class Poupanca extends Cliente{
    protected String tipomov;
    protected float valormov;
    
    public Poupanca(int codigo, String nome, String cliente, String sexo, int data, float saldo, String tipomov, float valormov){
        super(codigo, nome, cliente, sexo, data, saldo);
        this.tipomov = tipomov;
        this.valormov = valormov;
    }

    public void dadosPoupanca(){
        System.out.println("Tipo de movimentação: "+tipomov);
        System.out.println("Valor da movimentação: "+valormov);
    }
}
