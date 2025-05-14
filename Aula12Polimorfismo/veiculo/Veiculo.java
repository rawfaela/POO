package polimorfismo12.veiculo;

public class Veiculo {
    private int cod;
    private String descricao;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private float tamanho;
    private float peso;

    public Veiculo(int cod, String descricao, String marca, String modelo, String cor, int ano, float tamanho, float peso){
        this.cod = cod;
        this.descricao = descricao;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.tamanho = tamanho;
        this.peso = peso;
    }

    public void checkList() {
        System.out.println("Verificando as condições gerais do veículo...");
    }
    public void adjust() {
        System.out.println("Realizando ajustes e manutenção no veículo...");
    }
    public void cleanup() {
        System.out.println("Realizando a limpeza do veículo...");
    }

    public void dados(String veic){
        System.out.println("! Relatório do veículo "+veic+"!");
        System.out.println("Código: "+cod);
        System.out.println("Descrição: "+descricao);
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Cor: "+cor);
        System.out.println("Ano: "+ano);
        System.out.println("Tamanho: "+tamanho);
        System.out.println("Peso: "+peso);
    }


    public void realizarServicos() {
        checkList();
        adjust();
        cleanup();
    }
}

class Oficina {
    public void realizarServico(Veiculo veiculo) {
        veiculo.realizarServicos();
    }
}
