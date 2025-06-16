package exercicios;

import java.util.*;
import javax.swing.JOptionPane;

//11.	Cadastro de Contatos - desenvolva um pequeno gerenciador de contatos com as seguintes funções:
//•	Adicionar contato (nome e telefone)
//•	Remover contato pelo nome
//•	Listar todos os contatos
//•	Buscar contato pelo nome
//Dica: Use uma classe Contato com nome e telefone, e um ArrayList<Contato>.


class Contato {
    private String nome;
    private int telefone;

    public Contato(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;       
    } 

    public String getNome() {
        return nome;       
    }

    public int getTelefone() {
        return telefone;      
    }

   @Override
        public String toString() {
            return "Nome: " + nome + ", Telefone: " + telefone;      
    }
}



public class Ex11 {
    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<>();
        int menu = 1;
        while (menu!=5){
            menu = Integer.parseInt(JOptionPane.showInputDialog("Contatos!\n1- Adicionar contato\n2- Remover contato pelo nome\n3- Listar contatos\n4- Buscar contato pelo nome\n5- Sair"));

            if (menu==5){
                System.out.println("Saindo");
                break;
            }

            switch (menu) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome do novo contato");
                    int telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do novo contato"));
                    contatos.add(new Contato(nome, telefone));
                    break;
                case 2:
                    String rem = JOptionPane.showInputDialog("Digite o nome (inteiro) do contato para remover");
                    boolean removido = false;
                    for (int i = 0; i < contatos.size(); i++) {
                        if (contatos.get(i).getNome().equalsIgnoreCase(rem)) {
                            contatos.remove(i);
                            removido = true;
                            System.out.println("Contato removido.");
                            break;
                        }
                    }
                    if (!removido) {
                        System.out.println("Contato não encontrado.");                       }
                    break;
                case 3:
                    if (contatos.isEmpty()){
                        System.out.println("Você não tem nenhum contato");
                    }
                    else{
                        System.out.println("Contatos cadastrados");
                        for (Contato x : contatos){
                            System.out.println(x);
                        }
                    }
                    break;
                case 4:
                    boolean encontrado = false;
                    String pesq = JOptionPane.showInputDialog("Digite o nome do contato para pesquisar");
                    for (Contato y : contatos) {
                        if (y.getNome().toLowerCase().contains(pesq.toLowerCase())) {
                            System.out.println("Contato encontrado: " + y);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado){
                        System.out.println("Nenhum contato encontrado");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
