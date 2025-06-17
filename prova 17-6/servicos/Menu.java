package servicos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        ArrayList<Servicos> servicos = new ArrayList<>();  ///criando array
        int op = 0; //criando variável de opção escolhida

        while (op!=3){  //laço de repetição
            op = Integer.parseInt(JOptionPane.showInputDialog("1-Cadastrar serviço\n2-Mostrar informações\n3-Sair"));  //dando opção pro user

            switch (op) {   //verificando opção
                case 1:
                    int p = Integer.parseInt(JOptionPane.showInputDialog("Escolha o serviço para cadastrar! \n1-Limpeza\n2-Formatação\n3-Atualização")); //dando opção pro user

                    if (p>3||p<1){ //se nao for uma das opções mostra erro
                        JOptionPane.showMessageDialog(null,"Opção inválida!");
                        continue;
                    }

                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do serviço")); //pedindo infos de cadastro
                    String descricao = JOptionPane.showInputDialog("Digite a descrição do serviço");
                    String tecnico = JOptionPane.showInputDialog("Digite o técnico do serviço"); 
                    double tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de duração do serviço"));
                    double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora do serviço"));

                    switch (p) { //verificando opção de serviço
                        case 1:
                            String tipo = JOptionPane.showInputDialog("Digite o tipo do serviço"); //pedindo info específica
                            servicos.add(new Limpeza(codigo, descricao, tecnico, tempo, tipo, valor)); //adicionando na lista e cadastrando
                            break;
                        case 2:
                            String formato = JOptionPane.showInputDialog("Digite o formato do serviço");
                            servicos.add(new Formatacao(codigo, descricao, tecnico, tempo, formato, valor));
                            break;
                        case 3:
                            String versao = JOptionPane.showInputDialog("Digite a versão do serviço");
                            servicos.add(new Atualizacao(codigo, descricao, tecnico, tempo, versao, valor));
                            break;
                    }
                    break;

                case 2:
                    if (servicos.isEmpty()){  //se lista estiver vazia mostra info
                        JOptionPane.showMessageDialog(null, "Nenhum serviço cadastrado!");
                    }
                    else{  //se nao, percorre lista e mostra cada info dos serviços
                        for (Servicos x : servicos){
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