package polimorfismo12.veiculo;

public class Automovel extends Veiculo {
    private String combustivel;

    public Automovel(int cod, String descricao, String marca, String modelo, String cor, int ano, float tamanho, float peso, String combustivel){
        super(cod, descricao, marca, modelo, cor, ano, tamanho, peso);
        this.combustivel = combustivel;
    }

    public void dadosAutomovel(){
        System.out.println("Tipo do combustível: "+combustivel);
    }

    public void checkList() {
        super.checkList();  // Chama o método da classe base
        System.out.println("Verificando condições do motor, pneus e sistema de freios do automóvel...");
    }
    public void adjust() {
        super.adjust();  // Chama o método da classe base
        System.out.println("Realizando ajustes no motor, alinhamento e troca de óleo do automóvel...");
    }
    public void cleanup() {
        super.cleanup();  // Chama o método da classe base
        System.out.println("Lavando o carro, limpando os vidros e aspirando o interior do automóvel...");
    }
}
