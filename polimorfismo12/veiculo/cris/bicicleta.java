class bicicleta extends veiculo {
    protected String cor;
    protected int ano;
    protected float tamanho;
    protected float peso;

    public bicicleta(String placa, String descricao, String marca, String modelo, String cor, int ano, float tamanho, float peso) {
        super(placa, descricao, marca, modelo);
        this.cor = cor;
        this.ano = ano;
        this.tamanho = tamanho;
        this.peso = peso;
    }

    // M�todos espec�ficos para Bicicleta
    public void checkList() {
        super.checkList();  // Chama o m�todo da classe base
        System.out.println("Verificando as condi��es das rodas, corrente e freios da bicicleta...");
    }

    public void adjust() {
        super.adjust();  // Chama o m�todo da classe base
        System.out.println("Ajustando os freios, calibrando os pneus e lubrificando a corrente da bicicleta...");
    }

    public void cleanup() {
        super.cleanup();  // Chama o m�todo da classe base
        System.out.println("Lavando a bicicleta, limpando as rodas e o quadro...");
    }
}
