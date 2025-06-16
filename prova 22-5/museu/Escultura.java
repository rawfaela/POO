package museu;

public class Escultura extends ObrasArte{
    protected String tipo_material; //declarando variável

    public Escultura(int codigo, String titulo_obra, String nome_artista, int ano_criacao, String tipo_material){
        super(codigo, titulo_obra, nome_artista, ano_criacao); //acessando variáveis
        this.tipo_material = tipo_material;
    }

    public void dadosEscultura(){
        System.out.println("Tipo do material: "+tipo_material); //mostrando informações
    }
}
