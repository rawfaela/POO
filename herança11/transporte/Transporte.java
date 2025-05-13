package herança11.transporte;
import javax.swing.JOptionPane;
//* ex5 */
public class Transporte {
    private String descricao;
    private float tamanho;
    private float peso;

    public Transporte(String descricao, float tamanho, float peso){
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.peso = peso;
    }

    public String getDescricao() {
        return descricao;
    }
    public float getTamanho() {
        return tamanho;
    }
    public float getPeso() {
        return peso;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void dados(){
        System.out.println("! Relatório do Transporte !");
        System.out.println("Descrição: "+descricao);
        System.out.println("Tamanho: "+tamanho);
        System.out.println("Peso: "+peso);
    }
    public static void main(String[] args) {
        String desc = JOptionPane.showInputDialog("Digite a descrição do transporte");
        float tam = Float.parseFloat(JOptionPane.showInputDialog("Digite o tamanho do transporte"));
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do transporte"));      
        Transporte transporte =  new Transporte(desc, tam, peso);
        transporte.dados();
    }
}
