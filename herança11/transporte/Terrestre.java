package herança11.transporte;
import javax.swing.JOptionPane;
//* ex5 */
public class Terrestre extends Transporte{
    private int rodas;

    public Terrestre(String descricao, float tamanho, float peso, int rodas) {
        super(descricao, tamanho, peso);
        this.rodas = rodas;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public void dadosTerrestre(){
        System.out.println("Nº de rodas: "+rodas);
    }
    public static void main(String[] args) {
        String desc = JOptionPane.showInputDialog("Digite a descrição do transporte");
        float tam = Float.parseFloat(JOptionPane.showInputDialog("Digite o tamanho do transporte"));
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do transporte"));  
        int rodas = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº de rodas do transporte")); 
        Terrestre terrestre = new Terrestre(desc, tam, peso, rodas);
        terrestre.dados();
        terrestre.dadosTerrestre();
    }
    
}
