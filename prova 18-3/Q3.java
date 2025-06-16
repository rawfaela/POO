import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //inicializando o scanner

        System.out.print("Quantos clientes serão calculados? "); //pedindo info p/ saber quantas vezes repetir o while
        int q = entrada.nextInt(); 
        int i = 0; //declarando variáveis

        while (i<q){
            i++; //soma i+1

            System.out.print("Digite o nome do "+i+"º cliente: ");
            String nome = entrada.nextLine();
            nome = entrada.nextLine(); //pedindo duas vezes nao buga (n sei pq, mas funcionou)

            System.out.print("Digite o número da conta do "+i+"º cliente: "); //pedindo infos
            int conta = entrada.nextInt();  

            System.out.print("Digite o saldo do "+i+"º cliente: ");
            double saldo = entrada.nextDouble(); 

            if (saldo>6000){ //condições do saldo
                System.out.println("O cliente "+nome+" possui 15% do valor do saldo médio."); //mostrando info ao user
            }
            else if (saldo>4000){
                System.out.println("O cliente "+nome+" possui 10% do valor do saldo médio.");
            }
            else if (saldo>2000){
                System.out.println("O cliente "+nome+" possui 5% do valor do saldo médio.");
            }
            else{
                System.out.println("O cliente "+nome+" não possui saldo para crédito.");
            }
        }
    }  
}
