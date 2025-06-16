package exercicios.revisaoprova.museu;

public class ObrasArte {
    protected int codigo; //declarando variáveis
    protected String titulo_obra;
    protected String nome_artista;
    protected int ano_criacao;

    public ObrasArte(int codigo, String titulo_obra, String nome_artista, int ano_criacao){
        this.codigo = codigo; //acessando variáveis
        this.titulo_obra = titulo_obra;
        this.nome_artista = nome_artista;
        this.ano_criacao = ano_criacao;
    }

    public int getCod(){
        return codigo;
    }

    @Override
    public String toString(){
        return "\nRelatório da obra de arte:\nCódigo: "+codigo+"\nTítulo da obra: "+titulo_obra+"\nNome do artista: "+nome_artista+"\nAno da criação: "+ano_criacao;
    }
}
