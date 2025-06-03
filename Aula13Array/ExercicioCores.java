import java.util.ArrayList;

public class ExercicioCores {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Vermelho");
        cores.add("Amarelo");
        cores.add("Roxo");
        System.out.println("Lista de cores:");
        for (int i = 0; i < cores.size(); i++) {
            System.out.println(cores.get(i));
        }
    }
}