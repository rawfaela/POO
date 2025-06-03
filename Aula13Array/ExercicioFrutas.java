import java.util.ArrayList;

public class ExercicioFrutas {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Uva");
        frutas.add("Banana");
        frutas.add("Pera");
        frutas.add("Kiwi");
        if (frutas.contains("Banana")) {
            System.out.println("A fruta Banana está na lista!");
        } else {
            System.out.println("A fruta Banana NÃO está na lista.");
        }
    }
}