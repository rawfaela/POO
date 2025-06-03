import java.util.ArrayList;

public class ExercicioAnimais {
    public static void main(String[] args) {
        ArrayList<String> animais = new ArrayList<>();
        animais.add("Cão");
        animais.add("Gato");
        animais.add("Elefante");
        animais.add("Tigre");
        animais.add("Urso");
        animais.add("Leão");
        System.out.println("Animais com até 5 letras:");
        for (int i = 0; i < animais.size(); i++) {
            if (animais.get(i).length() <= 5) {
                System.out.println(animais.get(i));
            }
        }
    }
}
