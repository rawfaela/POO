package polimorfismo12.veiculo;

public class Bicicleta extends Veiculo {
    private int rodas;

    public Bicicleta(int cod, String descricao, String marca, String modelo, String cor, int ano, float tamanho, float peso, int rodas){
        super(cod, descricao, marca, modelo, cor, ano, tamanho, peso);
        this.rodas = rodas;
    }

    public void dadosBicicleta(){
        System.out.println("Nº de rodas: "+rodas);
    }

    public void checkList() {
        super.checkList();  // Chama o método da classe base
        System.out.println("Verificando as condições das rodas, corrente e freios da bicicleta...");
    }
    public void adjust() {
        super.adjust();  // Chama o método da classe base
        System.out.println("Ajustando os freios, calibrando os pneus e lubrificando a corrente da bicicleta...");
    }
    public void cleanup() {
        super.cleanup();  // Chama o método da classe base
        System.out.println("Lavando a bicicleta, limpando as rodas e o quadro...");
    }
}
