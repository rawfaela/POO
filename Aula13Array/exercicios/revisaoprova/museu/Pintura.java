package exercicios.revisaoprova.museu;

public class Pintura extends ObrasArte{
    protected String tipo_tecnica; //declarando variável

    public Pintura(int codigo, String titulo_obra, String nome_artista, int ano_criacao, String tipo_tecnica){
        super(codigo, titulo_obra, nome_artista, ano_criacao); //acessando variáveis
        this.tipo_tecnica = tipo_tecnica;
    }

    @Override
    public String toString(){
        return super.toString()+"\nTipo da técnica: "+tipo_tecnica;
    }
}

