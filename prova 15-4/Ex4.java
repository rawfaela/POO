import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		boolean print = true; //criando vari�vel 
		String senha=JOptionPane.showInputDialog("Digite a senha (0 a 9, m�n 4 e m�x 10): ");  //pedindo info ao user
		if ((senha.length()>=4)&&(senha.length()<=10)){ //se for do tamanho correto
			for (int i=0; i< senha.length();i++){ //repeti��o
				char c = senha.charAt(i);  //pega cada letra
				if (c < '0' || c > '9') //se n�o tiver os caracteres corretos
				{
					print=false; //determinando vari�vel do print (inv�lido)
				}
			}
		}
		else{
			print=false;
		}
		if (print==false){
			System.out.println("Senha '"+senha+"' inv�lida"); //mostrando info ao user
		}
		else{
			System.out.println("Senha '"+senha+"' v�lida");
		}
	}

}