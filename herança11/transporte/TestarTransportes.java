package herança11.transporte;
import javax.swing.JOptionPane;
//* ex5 */
public class TestarTransportes {
    public static void main(String[] args) {
        int p = Integer.parseInt(JOptionPane.showInputDialog("Qual tipo de transporte você quer cadastrar?  \n1-Aquático\n2-Terrestre\n3-Aéreo"));
        if (p!=1&&p!=2&&p!=3){
            System.out.println("Opção inválida!");
            System.exit(0);
        }

        String desc = JOptionPane.showInputDialog("Digite a descrição do transporte");
        float tam = Float.parseFloat(JOptionPane.showInputDialog("Digite o tamanho do transporte"));
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do transporte"));
        
        switch (p) {
            case 1:
                float alt = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do transporte"));  
                Aquatico aquatico = new Aquatico(desc, tam, peso, alt);
                aquatico.dados();
                aquatico.dadosAquatico();
                break;
            case 2:
                int rodas = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº de rodas do transporte")); 
                Terrestre terrestre = new Terrestre(desc, tam, peso, rodas);
                terrestre.dados();
                terrestre.dadosTerrestre();
                break;
            case 3:
                int pass = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº de passageiros do transporte")); 
                Aereo aereo = new Aereo(desc, tam, peso, pass);
                aereo.dados();
                aereo.dadosAereo();
                break;
        }
    }
}
