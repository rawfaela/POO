package exercicios;

import javax.swing.JOptionPane;
//2. Maior e Menor Valor: Crie um programa que leia 10 valores inteiros em um array e imprima o maior e o menor número armazenado.

public class Ex2 {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int maior = 0;
        int menor = 999999999;
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º número"));
            nums[i] = num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>maior){
                maior = nums[i];
            }
            if (nums[i]<menor){
                menor = nums[i];
            }
        }
        System.out.println("Maior número digitado: "+maior+"\nMenor número digitado: "+menor);
    }
}
