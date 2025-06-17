package servicos;

public class Formatacao extends Servicos{
    protected String formato;
    protected double valor_hora; //criando variáveis

    public Formatacao(int codigo, String descricao, String tecnico, double tempo_duracao, String formato, double valor_hora){
        super(codigo, descricao, tecnico, tempo_duracao); //pegando variáveis da classe pai
        this.formato = formato;
        this.valor_hora = valor_hora; //determinando variáveis
    }

    @Override
    public String calcCusto(){ //calculando o custo 
        double custo = tempo_duracao*valor_hora;
        return "\nCusto do serviço: "+custo;
    }
    
    @Override
    public String toString(){   //mostrando informações adicionais
        return super.toString()+"\nFormato: "+formato+"\nValor da hora: "+valor_hora;
    }
}