package servicos;

public class Servicos {
    protected int codigo;
    protected String descricao;
    protected String tecnico;
    protected double tempo_duracao;  //criando variáveis
    
    public Servicos(int codigo, String descricao, String tecnico, double tempo_duracao){
        this.codigo = codigo;
        this.descricao = descricao;
        this.tecnico = tecnico;
        this.tempo_duracao = tempo_duracao; //determinando variáveis
    }

    public String calcCusto(){ //calculando o custo 
        double custo = 0;
        return "\nCusto do serviço: "+custo;
    }
    
    @Override
    public String toString(){   //mostrando informações 
        return "\nRelatório do Serviço\nCódigo: "+codigo+"\nDescrição: "+descricao+"\nTécnico: "+tecnico+"\nTempo de duração: "+tempo_duracao+calcCusto();  //chamando função do cálculo do custo
    }
}