import java.util.*;

public class Ejercicio6 {

    public static void main(String[] args) {
        HashSet<HashMap<String, String>> empleados = empleados();
        sueldos(empleados);
    }

    static HashSet<HashMap<String, String>> empleados() {
        Scanner scan = new Scanner(System.in);
        HashSet<HashMap<String, String>> listaEmpleados = new HashSet<>();
        String continuar="si";
        while (continuar.equals("si")) {
            HashMap<String, String> empleado = new HashMap<>();
            System.out.println("Nombre y Apellido:");
            String nombre = scan.nextLine();
            System.out.println("DNI:");
            String dni = scan.nextLine();
            System.out.println("Horas Trabajadas:");
            String horas = scan.nextLine();
            System.out.println("Valor por hora:");
            String valorHora = scan.nextLine();
            empleado.put("nombre", nombre);
            empleado.put("dni", dni);
            empleado.put("horas", horas);
            empleado.put("valorHora", valorHora);
            listaEmpleados.add(empleado);
            System.out.println("Si desea continuar cargando datos ingrese si, de lo contrario el programa se detendrá.");
            continuar = scan.nextLine().toLowerCase();
        }
        scan.close();
        return listaEmpleados;
    }

    static void sueldos(HashSet<HashMap<String, String>> empleados) {
        List<HashMap<Integer, Integer>> listaSueldos = new ArrayList<>();
        for (HashMap<String, String> empleado : empleados) {
            HashMap<Integer, Integer> sueldoEmpleado = new HashMap<>();
            int horas = Integer.parseInt(empleado.get("horas"));
            int dni = Integer.parseInt(empleado.get("dni"));
            int valorHora = Integer.parseInt(empleado.get("valorHora"));
            int sueldo = horas * valorHora;
            sueldoEmpleado.put(dni, sueldo);
            listaSueldos.add(sueldoEmpleado);
        }
    }

}
