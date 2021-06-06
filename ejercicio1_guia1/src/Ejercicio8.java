import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);
        String nomap;
        int edad;
        String direccion;
        String ciudad;

        System.out.println("Ingrese nombre y apellido: ");
        nomap= scan.nextLine();

        System.out.println("Ingrese edad: ");
        edad= scan.nextInt();

        scan.nextLine();

        System.out.println("Ingrese dirección: ");
        direccion= scan.nextLine();

        System.out.println("Ingrese ciudad: ");
        ciudad= scan.nextLine();

        System.out.println(ciudad+"-"+direccion+"-"+edad+"-"+nomap);

    }

}
