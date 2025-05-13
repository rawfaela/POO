package herança11.transporte;
import javax.swing.JOptionPane;
//* ex5 */
public class Aquatico extends Transporte{
    private float altura;

    public Aquatico(String descricao, float tamanho, float peso, float altura) {
        super(descricao, tamanho, peso);
        this.altura=altura;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void dadosAquatico(){
        System.out.println("Altura: "+altura);
    }

    public static void main(String[] args) {
        String desc = JOptionPane.showInputDialog("Digite a descrição do transporte");
        float tam = Float.parseFloat(JOptionPane.showInputDialog("Digite o tamanho do transporte"));
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do transporte"));  
        float alt = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do transporte"));  
        Aquatico aquatico = new Aquatico(desc, tam, peso, alt);
        aquatico.dados();
        aquatico.dadosAquatico();
    }
    
}
