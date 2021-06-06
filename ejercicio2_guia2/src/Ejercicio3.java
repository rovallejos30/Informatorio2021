import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio3 {

    public static void main(String[] args) {

        List<String> cartas= new ArrayList<String>() {{ add("1"); add("2"); add("3"); add("4"); add("5"); add("6"); add("7"); add("8"); add("9"); add("10"); add("11"); add("12"); add("13");}};

        System.out.println("Elementos de la baraja: ");
        for(int i = 0; i < cartas.size(); i++){
            System.out.println(cartas.get(i));
        }

        Collections.reverse(cartas);

        System.out.println("Elementos de la baraja de forma inversa: ");
        for(int i = 0; i < cartas.size(); i++){
            System.out.println(cartas.get(i));
        }

        Collections.shuffle(cartas);
        System.out.println("Elementos de la baraja mezclados: ");
        for(int i = 0; i < cartas.size(); i++){
            System.out.println(cartas.get(i));
        }
    }

}
