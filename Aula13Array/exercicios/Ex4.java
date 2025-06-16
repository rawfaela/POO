package exercicios;

import java.util.*;
import javax.swing.JOptionPane;
//4. Contar Números Pares: Crie um programa  que contenha um array com 20 números inteiros aleatórios entre 1 e 100 e conte quantos são pares.

public class Ex4 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        int pares=0;
        for (int i=0; i<20; i++){ 
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º número entre 1 e 100"));
            nums.add(num);
            System.out.println(nums.get(i));
        }
        for (int x : nums){
            if (x%2==0){
                pares++;
            }
        }
        System.out.println(pares+" números pares foram digitados.");
    }
}
