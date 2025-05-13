package herança11.animal;
import javax.swing.JOptionPane;
//* ex4 */
public class TestarAnimais {
    public static void main(String[] args) {
        int p = Integer.parseInt(JOptionPane.showInputDialog("Qual tipo de animal você quer cadastrar?  \n1-Mamífero\n2-Peixe"));
        if (p!=1 && p!=2){
            System.out.println("Opção inválida!");
            System.exit(0);
        }

        String nome = JOptionPane.showInputDialog("Digite o nome do animal: ");
        Float comp = Float.parseFloat(JOptionPane.showInputDialog("Digite o comprimento do animal: "));
        int numpata = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de patas do animal: "));
        String cor = JOptionPane.showInputDialog("Digite a cor do animal: ");
        String ambiente = JOptionPane.showInputDialog("Digite o ambiente do animal: ");
        Float velmedia = Float.parseFloat(JOptionPane.showInputDialog("Digite a velocidade média do animal: "));

        switch (p) {
            case 1:
                String alimento = JOptionPane.showInputDialog("Digite o alimento do animal: ");

                Mamifero mamifero = new Mamifero(nome, comp, numpata, cor, ambiente, velmedia, alimento);
                mamifero.dados();
                mamifero.dadosMamifero();
                break;

            case 2:
                String caracteristica = JOptionPane.showInputDialog("Digite a característica do animal: ");

                Peixe peixe = new Peixe(nome, comp, numpata, cor, ambiente, velmedia, caracteristica);
                peixe.dados();
                peixe.dadosPeixe();
                break;
        }
    }
}
