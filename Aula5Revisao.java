import javax.swing.JOptionPane;

public class Aula5Revisao {
    public static void main(String[] args) {
        /* Funcs(); */
        /* Meds(); */
        /* Neg(); */
        /* Mult(); */
        Uniao();
        System.exit(0);
    }

    //* ex1 */
    public static void Funcs(){
        String[] nomes = new String[3];
        String[] cargos = new String[3];
        double[] sal = new double[3];
        for (int i = 0; i<3; i++){
            nomes[i]=JOptionPane.showInputDialog("Digite o nome");
            cargos[i]=JOptionPane.showInputDialog("Digite o cargo de "+nomes[i]);
            sal[i]=Double.parseDouble(JOptionPane.showInputDialog("Digite o salário de "+nomes[i]));
        }
        for (int i=0;i<3;i++){
            System.out.println("Nome: "+nomes[i]+" | Cargo: "+cargos[i]+" | Salário: "+sal[i]);
        }
    }

    //* ex2 */
    public static void Meds(){
        String[] nomes = new String[3];
        String[] esp = new String[3];
        for (int i = 0; i<3; i++){
            nomes[i]=JOptionPane.showInputDialog("Digite o nome");
            esp[i]=JOptionPane.showInputDialog("Digite a especialidade de "+nomes[i]);
        }   
        for (int i=0;i<3;i++){
            System.out.println("Nome: "+nomes[i]+" | Especialidade: "+esp[i]);
        }
    }

    //* ex5 */
    public static void Neg(){
        int[] nums = new int[3];
        for (int i =0;i<3;i++){
            nums[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            if (nums[i]<0){
                System.out.println(nums[i]);
            }
        }
    }

    //* ex7 */
    public static void Mult(){
        int[] A = new int[2];
        int[] B = new int[2];
        int[] C = new int[2];
        for (int i=0;i<2;i++){
            A[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o número do array A"));
            B[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o número do array B"));
        }
        for (int x=0;x<2;x++){
            C[x]=A[x]*B[x];
        }
        System.out.println("Multiplicação dos números por índice: ");
        for (int y=0;y<2;y++){
            System.out.println(C[y]);
        }
    }

    //* ex8 */
    public static void Uniao(){
        int[] A = new int[2];
        int[] B = new int[2];
        int[] C = new int[4];
        for (int i=0;i<2;i++){
            A[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o número do array A"));
            B[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o número do array B"));
        }
        for (int x=0;x<2;x++){
            C[x]=A[x];
        }
        for (int x=0;x<2;x++){
            C[x+2]=B[x];
        }
        System.out.println("União dos arrays: ");
        for (int y=0;y<4;y++){
            System.out.println(C[y]);
        }
    }
}
