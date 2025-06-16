package museu;

public class Pintura extends ObrasArte{
    protected String tipo_tecnica; //declarando variável

    public Pintura(int codigo, String titulo_obra, String nome_artista, int ano_criacao, String tipo_tecnica){
        super(codigo, titulo_obra, nome_artista, ano_criacao); //acessando variáveis
        this.tipo_tecnica = tipo_tecnica;
    }

    public void dadosPintura(){
        System.out.println("Tipo da técnica: "+tipo_tecnica); //mostrando informações
    }
}
