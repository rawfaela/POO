import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //inicializando o scanner

        int i=0; //declarando variáveis
        int abaixo = 0;
        int normal = 0;
        int acima = 0;
        int obeso = 0;

        System.out.println("Quantas pessoas serão entrevistadas? "); //pedindo info p/ saber quantas vezes repetir o while
        int q = entrada.nextInt();

        while (i<q){
            i++; //soma i+1

            System.out.print("Digite o "+i+"º peso: "); //pedindo infos
            double peso = entrada.nextDouble();
    
            System.out.print("Digite a "+i+"ª altura: ");
            double altura = entrada.nextDouble();      

            System.out.print("Digite o "+i+"º nome: ");
            String nome = entrada.nextLine();
    
            System.out.print("");
            String x = entrada.nextLine(); //essas duas linhas são para nao bugar quando for pedir o nome (quando repete pede um número e não espera o user digitar)

            double imc = peso/(altura*altura);  //calculando imc

            if (imc>30){  //condições do imc
                obeso++;
            }
            else if (imc>=26){
                acima++;
            }
            else if (imc>=18){
                normal++;
            }
            else{
                abaixo++;
            }
        }
        
        System.out.println("O total de pessoas entrevistadas em cada categoria é:\nAbaixo do peso: "+abaixo+"\nPeso normal: "+normal+"\nAcima do peso: "+acima+"\nObeso: "+obeso);  //mostrando info ao user
    }
}
