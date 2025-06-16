package exercicios;

// Exercício 12 - Biblioteca de Livros (do chat)
// Objetivo: Gerenciar uma lista de livros com título e autor.
// Funcionalidades:
// Adicionar livro
// Remover livro pelo codigo
// Listar todos os livros
// Buscar livro por parte do título/codigo

import java.util.ArrayList;
import javax.swing.JOptionPane;

class Livro{
    private int id;
    private String titulo;
    private String autor;
    private String editora;
    private int pags;

    public Livro(int id, String titulo, String autor, String editora, int pags) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.pags = pags;
    }

    public int getId(){
        return id;
    }
    public String getTitulo(){
        return titulo;
    }
    public String geyAutor(){
        return autor;
    }
    public String getEditora(){
        return editora;
    }
    public int getPags(){
        return pags;
    }

    @Override
    public String toString(){
        return "Id: "+id+",\nTítulo: "+titulo+",\nAutor: "+autor+",\nEditora: "+editora+",\nNº de páginas: "+pags+"\n";
    }
}

public class Ex12 {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();
        int menu = 1;
        while (menu!=5){
            menu = Integer.parseInt(JOptionPane.showInputDialog(("Biblioteca!\n1- Adicionar livro\n2- Remover livro\n3- Listar livros\n4- Pesquisar livros\n5- Sair")));
            if (menu==5){
                JOptionPane.showMessageDialog(null,"Saindo");
                break;
            }

            switch (menu) {
                case 1:
                    int id;
                    boolean idExiste;
                    do {
                        id = Integer.parseInt(JOptionPane.showInputDialog("Digite a id do novo livro"));
                        idExiste = false;
                
                        for (Livro y : livros) {
                            if (id == y.getId()) {
                                JOptionPane.showMessageDialog(null, "ID já cadastrado! Tente outro.");
                                idExiste = true;
                                break;
                            }
                        }
                    } while (idExiste);
                    String titulo = JOptionPane.showInputDialog("Digite o título do novo livro");
                    String autor = JOptionPane.showInputDialog("Digite o autor do novo livro");
                    String editora = JOptionPane.showInputDialog("Digite a editora do novo livro");
                    int pags = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de páginas do novo livro"));
                
                    livros.add(new Livro(id, titulo, autor, editora, pags));
                    System.out.println("Livro adicionado");
                    break;
                case 2:
                    for (Livro x : livros){
                        System.out.println( "Id: "+x.getId()+", Título: "+x.getTitulo());
                    }
                    int rem = Integer.parseInt(JOptionPane.showInputDialog("Digite a id do livro que deseja remover"));
                    for (Livro z: livros){
                        if (rem == z.getId()){
                            livros.remove(z);
                        }
                    }
                    System.out.println("Livro removido");
                    break;
                case 3:
                    if (livros.isEmpty()){
                        System.out.println("Você não tem nenhum livro cadastrado");
                    }
                    else{
                        System.out.println("Livros cadastrados:");
                        for (Livro a: livros){
                            System.out.println(a);
                        }
                    }
                    break;
                case 4:
                    boolean encontrado = false;
                    String pesq = JOptionPane.showInputDialog("Digite o título do livro para pesquisar");
                    for (Livro l : livros) {
                        if (l.getTitulo().toLowerCase().contains(pesq.toLowerCase())) {
                            System.out.println("Livro encontrado:\n" + l);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado){
                        System.out.println("Nenhum livro2 encontrado");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
