package UNIDAD7.TAREA3B;
/*
1- Crea un HashMap cuya clave sea un Integer, y cuyos valores sean los nombres de algunos de tus compañeros.
La clave ha de calcularse mediante un método que reciba un String que represente el dni,
y devuelva la suma de sus dígitos.
46221877D -> 4+6+2+2+1+8+7+7=37
Una vez guardados los elementos, deben mostrarse todos los elementos (clave-valor) del HasMap.

2- Añada al programa anterior la siguiente funcionalidad.
El programa pedirá al usuario un dni, calculará la clave que ha de consultar,
comprobará que dicha clave existe, y, en tal caso, mostrará el valor asociado a esa clave en el HashMap.

3- Recorre el Map anterior, extrayendo cada pareja clave-valor,
y mostrándolas, de tal forma que se escriban los datos así:
La clave 37 está asociada al nombre "Pedro Gonzalez Jimenez".
La clave ... está asociada al nombre ....
*/
import java.util.*;

public class ej1_ej2_ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(suma_dni("17845678"), "Adrian");
        mapa.put(suma_dni("98765332"), "Ivan");
        mapa.put(suma_dni("26491120"), "Alfonso");
        mapa.put(suma_dni("23458754"), "Juan Pablo");
        mapa.put(suma_dni("88893411"), "Joserra");

        //imprimimos el valor que tiene asociado la clave
        System.out.println(mapa.get(suma_dni("98765332")));


        //manera de imprimir el valor que tiene la propia clave
        Set<Integer> claves = mapa.keySet();
        Iterator<Integer> it = claves.iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            System.out.println(key);
        }

        System.out.println("Introduzca un dni");
        String dni_usuario = teclado.next();
        int consultar = suma_dni(dni_usuario);

        // Para saber si una clave está almacenada en un mapa
        boolean tiene_clave = mapa.containsKey(suma_dni(dni_usuario));
        System.out.println("La clave " + consultar + ", ¿está en el mapa?, " + tiene_clave);

        if(tiene_clave) {
            System.out.println(mapa.get(suma_dni(dni_usuario)));
        }

        //Mostrar todos las clave-valor de un mapa
        System.out.println("\nrecorrer mediante entry");
        for (Map.Entry entry : mapa.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " valor: " + entry.getValue());
        }

    }
    public static int suma_dni(String dni) {
        int suma = 0;
        for (int i = 0; i < dni.length(); i++) {
            suma += Integer.parseInt(String.valueOf(dni.charAt(i)));
        }
        return suma;
    }
}
