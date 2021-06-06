import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {

    public static void main(String[] args) {

        List<Integer> horasTrabajadas  = new ArrayList<Integer>() {{ add(8); add(8); add(6); add(4); add(6);}};

        List<Integer> valorXHora  = new ArrayList<Integer>() {{ add(200); add(457); add(154); add(364); add(333);}};

        int totalFinal=0;

        List<Integer> sueldos  = new ArrayList<>();

        for(int i=0; i<horasTrabajadas.size();i++){

            sueldos.add((horasTrabajadas.get(i))*(valorXHora.get(i)));
            totalFinal += sueldos.get(i);
        }

        System.out.println("Sueldo Semanal: " + sueldos);

        System.out.println("Total final: "+totalFinal);
    }

}
