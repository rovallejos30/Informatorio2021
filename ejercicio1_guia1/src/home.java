import java.util.Scanner;

public class home {

    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);
        String usuario;
        System.out.println("Ingrese nombre de usuario");
        usuario= scan.nextLine();
        System.out.println("Hola "+usuario);
    }

}
