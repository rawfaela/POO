package exercicios.revisaoprova.museu;

import java.util.*;
import javax.swing.JOptionPane;

public class Cadastrar {
    public static void main(String[] args) {
        ArrayList<ObrasArte> obras = new ArrayList<>();
        int op = 0; //criando variável de opção escolhida

        while (op!=5){ //laço de repetição
            op = Integer.parseInt(JOptionPane.showInputDialog("1-Cadastrar obra\n2-Remover obra\n3-Listar obras\n4-Gerenciar exposições\n5-Sair"));
            
            switch (op) {
                case 1:
                    int p = Integer.parseInt(JOptionPane.showInputDialog("Escolha a obra de arte para cadastrar! \n1-Pintura\n2-Escultura"));
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código")); //pedindo infos ao user
                    String titulo_obra = JOptionPane.showInputDialog("Digite o título da obra");
                    String nome_artista = JOptionPane.showInputDialog("Digite o nome do artista");
                    int ano_criacao = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de criação"));
    
                    switch (p) { //verificando condições
                        case 1: //se escolher a opção 1
                            String tipo_tecnica = JOptionPane.showInputDialog("Digite o tipo da técnica"); //pedino info
                            obras.add(new Pintura(codigo, titulo_obra, nome_artista, ano_criacao, tipo_tecnica));
                            break;
                        case 2: //se escolher a opção 1
                            String tipo_material = JOptionPane.showInputDialog("Digite o tipo do material"); //pedino info
                            obras.add(new Escultura(codigo, titulo_obra, nome_artista, ano_criacao, tipo_material));
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opção inválida!");
                    }
                    break;
                case 2:
                    int rem = Integer.parseInt(JOptionPane.showInputDialog("Código da obra para remover"));
                    boolean removido = false;
                    for (int i = 0; i<obras.size(); i++){
                        if (obras.get(i).getCod()==rem){
                            obras.remove(i);
                            removido =true;
                            JOptionPane.showMessageDialog(null, "Obra removida.");
                        }
                    }
                    if (!removido) {
                        JOptionPane.showMessageDialog(null, "Professor não encontrado.");
                    }
                    break;
                case 3:
                    if (obras.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhuma obra cadastrada.");
                    } else {
                        StringBuilder lista = new StringBuilder("Obras cadastrados:\n");
                        for (ObrasArte o : obras) {
                            lista.append(o.toString()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, lista.toString());
                    }
                    break;
                case 4:
                    gerenciarExposicoes();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saindo");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }   
    }

    private static void gerenciarExposicoes() { //criando método para gerenciar exposições
        int data_inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite a data de início")); //pedindo infos
        int data_fim = Integer.parseInt(JOptionPane.showInputDialog("Digite a data de fim"));
        String local = JOptionPane.showInputDialog("Digite o local");
        System.out.println("");
        System.out.println("Gerenciando exposições...");
        System.out.println("Sua exposição está marcada!\nData de início: "+data_inicio+"\nData de fim: "+data_fim+"\nLocal: "+local); //mostrando infos ao user
    }
}
