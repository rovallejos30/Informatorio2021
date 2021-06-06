import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);
        double num1;
        double num2;
        System.out.println("Ingrese primer número: ");
        num1= scan.nextInt();
        System.out.println("Ingrese segundo número: ");
        num2= scan.nextInt();

        double suma= num1+num2;
        double resta= num1-num2;
        double mult= num1*num2;
        double div= num1/num2;
        double mod= num1%num2;

        System.out.println("Suma: "+suma);
        System.out.println("Resta "+resta);
        System.out.println("Multiplicación "+mult);
        System.out.println("División "+div);
        System.out.println("Módulo "+mod);
    }

}
