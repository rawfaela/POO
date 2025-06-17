package servicos;

public class Atualizacao extends Servicos{
    protected String versao;
    protected double valor_hora; //criando variáveis

    public Atualizacao(int codigo, String descricao, String tecnico, double tempo_duracao, String versao, double valor_hora){
        super(codigo, descricao, tecnico, tempo_duracao); //pegando variáveis da classe pai
        this.versao = versao;
        this.valor_hora = valor_hora; //determinando variáveis
    }
    
    @Override
    public String calcCusto(){ //calculando o custo 
        double custo = tempo_duracao*valor_hora;
        return "\nCusto do serviço: "+custo;
    }
    
    @Override
    public String toString(){   //mostrando informações adicionais
        return super.toString()+"\nVersão: "+versao+"\nValor da hora: "+valor_hora;
    }
}