
import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		double[] A = new double[3*3]; //criação da matriz
		
		for (int i=0;i<9;i++){ //repetição 
			A[i]=Double.parseDouble(JOptionPane.showInputDialog("Número "+(i+1))); //pedindo info ao user e salvando no array
		}
		System.out.print("Matriz: "); //mostrando elementos da matriz
		for (int i=0;i<9;i++){
			System.out.print(A[i]+", ");
		}
		System.out.println("");
		
		System.out.print("Elementos repetidos na matriz: ");  //mostrando elementos repetidos da matriz
		for (int i=0;i<8;i++){
			if (A[i]==A[i+1]){
				System.out.print(A[i]+", ");
			}
		}
	}
}