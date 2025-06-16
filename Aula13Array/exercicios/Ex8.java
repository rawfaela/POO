package exercicios;

import java.util.*;
import javax.swing.JOptionPane;
//8. Busca em uma Lista - Crie um programa que contenha um ArrayList (Int) com 10 números. Permita que criar uma lista, após o usuário pode pesquisar um número e informe se ele está presente na lista ou não.

public class Ex8 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º número"));
            nums.add(num);
        }
        while (true){
            int pesq = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para pesquisar na lista"));
            if (nums.contains(pesq)){
                System.out.println(pesq+" está presente na lista!");
            }
            else{
                System.out.println(pesq+" não está presente na lista!");
            }
            String p = JOptionPane.showInputDialog("Deseja sair? (sim/não)");
            if (p.equalsIgnoreCase("sim")){
                System.out.println("Saindo");
                break;
            }
        }
    }
}
