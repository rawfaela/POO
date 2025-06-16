import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		int[] A = new int[10];  //criação da matriz
		for (int i=0;i<10;i++){ //repetição 
			A[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+ "º número")); //pedindo info ao user e salvando no array
		}
		TotalPares(A); //chamando funções
		MaiorValor(A);
		TotalIguais(A);
		

	}
	public static int TotalPares(int[] array){ //criando função
		int cont=0; //iciando contador
		for (int i =0; i<10;i++){ 
			if (array[i]%2==0){ //se for par adiciona
				cont++;
			}
		}
		System.out.println("Quantidade de números pares digitados: "+cont); //mostrando info ao user
		return cont;
	}
	public static int MaiorValor(int[] array){ //criando função
		int maior=0; //criando variável
		for (int i =0;i<10;i++){
			if (array[i]>maior){ //se for maior salva na variável
				maior=array[i];
			}
		}
		System.out.println("Maior número digitado: "+maior); //mostrando info ao user
		return maior;
	}
	public static int TotalIguais(int[] array){ //criando função
		int total=0;  //criando contador
		for (int i =0;i<9;i++){
			if (array[i]==array[i+1]){ //se for igual soma
				total++;
			}
		}
		System.out.println("Total de números iguais: "+total);//mostrando info ao user
		return total;
	}

}