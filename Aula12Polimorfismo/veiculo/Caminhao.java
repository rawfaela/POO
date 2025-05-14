package polimorfismo12.veiculo;

public class Caminhao extends Veiculo{
    private String classificacao;

    public Caminhao(int cod, String descricao, String marca, String modelo, String cor, int ano, float tamanho, float peso, String classificacao){
        super(cod, descricao, marca, modelo, cor, ano, tamanho, peso);
        this.classificacao = classificacao;
    }

    public void dadosCaminhao(){
        System.out.println("Classificação: "+classificacao);
    }

    public void checkList() {
        super.checkList();  // Chama o método da classe base
        System.out.println("Verificando condições do motor, pneus e sistema de freios do caminhão...");
    }
    public void adjust() {
        super.adjust();  // Chama o método da classe base
        System.out.println("Realizando ajustes no motor, alinhamento e troca de óleo do caminhão...");
    }
    public void cleanup() {
        super.cleanup();  // Chama o método da classe base
        System.out.println("Lavando o caminhão, limpando os vidros e aspirando o interior do caminhão...");
    }
}
