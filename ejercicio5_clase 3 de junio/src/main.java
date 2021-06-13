import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class main {

    public static void main(String[] args) {
        List<Empleado> empleados = cargarEmpleados();

        System.out.println("Empleados cuyo apellido comienza con una letra determinada");
        for (Empleado e: Empleado.obtenerEmpleadoPrimeraLetraApellido(empleados, "S")) {
            System.out.println(e);
        }

        System.out.println("\nEmpleado más grande, empleado mas joven.");
        Map<String, Empleado> oldYoungMap = Empleado.obtenerEmpleadoMasJovenViejo(empleados);
        oldYoungMap.forEach((k,v) -> System.out.println(k +
                ":\nEmpleado: " + v.getName() + " " + v.getLastname() +
                " - Edad: " + v.getAge()));

        System.out.println("\nEmpleado con el salario más alto, y empleado con salario más bajo");
        Map<String, Empleado> bestPoorSalariesMap = Empleado.obtenerSalariosEmpleados(empleados);
        bestPoorSalariesMap.forEach((k,v) -> System.out.println(k +
                ":\nEmpleado: " + v.getName() + " " + v.getLastname() +
                " - Salario: " + v.getSalary()));

        System.out.println("\nEmpleados ordenados alfabeticamente por nombre y apellido.)");
        for (Empleado e: Empleado.ordenarNombreApellido(empleados)) {
            System.out.println(e);
        }
    }

    public static List<Empleado> cargarEmpleados() {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String[] employee;
        List<Empleado> empleados = new ArrayList<>();

        try {
            file = new File("src/empleados.txt");
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                employee = line.split(",");
                empleados.add(new Empleado(employee[0], employee[1], employee[2], employee[3]));
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (null != fileReader)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return empleados;
    }


}
