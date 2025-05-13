import javax.swing.JOptionPane;

public class Aula4Array {
    public static void main(String[] args) {
        /* Temp(); */
        /* Nums(); */
        /* Nums2(); */
        /* Nums3(); */
        /* Ints(); */
        /* Soma(); */
        /* Nomes(); */
        Copia();
        System.exit(0);
    }

    //* ex1 */
    public static void Temp(){
        double[] temps = new double[2]; //array pra armazenar 2 temps
        for (int i=0; i<2; i++){
            double temp = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura"));
            temps[i]=temp; //temps no index(posicao) i recebe temp
        }
        for (int i=0; i<2; i++){
            System.out.println("Temperatura "+i+": "+temps[i]); //! nao pode printar só o array, tem q printar cada item dele
        }
    }

    //* ex2 */
    public static void Nums(){
        int[] nums = new int[10];
        int maior=0, menor=999999999;

        for (int i=0;i<10;i++){
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
            nums[i]=num;
            if (nums[i]>maior){
                maior=nums[i];
            }
            if (nums[i]<menor){
                menor=nums[i];
            }
        }
        
        for (int i=0;i<10;i++){
            System.out.println("Número "+i+": "+nums[i]);
        }
        System.out.println("Maior número: "+maior+"\nMenor número: "+menor);
    }

    //* ex 3 */
    public static void Nums2(){
        int[] nums = new int[10];
        int neg=0, pos=0;
        for (int i=0;i<10;i++){
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
            nums[i]=num;
            if (nums[i]>=0){
                pos++;
            }
            else{
                neg++;
            }
        }
    System.out.println("Quantidade de números positivos digitados: "+pos+"\nQtd números negativos: "+neg);
    }

    //* ex4 */
    public static void Nums3(){
        int[] nums = new int[10];
        int par=0, impar=0;
        for (int i=0;i<10;i++){
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
            nums[i]=num;
            if (nums[i]%2==0){
                par++;
            }
            else{
                impar++;
            }
        }
    System.out.println("Quantidade de números pares digitados: "+par+"\nQtd números impares: "+impar);
    }

    //* ex5  */
    public static void Ints(){
        int[] nums = new int[5];
        int maior=0;
        for (int i=0;i<5;i++){
            nums[i]= Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
            if (nums[i]>maior){
                maior=nums[i];
            }
        }
        System.out.println("Maior número digitado: "+maior);
    }

    //* ex6 */
    public static void Soma(){
        int[] A = new int[2];
        int[] B = new int[2];
        int[] C = new int[2];
        for (int i=0;i<2;i++){
            A[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o número do array A"));
            B[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o número do array B"));
        }
        for (int x=0;x<2;x++){
            C[x]=A[x]+B[x];
        }
        System.out.println("Soma dos números por índice: ");
        for (int y=0;y<2;y++){
            System.out.println(C[y]);
        }
    }

    //* ex8 (pulou o 7) */
    public static void Nomes(){
        String[] pessoas = new String[4];
        for (int i =0;i<4;i++){
            pessoas[i] = JOptionPane.showInputDialog("Digite o nome");
        }
        String pesq = JOptionPane.showInputDialog("Digite um nome para pesquisar");
        boolean msg = true;
        for (int i=0;i<4;i++){
            if (pessoas[i].equalsIgnoreCase(pesq)){
                System.out.println("Nome " +pessoas[i]+" encontrado na posição "+i);
                msg = false;
                break;
            }
        }
        if (msg==true){
            System.out.println("Nome " +pesq+" não encontrado");
        }
    }

    //* ex9 */
    public static void Copia(){
        int[] nums = {0,1,2,3,4,5,6,7,8,9};
        int[] copia = new int[3];
                    //array fonte, indice inicial da fonte, array destino, indice inicial destino, nº elementos
        System.arraycopy(nums, 2, copia, 0, 3);
        for (int i =0;i<3;i++){
            System.out.println(copia[i]);
        }
    }
}
