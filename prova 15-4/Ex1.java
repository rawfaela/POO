import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		double[] A = new double[3*2]; //criação da matriz
		double soma=0; //criação da variável
		for (int i=0;i<6;i++){  //repetição 
			A[i]=Double.parseDouble(JOptionPane.showInputDialog("Número "+(i+1))); //pedindo info ao user e salvando no array
		}
		System.out.print("Matriz: ");  //mostrando elementos da matriz
		for (int i=0;i<6;i++){ 
			System.out.print(A[i]+", ");
			soma +=A[i]; //soma dos elementos p/ fazer a média
		}
		System.out.println("");
		System.out.println("Média dos elementos da matriz: "+(soma/6)); //mostrando média dos elementos da matriz
	}
}