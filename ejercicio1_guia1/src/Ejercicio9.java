import java.util.Locale;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);
        String frase;
        System.out.println("Ingrese frase:");
        frase= scan.nextLine();
        frase= frase.toLowerCase();
        System.out.println("Ingrese caracter a buscar: ");
        char letra= scan.next().toLowerCase().charAt(0);
        int contador= 0;
        for(int i=0; i<frase.length(); i++){
            if((frase.charAt(i))==letra){
                contador += 1;
            }
        }
        if(contador==1){
            System.out.println("El caracter buscado aparece "+contador+" vez");
        } else {
            System.out.println("El caracter buscado aparece " + contador + " veces");
        }
    }
}
