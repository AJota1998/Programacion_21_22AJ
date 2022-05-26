package T1.TEMA3.UNIDAD7.TAREA4;

import java.io.*;
import java.util.*;

public class main {
    private static Scanner sc = new Scanner(System.in);
    private static Map<String, Empleado> MapaEmpleados = new LinkedHashMap<>();

    public static void main(String[] args) {

        System.out.println("1) Leer datos desde fichero");
        System.out.println("2) Introducir manualmente los datos");
        System.out.println("¿Qué desea hacer? (1/2): ");
        Integer respuesta = sc.nextInt();
        sc.nextLine();

        if (respuesta == 1) {
            leer_fichero();
        } else if (respuesta == 2) {
            introducir_empleados();
        }
        visualizar_menu();
    }

    public static void visualizar_menu() {
        Integer respuesta;
        do {
            System.out.println("---- Menú ----");
            System.out.println("1. VISUALIZAR LISTADO");
            System.out.println("2. BORRAR EMPLEADO/S");
            System.out.println("3. VISUALIZAR EMPLEADO");
            System.out.println("4. MODIFICAR EMPLEADO");
            System.out.println("5. INSERTAR EMPLEADO/S");
            System.out.println("6. FINALIZAR");
            System.out.println("Introduzca la opción: ");
            respuesta = sc.nextInt();
            sc.nextLine();
            switch (respuesta) {
                case 1:
                    visualizar_listado();
                    break;
                case 2:
                    borrar_empleado();
                    break;
                case 3:
                    visualizar_empleado();
                    break;
                case 4:
                    modificar_empleado();
                    break;
                case 5:
                    introducir_empleados();
                    break;
                case 6:
                    finalizar();
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            visualizar_listado();
        } while (respuesta != 6);
    }

    public static void visualizar_listado() {
        Set<Map.Entry<String, Empleado>> entradas = MapaEmpleados.entrySet();
        Iterator<Map.Entry<String, Empleado>> it = entradas.iterator();

        while (it.hasNext()) {
            Map.Entry<String, Empleado> entrada = it.next();
            System.out.println(entrada.getValue());
        }
    }

    public static void borrar_empleado() {
        boolean seguir_introduciendo = true;
        do {
            System.out.println("Introduzca el DNI del empleado que quiere borrar: ");
            String dni_a_borrar = sc.nextLine();

            if (MapaEmpleados.containsKey(dni_a_borrar)) {
                MapaEmpleados.remove(dni_a_borrar);
            } else {
                System.out.println("El dni no está en la BD");
            }

            System.out.println("¿Desea seguir borrando empleados? (true/false)");
            seguir_introduciendo = sc.nextBoolean();
            sc.nextLine();
        } while (seguir_introduciendo);
    }

    public static void visualizar_empleado() {
        System.out.println("Introduzca el DNI del empleado que quiere visualizar: ");
        String dni = sc.nextLine();

        if (MapaEmpleados.containsKey(dni)) {
            System.out.println(MapaEmpleados.get(dni));
        } else {
            System.out.println("El dni no está en la BD");
        }
    }

    public static void modificar_empleado() {
        System.out.println("Introduzca el DNI del empleado que quiere modificar: ");
        String dni = sc.nextLine();

        if (MapaEmpleados.containsKey(dni)) {
            System.out.println("Introduzca el nombre del empleado: ");
            String nombre = sc.nextLine();
            System.out.println("Introduzca la edad del empleado: ");
            Integer edad = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduzca la altura del empleado: ");
            Double estatura = sc.nextDouble();
            sc.nextLine();
            System.out.println("Introduzca el sueldo del empleado: ");
            Double sueldo = sc.nextDouble();
            sc.nextLine();
            Empleado e = new Empleado(nombre, edad, estatura, dni, sueldo);
            MapaEmpleados.put(dni, e);
        } else {
            System.out.println("El dni no está en la BD");
        }
    }

    public static void finalizar() {
        try (ObjectOutputStream flujo_salida =
                     new ObjectOutputStream(new FileOutputStream("datos_empleados.dat"))) {
            flujo_salida.writeObject(MapaEmpleados);

        } catch (IOException e) {
            System.out.println("¡Error al escribir el fichero!");
        }
    }

    public static void introducir_empleados() {
        System.out.println("Introduzca los datos de los empleados");
        boolean seguir_introduciendo = true;
        while (seguir_introduciendo) {
            System.out.println("Introduzca el dni del empleado: ");
            String dni = sc.nextLine();
            System.out.println("Introduzca el nombre del empleado: ");
            String nombre = sc.nextLine();
            System.out.println("Introduzca la edad del empleado: ");
            Integer edad = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduzca la altura del empleado: ");
            Double estatura = sc.nextDouble();
            sc.nextLine();
            System.out.println("Introduzca el sueldo del empleado: ");
            Double sueldo = sc.nextDouble();
            sc.nextLine();
            Empleado e = new Empleado(nombre, edad, estatura, dni, sueldo);
            MapaEmpleados.put(dni, e);
            System.out.println("¿Introducir más? (true/false)");
            seguir_introduciendo = sc.nextBoolean();
            sc.nextLine();
        }
    }

    public static void leer_fichero() {
        try (ObjectInputStream flujo_entrada = new ObjectInputStream(new FileInputStream("datos_empleados.dat"))) {
            MapaEmpleados = (Map<String, Empleado>) flujo_entrada.readObject();

        } catch (IOException e) {
            System.out.println("¡Error al leer el fichero!");
        } catch (ClassNotFoundException e) { // <- esto es una excepción que se lanza cuando
            // no se encuentra la clase que se está leyendo.
            System.out.println(e.getMessage());
        }
    }
}