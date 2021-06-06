import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);
        int num1;
        int num2;
        int res= 0;
        System.out.println("Ingrese primer número: ");
        num1= scan.nextInt();
        System.out.println("Ingrese segundo número: ");
        num2= scan.nextInt();

            for(int i=1; i<=num2; i++){
                res += num1;
            }
            System.out.print("El resultado es: "+res);
        }

}
