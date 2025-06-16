package museu;

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

    public void dados(String obra){//"String obra" para mandar e aparecer na tela qual o tipo de obra
        System.out.println(""); //mostrando informações
        System.out.println("Relatório da obra de arte "+obra);
        System.out.println("Código: "+codigo);
        System.out.println("Título da obra: "+titulo_obra);
        System.out.println("Nome do artista: "+nome_artista);
        System.out.println("Ano da criação: "+ano_criacao);
    }
}
