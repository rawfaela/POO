import java.util.Scanner;

public class GEx7 {
    public static void main(String[] args) {
        @SuppressWarnings("resource") //pra n da "erro" na entrada (nao necessario, so me incomoda)
        Scanner entrada = new Scanner(System.in);

        //* ex1 
        System.out.print("Digite o nome do aluno: ");
        String nome = entrada.nextLine();
        System.out.print("Digite o curso do aluno (ADM, DIR, CEX): ");
        String curso = entrada.nextLine();

        if (curso.equalsIgnoreCase("adm")){
            System.out.println("O(A) aluno(a) "+nome+" faz o curso de Administração");
        }
        else if (curso.equalsIgnoreCase("dir")){
            System.out.println("O(A) aluno(a) "+nome+" faz o curso de Direito");
        }
        else if (curso.equalsIgnoreCase("cex")){
            System.out.println("O(A) aluno(a) "+nome+" faz o curso de Comércio Exterior");
        }  
        else{
            System.out.println("Curso não encontrado.");
        }

        //* ex2
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite seu estado civil (S, C, V, D): ");
        String estcv = entrada.nextLine();

        if (estcv.equalsIgnoreCase("s")){
            System.out.println(nome+" é solteiro(a)");
        }
        else if (estcv.equalsIgnoreCase("c")){
            System.out.println(nome+" é casado(a)");
        }
        else if (estcv.equalsIgnoreCase("v")){
            System.out.println(nome+" é viúvo(a)");
        }
        else if (estcv.equalsIgnoreCase("d")){
            System.out.println(nome+" é divorciado(a)");
        }
        else{
            System.out.println("Estado civil não encontrado.");
        }

        //* ex3 
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.print(" T- Técnico\n E- Enegenheiro de Software\n A- Analista de Sistemas\n P- Programador\n W- Web-Designer\n G- Gerente Projetos\nDigite seu cargo: ");
        String cargo = entrada.nextLine().toLowerCase();  
        System.out.println("Digite seu salário: ");
        double salario = entrada.nextDouble();  

        switch (cargo){
            case "t":
                System.out.println(nome+" é Técnico, com salário "+salario);
                break;
            case "e": 
                System.out.println(nome+" é Enegenheiro de Software, com salário "+salario);
                break;
            case "a": 
                System.out.println(nome+" é Analista de Sistemas, com salário "+salario);
                break;
            case "p": 
                System.out.println(nome+" é Programador, com salário "+salario);
                break;
            case "w": 
                System.out.println(nome+" é Web-Designer, com salário "+salario);
                break;
            case "g": 
                System.out.println(nome+" é Gerente Projetos, com salário "+salario);
                break;
            default: 
                System.out.println("Cargo não encontrado.");
                break;
        }

        //* ex4
        System.out.print("A- adição\nS- subtração\nM- multiplicação\nD- divisão\nEscolha a operação: ");
        String op = entrada.nextLine().toLowerCase();
        System.out.print("Primeiro número: ");
        double n1 = entrada.nextDouble();
        System.out.print("Segundo número: ");
        double n2 = entrada.nextDouble();

        switch (op) {
            case "a":
                System.out.println(n1+n2);
                break;
            case "s":
                System.out.println(n1-n2);
                break;  
            case "m":
                System.out.println(n1*n2);
                break; 
            case "d":
                System.out.println(n1/n2);
                break;             
            default:
                System.out.println("Opção indisponível.");
                break;
        }

        //* ex1
        int i=1;
        while (i<3){
            System.out.print("Digite o nome do "+i+"º aluno: ");
            String nome = entrada.nextLine();
            i++;
            System.out.print("Digite a disciplina do aluno "+nome+": ");
            String disc = entrada.nextLine();
            System.out.print("Digite a primeria nota do aluno "+nome+": ");
            double nota1 = entrada.nextDouble();
            System.out.print("Digite a segunda nota do aluno "+nome+": ");
            double nota2 = entrada.nextDouble();
            System.out.println("");
            String z = entrada.nextLine(); //pra n bugar a rep (pulava o nome do 2 pq ia numero e dps string (q nao funciona/nao deixa escrever))

            double media = (nota1+nota2)/2;
            String sit;
            if (media<5){
                sit = "reprovado";
            }
            else if (5<=media&&media<7){
                sit = "em recuperação";
            }
            else{
                sit = "aprovado";
            }
            System.out.println("O aluno "+nome+" ficou com média "+media+" e está "+sit+" na disciplina "+disc);
        }

        //* ex2 
        int inf=0, mec=0, ele=0, des=0;
        for (int i=1; i<3; i++){
            System.out.print("Digite o nome do "+i+"º aluno: ");
            String nome = entrada.nextLine();
            System.out.print("INF- Informática\nMEC- Mecânica\nELE- Eletrônica\nDES- Design\nDigite o curso do aluno "+nome+": ");
            String curso = entrada.nextLine().toLowerCase();

            switch (curso) {
                case "inf":
                    inf++;
                    break;
                case "mec":
                    mec++;
                    break;
                case "ele":
                    ele++;
                    break;
                case "des":
                    des++;
                    break;                              
                default:
                    System.out.println("Opção indisponível.");
                    break;
            }
        }
        System.out.println("");
        System.out.println("Total de alunos em cada curso: \nInformática: "+inf+"\nMecânica: "+mec+"\nEletrônica: "+ele+"\nDesign: "+des);

        //* ex3
        int a=0, p=0, c=0, v=0;
        double total=0;
        for (int i=1; i<3; i++){
            System.out.print("Digite o nome do "+i+"º funcionário: ");
            String nome = entrada.nextLine();
            System.out.print("A- Almoxarifado\nP- Produção\nC- Contabilidade\nV- Vendas\nDigite o setor do funcionário "+nome+": ");
            String setor = entrada.nextLine().toLowerCase();
            System.out.print("Digite o salário do funcionário "+nome+": ");
            double sal = entrada.nextDouble();
            total=total+sal;

            System.out.println("");
            String z = entrada.nextLine(); //pra n bugar a rep (pulava o nome do 2 pq ia numero e dps string (q nao funciona/nao deixa escrever))

            switch (setor) {
                case "a":
                    a++;
                    break;
                case "p":
                    p++;
                    break;
                case "c":
                    c++;
                    break;
                case "v":
                    v++;
                    break;                              
                default:
                    System.out.println("Opção indisponível.");
                    break;
            }
        }
        System.out.println("");
        System.out.println("Total de funcionários em cada setor: \nAlmoxarifado: "+a+"\nProdução: "+p+"\nContabilidade: "+c+"\nVendas: "+v+"\nTotal dos salários: R$"+total);

        //* ex4
        int ef=0, em=0, et=0, g=0;
        for (int i=1; i<3; i++){
            System.out.print("Digite o nome do "+i+"º aluno: ");
            String nome = entrada.nextLine();
            System.out.print("EF- Ensino Fundamental\nEM- Ensino Médio\nET- Ensino Técnico\nG-  Graduação\nDigite a formação do aluno "+nome+": ");
            String form = entrada.nextLine().toLowerCase();

            switch (form) {
                case "ef":
                    ef++;
                    break;
                case "em":
                    em++;
                    break;
                case "et":
                    et++;
                    break;
                case "g":
                    g++;
                    break;                              
                default:
                    System.out.println("Opção indisponível.");
                    break;
            }
        }
        System.out.println("");
        System.out.println("Total de alunos em cada formação: \nEnsino Fundamental: "+ef+"\nEnsino Médio: "+em+"\nEnsino Técnico: "+et+"\nGraduação: "+g);

        //* ex5 
        int f=0, m=0, maior=0, menor=0;
        for (int i=1; i<3; i++){
            System.out.print("Digite o nome do "+i+"º aluno: ");
            String nome = entrada.nextLine();
            System.out.print("F- Feminino\nM- Masculino\nDigite o sexo do aluno "+nome+": ");
            String form = entrada.nextLine().toLowerCase();
            System.out.print("Digite a idade do aluno "+nome+": ");
            int idade = entrada.nextInt();

            System.out.println("");
            String z = entrada.nextLine(); //pra n bugar a rep (pulava o nome do 2 pq ia numero e dps string (q nao funciona/nao deixa escrever))

            if (idade>=18){
                maior++;
            }
            else{
                menor++;
            }

            switch (form) {
                case "f":
                    f++;
                    break;
                case "m":
                    m++;
                    break;                              
                default:
                    System.out.println("Opção indisponível.");
                    break;
            }
        }
        System.out.println("");
        System.out.println("Total de alunos por sexo: \nFeminino: "+f+"\nMasculino: "+m+"\n\nAlunos maior de idade: "+maior+"\nAlunos menor de idade: "+menor);

    }
}
