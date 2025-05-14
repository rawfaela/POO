package polimorfismo12.empresa;
import javax.swing.JOptionPane;

public class Cadastro {
    public static void main(String[] args) {
        int p = 0;
        while (p != 5) {
            p = Integer.parseInt(JOptionPane.showInputDialog("Que tipo de funcionário você quer cadastrar?\n1- Engenheiro\n2- Diretor\n3- Secretário\n4- Gerente\n5- Sair"));

            if (p == 5) {
                System.out.println("Saindo!");
                break;
            }
            if (p!=1&&p!=2&&p!=3&&p!=4){
                System.out.println("Opção inválida!");
                System.exit(0);
            }

            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do funcionário"));
            String nome = JOptionPane.showInputDialog("Digite o nome do funcionário");
            String sexo = JOptionPane.showInputDialog("Digite o sexo do funcionário");
            int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas do funcionário"));
            float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da hora do funcionário"));

            switch (p) {
                case 1:
                    int ncrea = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº CREA do funcionário"));
                    String especializacao = JOptionPane.showInputDialog("Digite a especialização do funcionário");
                    Engenheiro engenheiro = new Engenheiro(codigo,
                    nome, sexo, horas, valor, ncrea, especializacao);
                    engenheiro.dados("engenheiro");
                    engenheiro.dadosEngenheiro();
                    break;
                case 2:
                    String areagestao = JOptionPane.showInputDialog("Digite a área de gestão do funcionário");
                    Diretor diretor = new Diretor(codigo,
                    nome, sexo, horas, valor, areagestao);
                    diretor.dados("diretor");
                    diretor.dadosDiretor();
                    break;
                case 3:
                    String categoria = JOptionPane.showInputDialog("Digite a categoria do funcionário");
                    String setor = JOptionPane.showInputDialog("Digite o setor do funcionário");
                    Secretario secretario = new Secretario(codigo,
                    nome, sexo, horas, valor, categoria, setor);
                    secretario.dados("secretario");
                    secretario.dadosSecretario();
                    break;
                case 4:
                    String setorg = JOptionPane.showInputDialog("Digite o setor do funcionário");
                    Gerente gerente = new Gerente(codigo,
                    nome, sexo, horas, valor, setorg);
                    gerente.dados("gerente");
                    gerente.dadosGerente();
                    break;
                default:
                    break;
            }
        }
    }
}
