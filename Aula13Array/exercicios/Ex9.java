package exercicios;

import java.util.*;
import javax.swing.JOptionPane;
//9. Ordenação- Crie um programa que peça ao usuário para inserir 5 números em um ArrayList. Depois, ordene os números em ordem crescente e exiba o resultado.

public class Ex9 {
    public static void main(String[] args) {
        List<Float> nums = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            float num = Float.parseFloat(JOptionPane.showInputDialog("Digite o "+(i+1)+"º número"));
            nums.add(num);
        }
        Collections.sort(nums);
        System.out.println("Números digitados em ordem crescente:");
        for (float x : nums){
            System.out.println(x);
        }
    }
}
