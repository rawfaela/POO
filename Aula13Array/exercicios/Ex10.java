package exercicios;

import java.util.*;
import javax.swing.JOptionPane;
//10. Lista de Tarefas - Crie um programa que implemente um gerenciador simples de lista de compras do supermercado (MENU) com ArrayList (String) que permita:
//•	Adicionar uma nova tarefa
//•	Remover tarefa existente
//•	Listar todas as tarefas

public class Ex10 {
    public static void main(String[] args) {
        int menu = 1;
        List<String> lista = new ArrayList<>();

        while (menu!=4) { 
            menu = Integer.parseInt(JOptionPane.showInputDialog("Lista de Supermercado!\n1- Adicionar tarefa\n2- Remover tarefa (antes liste para ver index)\n3- Listar tarefas\n4- Sair"));

            if (menu==4){
                System.out.println("Saindo");
                break;
            }

            switch (menu) {
                case 1:
                    String tarefa = JOptionPane.showInputDialog("Digite a tarefa que deseja adicionar");
                    lista.add(tarefa);
                    break;
                case 2:
                    int rem = Integer.parseInt(JOptionPane.showInputDialog("Digite o index da tarefa que deseja remover"));
                    if (rem>lista.size() && rem<0){
                        System.out.println("Index inválido");
                    }
                    else{
                        lista.remove(rem);
                    }
                    break;
                case 3:
                    if (lista.isEmpty()){
                        System.out.println("A lista está vazia");
                    }
                    else{
                        for (String x : lista){
                            System.out.println(lista.indexOf(x)+": "+x);
                        }
                    }    
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
