package servicos;

public class Limpeza extends Servicos{
    protected String tipo;
    protected double valor_hora; //criando variáveis

    public Limpeza(int codigo, String descricao, String tecnico, double tempo_duracao, String tipo, double valor_hora){ 
        super(codigo, descricao, tecnico, tempo_duracao); //pegando variáveis da classe pai
        this.tipo = tipo;
        this.valor_hora = valor_hora; //determinando 
    }

    @Override
    public String calcCusto(){ //calculando o custo 
        double custo = tempo_duracao*valor_hora;
        return "\nCusto do serviço: "+custo;
    }
    
    @Override
    public String toString(){   //mostrando informações adicionais
        return super.toString()+"\nTipo: "+tipo+"\nValor da hora: "+valor_hora;
    }
}