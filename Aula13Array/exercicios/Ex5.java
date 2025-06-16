package exercicios;

import java.util.*;
import javax.swing.JOptionPane;
//5. Média dos Valores: Crie um programa  que Armazene 5 notas em um array, calcule a média e informe quais notas estão acima da média.

public class Ex5 {
    public static void main(String[] args) {
        List<Float> notas = new ArrayList<>();
        float soma=0;
        for (int i = 0; i < 5; i++) {
            float nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a "+(i+1)+"ª nota"));
            notas.add(nota);
            soma+=nota;
        }
        float media = soma/notas.size();
        System.out.println("As notas acima da média ("+media+") são:");
        for (float x : notas){
            if (x>=media){
                System.out.println(x);
            }
        }
    }
}
