import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);
        String frase;
        System.out.println("Ingrese frase:");
        frase= scan.nextLine();
        String fraseFinal= "";
        for(int i=0; i<frase.length(); i++){
            if((frase.charAt(i))>=97 && (frase.charAt(i))<=122){
                char var= (char) ((frase.charAt(i))-32);
                fraseFinal += var;
            } else if ((frase.charAt(i))==' '){
                fraseFinal += " ";
            }
        }
        System.out.println(fraseFinal);
    }

}
