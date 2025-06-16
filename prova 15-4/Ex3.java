import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		int[] A = new int[10];  //cria��o da matriz
		for (int i=0;i<10;i++){ //repeti��o 
			A[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+ "� n�mero")); //pedindo info ao user e salvando no array
		}
		TotalPares(A); //chamando fun��es
		MaiorValor(A);
		TotalIguais(A);
		

	}
	public static int TotalPares(int[] array){ //criando fun��o
		int cont=0; //iciando contador
		for (int i =0; i<10;i++){ 
			if (array[i]%2==0){ //se for par adiciona
				cont++;
			}
		}
		System.out.println("Quantidade de n�meros pares digitados: "+cont); //mostrando info ao user
		return cont;
	}
	public static int MaiorValor(int[] array){ //criando fun��o
		int maior=0; //criando vari�vel
		for (int i =0;i<10;i++){
			if (array[i]>maior){ //se for maior salva na vari�vel
				maior=array[i];
			}
		}
		System.out.println("Maior n�mero digitado: "+maior); //mostrando info ao user
		return maior;
	}
	public static int TotalIguais(int[] array){ //criando fun��o
		int total=0;  //criando contador
		for (int i =0;i<9;i++){
			if (array[i]==array[i+1]){ //se for igual soma
				total++;
			}
		}
		System.out.println("Total de n�meros iguais: "+total);//mostrando info ao user
		return total;
	}

}