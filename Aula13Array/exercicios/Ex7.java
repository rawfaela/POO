package exercicios;

import java.util.*;
import javax.swing.JOptionPane;
//7. Remoção de Elementos: Crie um programa  que a partir de uma lista de nomes em um ArrayList, permita que o usuário digite os nomes da lista, após ele pode escolher um nome a ser removido. Mostre a lista antes e depois da remoção.

public class Ex7 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        String nome = ".";
        while (!nome.equalsIgnoreCase("sair")){
            nome = JOptionPane.showInputDialog("Escreva um nome, para sair digite 'sair'");

            if (nome.equalsIgnoreCase("sair")){
                System.out.println("Saindo\n");
            }
            else{
                nomes.add(nome);
            }
        }
        System.out.println("Nomes digitados com seu index: ");
        for (String x : nomes){
            System.out.println(nomes.indexOf(x)+": "+x);
        }
        int op = Integer.parseInt(JOptionPane.showInputDialog("Digite o index do item que você deseja remover"));
        if (op>nomes.size() && op<0){
            System.out.println("Index inválido!");
        }
        else{
            nomes.remove(op);
        }
        System.out.println("\nNova lista de nomes digitados com seu index: ");
        for (String x : nomes){
            System.out.println(nomes.indexOf(x)+": "+x);
        }
    }
}
