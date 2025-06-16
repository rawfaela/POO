import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //inicializando o scanner

        System.out.print("Quantos pacientes serão verificados? "); //pedindo info p/ saber quantas vezes repetir o while
        int q = entrada.nextInt(); 
        int i = 0; //declarando variável

        while (i<q){
            i++; //soma i+1

            System.out.print("Digite o nome do "+i+"º paciente: ");  //pedindo infos
            String nome = entrada.nextLine();
            nome = entrada.nextLine(); //pedindo duas vezes nao buga (n sei pq, mas funcionou)

            System.out.print("Digite a idade do "+i+"º paciente: ");
            int idade = entrada.nextInt();  

            System.out.print("Digite o peso do "+i+"º paciente: ");
            double peso = entrada.nextDouble(); 

            if (idade<=15){  //condições da idade e peso
                System.out.println("O paciente "+nome+" não pode ser doador por estar abaixo da idade permitida.");  //mostrando info ao user
            }
            else if ((idade==16||idade==17)&&peso>50){
                System.out.println("O paciente "+nome+" pode ser doador com autorização dos pais ou responsáveis.");
            }
            else if ((idade>=18||idade<=69)&&peso>50){
                System.out.println("O paciente "+nome+" pode ser doador.");
            }
            else{
                System.out.println("O paciente "+nome+" não pode ser doador por estar acima da idade permitida ou abaixo do peso necessário.");
            } 
        }  
    }
}
