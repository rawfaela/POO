package exercicios;

import javax.swing.JOptionPane;
//1. Soma dos Elementos de um Array: Crie um programa que leia 10 números inteiros e armazene em um array. Depois, calcule e exiba a soma de todos os números.

public class Ex1 {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int total = 0;
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º número"));
            nums[i] = num;
        }
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        System.out.println("Total dos números digitados: "+total);
    }
}
