import java.util.ArrayList;

public class Listas {

    public static void main(String[] args) {
        ArrayList<Integer> listaDeInteiros = new ArrayList<>();
        ArrayList<String> listaDeStrings = new ArrayList<>();

        listaDeInteiros.add(1);
        listaDeInteiros.add(3);

        listaDeStrings.add("Um texto");
        listaDeStrings.add("Outro texto");

        System.out.println(listaDeInteiros.size());
        System.out.println(listaDeInteiros.get(1));
        System.out.println(listaDeStrings.removeLast());
    }
}
