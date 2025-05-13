import javax.swing.JOptionPane;


//! metodo com return nao tem void (so pode retornar 1 variavel)

public class Aula3Metodos {
    public static void main(String[] args) {
        /* Cadastro(); */
        /* Categoria(); */
        /* IMC(); */
        /* Media(); */
        /* EstCiv(); */
        /* Operacao(); */
        /* Salario(); */
        /* Alunos(); */
        /* Uni(); */
        /* Empresa(); */
        /* Prof();
        Disc(); */
        /* Setor();
        Func(); */
        /* Cursos();
        Coords();
        Alunoss(); */
        /* Escola(); */
        /* Funcs(); */
        System.exit(0);
    }

    //* ex1 */
    public static void Cadastro(){
        while (true) {
            String nome = JOptionPane.showInputDialog("Digite o nome: ");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
            JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nIdade: "+idade);

            if (idade>=18){
                System.out.println(nome+"é maior de idade");
            }
            else{
                System.out.println(nome+"é menor de idade");
            }
            
            String op = JOptionPane.showInputDialog("Sair? (S/N)").toUpperCase();
            if (op.equals("S")){ //! STRING SÓ COMPARA COM .EQUALS()
                break;
            }
        }
        
    }


    //* ex2 */
    public static void Categoria(){
        while (true) {
            String nome = JOptionPane.showInputDialog("Digite o nome: ");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
    
            if (idade<=10){
            System.out.println(nome+": Categoria infantil");
            }
            else if (idade<=17){
                System.out.println(nome+": Categoria juvenil");
            }
            else if (idade<=30){
                System.out.println(nome+": Categoria adulto");
            }

            String op = JOptionPane.showInputDialog("Sair? (S/N)").toUpperCase();
            if (op.equals("S")){
                break;
            }
        }
    }
    
    //* ex3 */
    public static void IMC(){
        while (true) {
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
            System.out.println("Seu imc é: "+peso/(altura*altura));

            String op = JOptionPane.showInputDialog("Sair? (S/N)").toUpperCase();
            if (op.equals("S")){
                break;
            }
        }
    }

    //* ex4 */
    public static void Media(){
        while (true) {
            String nome = JOptionPane.showInputDialog("Digite o nome: ");
            double media = Double.parseDouble(JOptionPane.showInputDialog("Digite a média:"));
            if (media<5){
                System.out.println(nome+": Reprovado");
            }
            else if (media<7){
                System.out.println(nome+": Recuperação");
            }
            else{
                System.out.println(nome+": Aprovado");
            }

            String op = JOptionPane.showInputDialog("Sair? (S/N)").toUpperCase();
            if (op.equals("S")){
                break;
            }
        }
    }

