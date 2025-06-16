import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //inicializando o scanner

        int p = 0; //declarando variáveis
        double x=0;

        while (p!=4){ 
            System.out.print("Calculadora de temperatura\n1- Fahrenheit\n2- Kelvin\n3- Réamur\n4- Sair\nEscolha uma opção: "); //pedindo infos
            p = entrada.nextInt();

            System.out.print("Digite o número para ser convertido: ");
            double n = entrada.nextDouble();

            if (p==1){  //calculando temeperatura de acordo com escolha do user
                x = n*1.8+32;
                System.out.println("A conversão resultou em: "+x); //mostrando info ao user
            }
            else if (p==2){
                x = n+273.15;
                System.out.println("A conversão resultou em: "+x);
            }
            else if (p==3){
                x = n*0.8;
                System.out.println("A conversão resultou em: "+x);
            }
            else if (p==4){ //quando escolhe "sair" da break
                break;
            }
            else{ //se escolher opção diferente mostra que é inválido
                System.out.println("Opção de cálculo inválida");
            }
        }
    }
}
