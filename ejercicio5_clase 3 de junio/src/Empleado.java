import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Empleado {
    private String name;
    private String lastname;
    private LocalDate birth;
    private float salary;

    public Empleado(String name, String lastname, String birth, String salary) {
        this.name = name;
        this.lastname = lastname;
        this.birth = LocalDate.parse(birth, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.salary = Float.parseFloat(salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setBirth(String birth) {
        this.birth = LocalDate.parse(birth, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public int getAge() {
        Period difference = Period.between(this.birth, LocalDate.now());
        return difference.getYears();
    }

    public static List<Empleado> obtenerEmpleadoPrimeraLetraApellido(List<Empleado> empleado, String letra) {
        List<Empleado> listaEmpleados = new ArrayList<>();
        for (Empleado emp : empleado) {
            if (letra.equalsIgnoreCase(String.valueOf(emp.getLastname().charAt(0))))
                listaEmpleados.add(emp);
        }

        return listaEmpleados;
    }

    public static Map<String, Empleado> obtenerEmpleadoMasJovenViejo(List<Empleado> empleados) {
        Map<String, Empleado> employeesMap = new HashMap<>();
        empleados.sort(Comparator.comparing(Empleado::getAge));

        employeesMap.put("Joven", empleados.get(0));
        employeesMap.put("Mayor", empleados.get(empleados.size() - 1));
        return employeesMap;
    }
    public static Map<String, Empleado> obtenerSalariosEmpleados(List<Empleado> empleados) {
        Map<String, Empleado> employeesMap = new HashMap<>();
        empleados.sort(Comparator.comparing(Empleado::getSalary));

        employeesMap.put("Salario bajo", empleados.get(0));
        employeesMap.put("Salario alto", empleados.get(empleados.size() - 1));
        return employeesMap;
    }
    public static List<Empleado> ordenarNombreApellido(List<Empleado> empleados) {
        empleados.sort(Comparator.comparing(Empleado::getName).thenComparing(Empleado::getLastname));
        return empleados;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre='" + name + '\'' +
                ", Apellido='" + lastname + '\'' +
                ", Fecha de nacimiento=" + birth.toString() +
                ", Salario=" + salary +
                '}';
    }

}
