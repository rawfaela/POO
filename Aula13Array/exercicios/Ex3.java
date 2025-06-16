package exercicios;

import java.util.*;
import javax.swing.JOptionPane;
//3. Inverter um Array: Crie um programa  que contenha um array com 5 elementos e inverta a ordem dos elementos, exibindo o array original e o invertido.

public class Ex3 {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String elemento = JOptionPane.showInputDialog("Digite o "+(i+1)+"º elemento (string) do array");
            array.add(elemento);
        }

        System.out.println("Array original: ");
        for (String i : array){
            System.out.println(i);
        }

        Collections.reverse(array);
        System.out.println("Array invertido: ");
        for (String i : array){
            System.out.println(i);
        }
    }
}
