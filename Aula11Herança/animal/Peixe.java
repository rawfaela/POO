package herança11.animal;
//* ex2 */
public class Peixe extends Animal{
    private String caracteristica;

    public Peixe(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMedia, String caracteristica) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }
    
    public String getCaracteristica() {
        return caracteristica;
    }
    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public void dadosPeixe(){
        System.out.println("Característica: " + caracteristica);
    }

    public static void main(String[] args) {
        Peixe animal = new Peixe("Peixe Tropical", 30, 0, "Azul", "Água", 5, "Escamas brilhantes");
        animal.dados();
        animal.dadosPeixe();
    }
}
