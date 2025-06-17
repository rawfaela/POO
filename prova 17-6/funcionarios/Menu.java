package funcionarios;

import java.util.*;
import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        ArrayList<Funcionarios> funcionarios = new ArrayList<>();  ///criando array
        int op = 0; //criando variável de opção escolhida

        while (op!=3){ //laço de repetição
            op = Integer.parseInt(JOptionPane.showInputDialog("1-Cadastrar funcionário\n2-Mostrar informações\n3-Sair")); //dando opção pro user
            
            switch (op) {  //verificando opção
                case 1:
                int p = Integer.parseInt(JOptionPane.showInputDialog("Escolha o funcionário para cadastrar! \n1-Supervisor\n2-Engenheiro\n3-Técnico")); //dando opção pro user 

                if (p>3||p<1){ //se nao for uma das opções mostra erro
                    JOptionPane.showMessageDialog(null,"Opção inválida!");
                    continue;
                }

                int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula do funcionário"));  //pedindo infos de cadastro
                String nome = JOptionPane.showInputDialog("Digite o nome do funcionário");
                String sexo = JOptionPane.showInputDialog("Digite o sexo do funcionário");
                double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário base do funcionário"));
                    switch (p){  //verificando opção de funcionário
                        case 1:
                            String setor = JOptionPane.showInputDialog("Digite o setor do funcionário"); //pedindo info específica
                            funcionarios.add(new Supervisor(matricula, nome, sexo, matricula, salario, setor));  //adicionando na lista e cadastrando 
                            break;
                        case 2:
                            String area = JOptionPane.showInputDialog("Digite a área de atuação do funcionário");
                            funcionarios.add(new Engenheiro(matricula, nome, sexo, matricula, salario, area));
                            break;
                        case 3:
                            String tipo = JOptionPane.showInputDialog("Digite o tipo do funcionário"); 
                            funcionarios.add(new Tecnico(matricula, nome, sexo, matricula, salario, tipo));
                            break;
                    }
                    break;

                    case 2:
                        if (funcionarios.isEmpty()){  //se lista estiver vazia mostra info
                            JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado!");
                        }
                        else{  //se nao, percorre lista e mostra cada info dos funcionários
                            for (Funcionarios x : funcionarios){
                                JOptionPane.showMessageDialog(null, x);
                            }
                        }
                        break;

                    case 3:
                        JOptionPane.showMessageDialog(null, "Saindo!");  //parando repetição
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida!");  //se nao for uma das opções mostra erro
            }
        }
    }
}