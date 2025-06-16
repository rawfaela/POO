package escola;

import javax.swing.JOptionPane;

public class Cadastrar {
    public static void main(String[] args) {
        int p = 0; //criando variável de opção escolhida
        while (p!=4){ //laço de repetição
            p = Integer.parseInt(JOptionPane.showInputDialog("Escolha o professor para cadastrar!\n1-Auxiliar\n2-Temporário\n3-Efetivo\n4-Sair")); //pedindo info ao user

            if (p==4){ //se escolher opção sair da break
                System.out.println("Saindo!");
                break;
            }
            if (p!=1&&p!=2&&p!=3){ //se nao escolher uma das opções da erro
                System.out.println("Opção inválida!");
                return;
            }

            String nome = JOptionPane.showInputDialog("Digite o nome");  //pedindo infos ao user
            int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula"));
            String cidade = JOptionPane.showInputDialog("Digite a ciadade");
            String estado = JOptionPane.showInputDialog("Digite o estado");
            int telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone"));
            double salario_base = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário base"));

            switch (p) { //verificando condições
                case 1: //se escolher a opção 1
                    String formacao = JOptionPane.showInputDialog("Digite a formação"); //pedino info
                    Auxiliar auxiliar = new Auxiliar(nome, matricula, cidade, estado, telefone, salario_base, formacao); //criando professor auxiliar
                    auxiliar.dados("auxiliar!"); //chamando método de mostrar dados
                    auxiliar.dadosAuxiliar(); //chamando método de mostrar dados adicionais do auxiliar
                    break;
                case 2:  //se escolher a opção 2
                    int data_inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite a data de início")); //pedino infos
                    int data_fim = Integer.parseInt(JOptionPane.showInputDialog("Digite a data de fim")); //criando professor temporário
                    Temporario temporario = new  Temporario(nome, matricula, cidade, estado, telefone, salario_base, data_inicio, data_fim);
                    temporario.dados("temporário!"); //chamando método de mostrar dados
                    temporario.dadosTemporario(); //chamando método de mostrar dados adicionais do temporário
                    break;
                case 3:  //se escolher a opção 3
                    String disciplina = JOptionPane.showInputDialog("Digite a disciplina"); //pedino infos
                    int nrhoras = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº de horas"));
                    Efetivo efetivo = new Efetivo(nome, matricula, cidade, estado, telefone, salario_base, disciplina, nrhoras); //criando professor efetivo
                    efetivo.dados("efetivo!"); //chamando método de mostrar dados
                    efetivo.dadosEfetivo(); //chamando método de mostrar dados adicionais do efetivo
                    break;
                default:
                    break;
            }     
        }
        
    }
}
