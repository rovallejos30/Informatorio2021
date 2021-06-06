import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Ingrese número: ");
        num = scan.nextInt();
        int factorial= 1;

        for (int i=1; i<=num; i++){
            factorial *= i;
        }

        System.out.print("El factorial del número ingresado es: "+factorial);
    }
}
