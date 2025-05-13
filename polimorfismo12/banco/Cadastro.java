package polimorfismo12.banco;

import javax.swing.JOptionPane;

public class Cadastro {
    public static void main(String[] args) {
        int p = 0;
        while (p != 4) {
            p = Integer.parseInt(JOptionPane.showInputDialog("Que tipo de conta você quer cadastrar?\n1- Normal\n2- Poupança\n3- Especial\n4- Sair"));

            if (p == 4) {
                System.out.println("Saindo!");
                break;
            }
            if (p!=1&&p!=2&&p!=3){
                System.out.println("Opção inválida!");
                System.exit(0);
            }

            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do cliente"));
            String nome = JOptionPane.showInputDialog("Digite o nome do cliente");
            String cliente = JOptionPane.showInputDialog("Digite o cliente");
            String sexo = JOptionPane.showInputDialog("Digite o sexo do cliente");
            int data = Integer.parseInt(JOptionPane.showInputDialog("Digite a data da movimentação do cliente"));
            float saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo do cliente"));
            String tipo = JOptionPane.showInputDialog("Digite o tipo de movimentação do cliente");
            float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da movimentação do cliente"));

            switch (p) {
                case 1:
                    Normal normal = new Normal(codigo,
                    nome, cliente, sexo, data, saldo, tipo, valor);
                    normal.dados("normal");
                    normal.dadosNormal();
                    break;
                case 2:
                    Poupanca poupanca = new Poupanca(codigo,
                    nome, cliente, sexo, data, saldo, tipo, valor);
                    poupanca.dados("poupanca");
                    poupanca.dadosPoupanca();
                    break;
                case 3:
                    Especial especial = new Especial(codigo,
                    nome, cliente, sexo, data, saldo, tipo, valor);
                    especial.dados("especial");
                    especial.dadosEspecial();
                    break;

                default:
                    break;
            }
        }
    }
}
