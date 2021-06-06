import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        List<String> ciudades  = new ArrayList<>();
        String ciudad;
        String resp= "si";
        while (resp.equals("si")){
            System.out.println("Ingrese una ciudad: ");
            ciudad = scan.nextLine();
            ciudades.add(ciudad);
            System.out.println("Si desea agregar otra ciudad, ingrese 'si', de lo contrario el programa se detendrá");
            resp = scan2.nextLine().toLowerCase();
        }
        for(int i = 0; i < ciudades.size(); i++){
            System.out.println("#" + (i+1) + " - " + ciudades.get(i));
        }
        scan.close();
        scan2.close();
    }

}
