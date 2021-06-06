import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor1, valor2;
        System.out.println("Ingrese un valor: ");
        valor1 = scan.nextInt();
        System.out.println("Ingrese otro valor, el mismo debe ser mayor al anterior ingresado: ");
        while(true){
            valor2 = scan.nextInt();
            if(valor2 > valor1) {
                break;
            }
            System.out.println("Error, el valor ingresado no es mayor al primer valor ingresado");
        }
        fizzBuzz(valor1, valor2);
    }

    static Object[] fizzBuzz(int valor1, int valor2) {
        List<String> secuenciaNumeros = new ArrayList<>();
        for (int i = valor1; i < valor2; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                secuenciaNumeros.add("FizzBuzz");
            } else if (i % 2 == 0) {
                secuenciaNumeros.add("Fizz");
            } else if (i % 3 == 0) {
                secuenciaNumeros.add("Buzz");
            } else {
                secuenciaNumeros.add(Integer.toString(i));
            }
        }
        System.out.println(secuenciaNumeros);
        return secuenciaNumeros.toArray();
    }



}
