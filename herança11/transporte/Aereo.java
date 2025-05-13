package herança11.transporte;
import javax.swing.JOptionPane;
//* ex5 */
public class Aereo extends Transporte{
    private int passageiros;

    public Aereo(String descricao, float tamanho, float peso, int passageiros) {
        super(descricao, tamanho, peso);
        this.passageiros = passageiros;
    }
    public int getPassageiros() {
        return passageiros;
    }
    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public void dadosAereo(){
        System.out.println("N° de passageiros: "+passageiros);
    }
    public static void main(String[] args) {
        String desc = JOptionPane.showInputDialog("Digite a descrição do transporte");
        float tam = Float.parseFloat(JOptionPane.showInputDialog("Digite o tamanho do transporte"));
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do transporte"));  
        int pass = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº de passageiros do transporte")); 
        Aereo aereo = new Aereo(desc, tam, peso, pass);
        aereo.dados();
        aereo.dadosAereo();
    }
    
}
