import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		double[] A = new double[3*2]; //cria��o da matriz
		double soma=0; //cria��o da vari�vel
		for (int i=0;i<6;i++){  //repeti��o 
			A[i]=Double.parseDouble(JOptionPane.showInputDialog("N�mero "+(i+1))); //pedindo info ao user e salvando no array
		}
		System.out.print("Matriz: ");  //mostrando elementos da matriz
		for (int i=0;i<6;i++){ 
			System.out.print(A[i]+", ");
			soma +=A[i]; //soma dos elementos p/ fazer a m�dia
		}
		System.out.println("");
		System.out.println("M�dia dos elementos da matriz: "+(soma/6)); //mostrando m�dia dos elementos da matriz
	}
}