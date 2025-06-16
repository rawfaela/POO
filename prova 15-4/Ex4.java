import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		boolean print = true; //criando variável 
		String senha=JOptionPane.showInputDialog("Digite a senha (0 a 9, mín 4 e máx 10): ");  //pedindo info ao user
		if ((senha.length()>=4)&&(senha.length()<=10)){ //se for do tamanho correto
			for (int i=0; i< senha.length();i++){ //repetição
				char c = senha.charAt(i);  //pega cada letra
				if (c < '0' || c > '9') //se não tiver os caracteres corretos
				{
					print=false; //determinando variável do print (inválido)
				}
			}
		}
		else{
			print=false;
		}
		if (print==false){
			System.out.println("Senha '"+senha+"' inválida"); //mostrando info ao user
		}
		else{
			System.out.println("Senha '"+senha+"' válida");
		}
	}

}