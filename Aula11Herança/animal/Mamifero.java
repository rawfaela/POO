package herança11.animal;
//* ex3 */
public class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMedia, String alimento) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void dadosMamifero(){
        System.out.println("Alimento: "+alimento);
    }

    public static void main(String[] args) {
        Mamifero animal =  new Mamifero("Morcego", 50, 2, "Preto", "Caverna", 100, "Homem");
        animal.dados();
        animal.dadosMamifero();
    }
}