    //* ex5 */
    public static void EstCiv(){
        while (true) {
            String nome = JOptionPane.showInputDialog("Digite seu nome");
            String estadocivil = JOptionPane.showInputDialog("Digite o estado civil (S, C, V, D):").toUpperCase();
    
            switch (estadocivil) {
                case "S":
                    System.out.println(nome+" é solteiro");
                    break;
                case "C":
                    System.out.println(nome+" é casado");
                    break;
                case "V":
                    System.out.println(nome+" é viúvo");
                    break;
                case "D":
                    System.out.println(nome+" é divorciado");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

            String op = JOptionPane.showInputDialog("Sair? (S/N)").toUpperCase();
            if (op.equals("S")){
                break;
            }
        }
    }

    //* ex6 */
    public static void Operacao(){
        while (true) {
            double v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 1"));
            double v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 2"));
            String op = JOptionPane.showInputDialog("Escolha a operação:\nA- Adição\nS- Subtração\nM- Multiplicação\nD- Divisão").toUpperCase();
    
            switch (op) {
                case "A":
                    System.out.println("A adição resultou em "+(v1+v2));
                    break;
                case "S":
                    System.out.println("A subtração resultou em "+(v1-v2));
                    break;
                case "M":
                    System.out.println("A multiplicação resultou em "+(v1*v2));
                    break;   
                case "D":
                    System.out.println("A divisão resultou em "+(v1/v2));
                    break;        
                default:
                    break;
            }
            
            String p = JOptionPane.showInputDialog("Sair? (S/N)").toUpperCase();
            if (p.equals("S")){
                break;
            }
        }
    }

    //* ex7  */
    public static void Salario(){
        int ate3=0, ate5=0, mais5=0;
        while (true){
            String nome = JOptionPane.showInputDialog("Digite o nome: ");
            double sal = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario:"));

            if (sal<=3000){
                ate3++;
            }
            else if (sal<=5000){
                ate5++;
            }
            else{
                mais5++;
            }

            String op = JOptionPane.showInputDialog("Sair? (S/N)").toUpperCase();
            if (op.equals("S")){
                break;
            }
        }
        System.out.println("Funcionários que recebem ate R$3000: "+ate3+"\nFuncionários que recebem entre R$3000 e R$5000: "+ate5+"\nFuncionários que recebem mais que R$5000: "+mais5);
    }

    //* ex8 */
    public static void Alunos(){
        int ef=0, em=0, et=0;
        while (true){
            String nome = JOptionPane.showInputDialog("Digite o nome: ");
            String form = JOptionPane.showInputDialog("Escolha a formação:\nEF- Ensino Fundamental\nEM- Ensino Médio\nET- Ensino Técnico").toUpperCase();
            switch (form) {
                case "EF":
                    ef++;
                    break;
                case "EM":
                    em++;
                    break;
                case "ET":
                    et++;
                    break; 
                default:
                    System.out.println("Opção inválida");
                    break;
            }

            String op = JOptionPane.showInputDialog("Sair? (S/N)").toUpperCase();
            if (op.equals("S")){
                break;
            }
        }
        System.out.println("Alunos no Ensino Fundamental: "+ef+"\nAlunos no Ensino Médio: "+em+"\nAlunos no Ensino Técnico: "+et);
    }

    //* ex9 */
    public static void Uni(){
        int maior=0, menor=0, masc=0, fem=0;
        while (true){
            String nome = JOptionPane.showInputDialog("Digite o nome: ");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
            String sexo = JOptionPane.showInputDialog("Digite o sexo (F/M): ").toUpperCase();

            if (idade>=18){
                maior++;
            }
            else{
                menor++;
            }

            if (sexo.equals("F")){  //? comparar string tem q ser equals
                fem++;
            }
            else if (sexo.equals("M")){
                masc++;
            }
            else{
                JOptionPane.showMessageDialog(null, "Sexo inválido");
            }

            String op = JOptionPane.showInputDialog("Sair? (S/N)").toUpperCase();
            if (op.equals("S")){
                break;
            }
        }
        System.out.println("Alunos maiores de idade: "+maior+"\nAlunos menor de idade: "+menor+"\nAlunos do sexo feminino: "+fem+"\nAlunos do sexo masculino: "+masc);
    }

    public static void Empresa(){
        double asis=0, prog=0, tec=0;
        while (true){
            String nome = JOptionPane.showInputDialog("Digite o nome: ");
            String cargo = JOptionPane.showInputDialog("Escolha o cargo:\nA- Analista de Sistemas\nP- Programador\nT- Técnico").toUpperCase();
            double sal = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario:"));

            switch (cargo) {
                case "A":
                    asis = asis+sal;
                    break;
                case "P":
                    prog = prog+sal;
                    break;
                case "T":
                    tec = tec+sal;
                    break;
                default:
                    System.out.println("Cargo inválido");
                    break;
            }

            String op = JOptionPane.showInputDialog("Sair? (S/N)").toUpperCase();
            if (op.equals("S")){
                break;
            }
        }
        System.out.println("Total dos salários de Analista de Sistemas: "+asis+"\nTotal dos salários de Programador: "+prog+"\nTotal dos salários de Técnico: "+tec+"\nTotal dos salários da empresa: "+(asis+prog+tec));
    }

    //* ex11 */
    public static void Prof(){
        while (true) {
            String nome = JOptionPane.showInputDialog("Digite seu nome");
            String form = JOptionPane.showInputDialog("Digite sua formação");
            System.out.println("Nome do prof: "+nome+". Formação do prof: "+form);

            String op = JOptionPane.showInputDialog("Sair? (S/N)").toUpperCase();
            if (op.equals("S")){
                break;
            }
        }
    }
    public static void Disc(){
        while (true) {
            String nome = JOptionPane.showInputDialog("Digite o nome da disciplina");
            int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de aulas da disciplina "+nome));
            System.out.println("Nome da disciplina: "+nome+". Quantidade de aulas: "+qtd);

            String op = JOptionPane.showInputDialog("Sair? (S/N)").toUpperCase();
            if (op.equals("S")){
                break;
            }
        }
    }

    //* ex12 */
    public static void Setor(){
        while (true) {
            String nome = JOptionPane.showInputDialog("Digite o nome do setor");
            String gerente = JOptionPane.showInputDialog("Digite o nome do gerente");
            int tel = Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone "));
    
            System.out.println("Nome do setor: "+nome+"\nGerente: "+gerente+"\nTelefone: "+tel);

            String op = JOptionPane.showInputDialog("Sair? (S/N)").toUpperCase();
            if (op.equals("S")){
                break;
            }
        }
    }
    public static void Func(){
        while (true) {
            String nome = JOptionPane.showInputDialog("Digite o nome do funcionário: ");
            String cargo = JOptionPane.showInputDialog("Digite o cargo de "+nome);
            double sal = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário de "+nome));
            System.out.println("Dados do funcionário:\nNome: "+nome+"\nCargo: "+cargo+"\nSalário: "+sal);
            
            String op = JOptionPane.showInputDialog("Sair? (S/N)").toUpperCase();
            if (op.equals("S")){
                break;
            }
        }
    }

    //* ex13 */
    public static void Cursos(){
        while (true) {
            String nome = JOptionPane.showInputDialog("Digite o nome do curso: ");
            String periodo = JOptionPane.showInputDialog("Digite o periodo de "+nome);
            System.out.println("Nome curso:"+nome+"\nPeríodo: "+periodo);
            
            String op = JOptionPane.showInputDialog("Sair? (S/N)").toUpperCase();
            if (op.equals("S")){
                break;
            }
        }
    }
    public static void Coords(){
        while (true) {
            String nome = JOptionPane.showInputDialog("Digite o nome do coordenador: ");
            double sal = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário de "+nome));
            System.out.println("Nome coordenador:"+nome+"\nSalário: "+sal);
            
            String op = JOptionPane.showInputDialog("Sair? (S/N)").toUpperCase();
            if (op.equals("S")){
                break;
            }
        }
    }
    public static void Alunoss(){
        while (true) {
            String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de "+nome));
            String sexo = JOptionPane.showInputDialog("Digite o sexo de "+nome);
            System.out.println("Nome aluno: "+nome+"\nIdade: "+idade+"\nSexo: "+sexo);
            String op = JOptionPane.showInputDialog("Sair? (S/N)").toUpperCase();
            if (op.equals("S") ){
                break;
            }
        }
        
    }

    //* ex14 */
    public static void Escola(){
        int adm=0, info=0, des=0, meca=0, m=0, v=0, n=0;
        while (true){
            String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
            String curso = JOptionPane.showInputDialog("Digite o curso do aluno "+nome+" (ADM, Design, Meca ou Info)").toLowerCase();
            String periodo = JOptionPane.showInputDialog("Digite o período do curso "+curso+" (M-Matutino, V-Vespertino, N-Noturno)").toUpperCase();

            switch (curso) {
                case "adm":
                    adm++;
                    break;
                case "design":
                    des++;
                    break;
                case "meca":
                    meca++;
                    break;
                case "info":
                    info++;
                    break;
                default:
                JOptionPane.showMessageDialog(null,"Curso inválido");
                    break;
            }

            switch (periodo) {
                case "M":
                    m++;
                    break;
                case "V":
                    v++;
                    break;
                case "N":
                    n++;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Período inválido");
                    break;
            }

            String op = JOptionPane.showInputDialog("Sair? (S/N)").toUpperCase();
            if (op.equals("S")){
                break;
            }
        }
        System.out.println("Total de alunos por período:\nMatutino: "+m+"\nVespertino: "+v+"\nNoturno: "+n+"\nTotal de alunos por curso:\nAdm: "+adm+"\nDesign: "+des+"\nMecânica: "+meca+"\nInfo: "+info);

    }

    //* ex15 */
    public static void Funcs(){
        int v=0, c=0, p=0, f=0;
        double maior=0, menor=999999999;
        while (true){
            String nome = JOptionPane.showInputDialog("Digite o nome do funcionário");
            String setor = JOptionPane.showInputDialog("Digite o setor do funcionário "+nome+" (V-Vendas, C-Compras, P-Produção, F-Financeiro)").toUpperCase();
            double sal = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario:"));
            if (sal>maior){
                maior=sal;
            }
            if (sal<menor){
                menor=sal;
            }

            switch (setor) {
                case "V":
                    v++;
                    break;
                case "C":
                    c++;
                    break;
                case "P":
                    p++;
                    break;
                case "F":
                    f++;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Setor inválido");
                    break;
            }

            String op = JOptionPane.showInputDialog("Sair? (S/N)").toUpperCase();
            if (op.equals("S")){
                break;
            }
        }
        System.out.println("Total de funcionários por setor:\nVendas: "+v+"\nCompras: "+c+"\nProdução: "+p+"\nFinanceiro: "+f+"\nMaior salário: "+maior+"\nMenor salário: "+menor);
    }
}
