import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

    public static void main(String[] args) {
        List<String> alumnos  = new ArrayList<String>() {{ add("Pepe Luis"); add("Lara Croft"); add("Juan Perez"); add("Angelina Jolie"); add("Brad Pitt"); add("Jennifer Aniston"); add("Carlos Tevez"); add("Patricio Rey"); add("Susana Horia"); add("Armando Remos"); add("Hugo Roberto"); add("Carla Alejandra");}};
        List<String> curso1 = alumnos.subList(0,4);
        System.out.println("Alumnos del curso 1: ");
        for(int i = 0; i < curso1.size(); i++){
            System.out.println(curso1.get(i));
        }

        List<String> curso2 = alumnos.subList(4,8);
        System.out.println("Alumnos del curso 2: ");
        for(int i = 0; i < curso2.size(); i++){
            System.out.println(curso2.get(i));
        }

        List<String> curso3 = alumnos.subList(8,12);
        System.out.println("Alumnos del curso 3: ");
        for(int i = 0; i < curso3.size(); i++){
            System.out.println(curso3.get(i));
        }
    }

}
