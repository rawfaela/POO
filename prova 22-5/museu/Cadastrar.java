package museu;

import javax.swing.JOptionPane;

public class Cadastrar {
    public static void main(String[] args) {
        int p = 0; //criando variável de opção escolhida
        while (p!=4){ //laço de repetição
            p = Integer.parseInt(JOptionPane.showInputDialog("Escolha a obra de arte para cadastrar!\n1-Pintura\n2-Escultura\n3-Gerenciar exposições\n4-Sair")); //pedindo info ao user

            if (p==4){ //se escolher opção sair da break
                System.out.println("Saindo!");
                break;
            }
            if (p!=1&&p!=2&&p!=3){ //se nao escolher uma das opções da erro
                System.out.println("Opção inválida!");
                return;
            }
            if (p==3){ //se escolher a opção 3
                gerenciarExposicoes(); //chama método de gerenciar exposições
                break;
            }

            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código")); //pedindo infos ao user
            String titulo_obra = JOptionPane.showInputDialog("Digite o título da obra");
            String nome_artista = JOptionPane.showInputDialog("Digite o nome do artista");
            int ano_criacao = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de criação"));

            switch (p) { //verificando condições
                case 1: //se escolher a opção 1
                    String tipo_tecnica = JOptionPane.showInputDialog("Digite o tipo da técnica"); //pedino info
                    Pintura pintura = new Pintura(codigo, titulo_obra, nome_artista, ano_criacao, tipo_tecnica); //criando obra pintura
                    pintura.dados("pintura!"); //chamando método de mostrar dados
                    pintura.dadosPintura(); //chamando método de mostrar dados adicionais da pintura
                    break;
                case 2: //se escolher a opção 1
                    String tipo_material = JOptionPane.showInputDialog("Digite o tipo do material"); //pedino info
                    Escultura escultura = new Escultura(codigo, titulo_obra, nome_artista, ano_criacao, tipo_material); //criando obra escultura
                    escultura.dados("escultura!"); //chamando método de mostrar dados
                    escultura.dadosEscultura(); //chamando método de mostrar dados adicionais da escultura
                    break;
                default:
                    break;
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
