package exercicios;

import java.util.*;
import javax.swing.JOptionPane;
//6. Cadastro de Nomes - Crie um programa  que Crie um ArrayList(String) para armazenar nomes. Permita que o usuário adicione nomes até digitar “sair”. Em seguida, exiba todos os nomes cadastrados.

public class Ex6 {
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
        System.out.println("Nomes digitados:");
        for (String x : nomes){
            System.out.println(x);
        }
    }
}
