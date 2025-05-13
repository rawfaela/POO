import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) {
        @SuppressWarnings("resource") //pra n da "erro" na entrada (nao necessario, so me incomoda)
        Scanner entrada= new Scanner(System.in);

        //* ex1
        System.out.print("Primeiro número: ");
        float n1 = entrada.nextFloat();
        System.out.print("Segundo número: ");
        float n2 = entrada.nextFloat();
        if (n1>n2){
            System.out.print("O maior número é "+n1);
        }
        else{
            System.out.print("O maior número é "+n2);
        }

        //* ex2
        System.out.print("\nPreço do 1 produto: ");
        float p1 = entrada.nextFloat();
        System.out.print("Preço do 2 produto: ");
        float p2 = entrada.nextFloat();
        System.out.print("Preço do 3 produto: ");
        float p3 = entrada.nextFloat();
        if (p1<p2 && p1<p3){
            System.out.println("O produto que você deve comprar é o 1, que custa R$"+p1);
        }
        else if (p2<p1 && p2<p3){
            System.out.println("O produto que você deve comprar é o 2, que custa R$"+p2);
        }
        else{
            System.out.println("O produto que você deve comprar é o 3, que custa R$"+p3);
        }

        //* ex3
        System.out.print("\nPrimeira nota: ");
        float nota1 = entrada.nextFloat();
        System.out.print("Segunda nota: ");
        float nota2 = entrada.nextFloat();
        float media = (nota1+nota2)/2;
        if (media==10){
            System.out.println("Aprovado com distinção, média 10.0");
        }
        else if (media>=7){
            System.out.println("Aprovado com média "+media);
        }
        else{
            System.out.println("Reprovado com média "+media);
        }

        //* ex4
        System.out.print("\nDigite um número de 1 a 7: ");
        int n = entrada.nextInt();
        switch (n) {
            case 1:
                System.out.println("Domingo.");
                break;
            case 2:
                System.out.println("Segunda.");
                break;
            case 3:
                System.out.println("Terça.");
                break;
            case 4:
                System.out.println("Quarta.");
                break;
            case 5:
                System.out.println("Quinta.");
                break;
            case 6:
                System.out.println("Sexta.");
                break;
            case 7:
                System.out.println("Sábado.");
                break;
            default:
            System.out.println("Valor inválido.");
                break;
        }

        //* ex5
        double novo = 0 , porc = 0, aument = 0; //? tem q ser global senao n da p printar de uma vez so
        System.out.print("\nDigite seu salário: ");
        float sal = entrada.nextFloat();
        if (sal>1500){
            aument = sal*0.05;
            novo = sal+aument;
            porc = 5;
        }
        else if (sal>700){
            aument = sal*0.1;             
            novo = sal+aument;
            porc = 10;     
        }
        else if (sal>280){
            aument = sal*0.15;             
            novo = sal+aument;
            porc = 15;
        }
        else{
            aument = sal*0.20;             
            novo = sal+aument;
            porc = 20;
        }

        System.out.println("O salário antes do reajuste era R$"+sal+", foi aumentado "+porc+"% que corresponde a R$"+aument+". O novo salário é R$"+novo+".");

        //* ex6
        System.out.print("\nDigite suas horas trabalhadas no mês: ");
        double horas = entrada.nextDouble();
        System.out.print("Digite so valor da sua hora: ");
        double valor = entrada.nextDouble();  
        double bruto = horas*valor;
        double IR=0, liq=0;

        if (bruto>2500){
            IR = 20;
            liq = bruto - (bruto*0.2) - (bruto*0.1);
        }
        else if (bruto>1500){
            IR = 10;
            liq = bruto - (bruto*0.1) - (bruto*0.1);
        }
        else if (bruto>900){
            IR = 5;
            liq = bruto - (bruto*0.05) - (bruto*0.1);
        }
        else{
            liq = bruto - (bruto*0.1);
        }

        System.out.println("O salário bruto é R$"+bruto+", foi descontado 10% do INSS e "+IR+"% do Imposto de Renda. O salário líquido é R$"+liq+".");

        //* ex7
       System.out.print("\nTipo de combustível (A-Álcool; G-Gasolina): ");
        String comb = entrada.nextLine();
        System.out.print("Nº de litros vendidos: ");
        double litro = entrada.nextDouble();
        double pagar = 0;

        switch (comb) {
            case "A":
                if (litro>20){
                    pagar = litro*1.9*1.05;
                }
                else{
                    pagar = litro*1.9*1.03;
                }
                break;
            case "G":
                if (litro>20){
                    pagar = litro*2.5*1.06;
                }
                else{
                    pagar = litro*2.5*1.04;
                }
                break;            
            default:
                System.out.println("Combustível não aceito.");
                break;
        }
        System.out.println("O valor a ser pago é de R$"+pagar+".");
    }
}
