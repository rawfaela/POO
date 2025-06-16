package exercicios.revisaoprova.escola;

import java.util.*;
import javax.swing.JOptionPane;

public class Cadastrar {
    public static void main(String[] args) {
        ArrayList<Professor> professores = new ArrayList<>();
        int opcao = 0;

        while (opcao != 5) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "Menu - Gestão de Professores\n" +
                "1 - Cadastrar professor\n" +
                "2 - Remover professor pelo nome\n" +
                "3 - Listar professores\n" +
                "4 - Buscar professor pelo nome\n" +
                "5 - Sair"
            ));

            switch (opcao) {
                case 1:
                    int tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo de professor:\n1 - Auxiliar\n2 - Temporário\n3 - Efetivo"));

                    if (tipo < 1 || tipo > 3) {
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                        break;
                    }

                    String nome = JOptionPane.showInputDialog("Nome:");
                    int matricula = Integer.parseInt(JOptionPane.showInputDialog("Matrícula:"));
                    String cidade = JOptionPane.showInputDialog("Cidade:");
                    String estado = JOptionPane.showInputDialog("Estado:");
                    int telefone = Integer.parseInt(JOptionPane.showInputDialog("Telefone:"));
                    double salario_base = Double.parseDouble(JOptionPane.showInputDialog("Salário base:"));

                    switch (tipo) {
                        case 1:
                            String formacao = JOptionPane.showInputDialog("Formação:");
                            professores.add(new Auxiliar(nome, matricula, cidade, estado, telefone, salario_base, formacao));
                            break;
                        case 2:
                            int inicio = Integer.parseInt(JOptionPane.showInputDialog("Data de início:"));
                            int fim = Integer.parseInt(JOptionPane.showInputDialog("Data de fim:"));
                            professores.add(new Temporario(nome, matricula, cidade, estado, telefone, salario_base, inicio, fim));
                            break;
                        case 3:
                            String disciplina = JOptionPane.showInputDialog("Disciplina:");
                            int horas = Integer.parseInt(JOptionPane.showInputDialog("Nº de horas:"));
                            professores.add(new Efetivo(nome, matricula, cidade, estado, telefone, salario_base, disciplina, horas));
                            break;
                    }
                    JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!");
                    break;

                case 2:
                    String rem = JOptionPane.showInputDialog("Nome do professor para remover:");
                    boolean removido = false;
                    for (int i = 0; i<professores.size(); i++){
                        if (professores.get(i).getNome().equalsIgnoreCase(rem)){
                            professores.remove(i);
                            removido =true;
                            JOptionPane.showMessageDialog(null, "Professor removido.");
                        }
                    }
                    if (!removido) {
                        JOptionPane.showMessageDialog(null, "Professor não encontrado.");
                    }
                    break;

                case 3:
                    if (professores.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum professor cadastrado.");
                    } else {
                        StringBuilder lista = new StringBuilder("Professores cadastrados:\n");
                        for (Professor p : professores) {
                            lista.append(p.toString()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, lista.toString());
                    }
                    break;

                case 4:
                    String nomeBusca = JOptionPane.showInputDialog("Nome do professor para buscar:");
                    StringBuilder encontrados = new StringBuilder();
                    for (Professor p : professores) {
                        if (p.getNome().toLowerCase().contains(nomeBusca.toLowerCase())) {
                            encontrados.append(p.toString()).append("\n");
                        }
                    }
                    if (encontrados.length() == 0) {
                        JOptionPane.showMessageDialog(null, "Nenhum professor encontrado.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Encontrado(s):\n" + encontrados.toString());
                    }
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Encerrando o sistema.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}

