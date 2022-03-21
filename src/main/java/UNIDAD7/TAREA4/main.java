package UNIDAD7.TAREA4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class main {
    static Scanner teclado = new Scanner(System.in);
    private static Map<String, Empleado> MapaEmpleado = new LinkedHashMap<>();
    public static void main(String[] args) {
        

        System.out.println("1-Leer datos desde fichero");
        System.out.println("2-Introducir manualmente los datos");
        System.out.println("¿Qué desea hacer?");
        Integer respuesta = teclado.nextInt();
        teclado.nextLine(); //Después de meter el entero, siempre un nextLine para que no haya problemas

        if(respuesta == 1) {
          leer_fichero();
        } else {
            introducir_empleados();
        }
        visualizar_menu();
    }
    
    public static void visualizar_menu() {
        Integer respuesta;
        do {
            System.out.println("---MENÚ---");
            System.out.println();
            System.out.println("1- VISUALIZAR LISTADO");
            System.out.println("2- BORRAR EMPLEADO");
            System.out.println("3- VISUALIZAR EMPLEADO");
            System.out.println("4- MODIFICAR EMPLEADO");
            System.out.println("5- INSERTAR EMPLEADO");
            System.out.println("6- FINALIZAR ");
            System.out.println("INTRODUZCA LA OPCION");
            respuesta = teclado.nextInt();
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
                        System.out.println("CONDICIÓN NO VÁLIDA");
                        break;
                }
        } while (respuesta != 6);
    }
    
    public static void introducir_empleados() {
        System.out.println("Introduzca los datos del empleado");
        boolean seguir_introduciendo = true;
        while (seguir_introduciendo) {
            System.out.println("Introduzca el dni del empleado");
            String dni = teclado.nextLine();
            System.out.println("Introduzca el nombre del empleado");
            String nombre = teclado.nextLine();
            System.out.println("Introduzca la edad del empleado");
            Integer edad = teclado.nextInt();
            System.out.println("Introduzca la estatura del empleado");
            Double estatura = teclado.nextDouble();
            System.out.println("Introduzca el sueldo del empleado");
            Double sueldo = teclado.nextDouble();
            teclado.nextLine();
            Empleado e = new Empleado(nombre, dni, edad, estatura, sueldo);
            MapaEmpleado.put(dni, e);
            System.out.println("¿Desea introducir mas? (true/false)");
            seguir_introduciendo = teclado.nextBoolean();
        }
    }
    
    public static void leer_fichero() {
        try (ObjectInputStream flujo_entrada = new ObjectInputStream(new FileInputStream("datos.dat"))) {
            numeros = (int[]) flujo_entrada.readObject();
        } catch (IOException e) {
            System.out.println("¡Error al leer el fichero!");
        } catch (ClassNotFoundException e) { 
            System.out.println(e.getMessage());
        }
    }
    
    public static void  visualizar_listado() {
        for (Map.Entry entry : MapaEmpleado.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " valor: " + entry.getValue());
        }
    }
    public static void borrar_empleado() {
    System.out.println("Introduzca el dni del empleado que desea borrar");
    String dni_a_borrar = teclado.nextLine();
    if (MapaEmpleado.containsKey(dni_a_borrar)) {
        MapaEmpleado.remove(dni_a_borrar);
    } else {
        System.out.println("El dni no está en la base de datos");
    }
}
    public static void visualizar_empleado() {
    System.out.println("Introduzca el dni del empleado que desea visualizar");
    String dni = teclado.nextLine();
    if(MapaEmpleado.containsKey(dni)) {
        System.out.println(MapaEmpleado.get(dni));
    } else {
        System.out.println("El dni no está en la base de datos");
    }
}
    public static void modificar_empleado() {
    }
    public static void finalizar() {
    }
}
