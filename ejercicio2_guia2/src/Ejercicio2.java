import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

    public static void main(String[] args) {
        List<Integer> nros  = new ArrayList<>();
        nros.add(3);
        nros.add(4);
        nros.add(6);
        nros.add(2);
        nros.add(11);
        for(int i = 0; i < nros.size(); i++){
            System.out.println(nros.get(i));
        }
        System.out.println("El tamaño de la lista es " + nros.size());
        nros.add(0, 9);
        nros.add(16);
        for(int i = 0; i < nros.size(); i++){
            System.out.println(nros.get(i));
        }
        System.out.println("El tamaño de la lista es " + nros.size());
    }

}
