package UNIDAD8.JSON.EJ1;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {

        //creamos los futbolistas
        Futbolista f1 = new Futbolista(1, "Casillas", List.of("Portero"), "Real Madrid");
        Futbolista f2 = new Futbolista(15, "Sergio Ramos", List.of("Lateral Derecho", "Mediocentro"), "Real Madrid");
        Futbolista f3 = new Futbolista(3, "Piqué", List.of("Central"), "Barcelona");
        Futbolista f4 = new Futbolista(5, "Puyol", List.of("Central"), "Barcelona");
        Futbolista f5 = new Futbolista(11, "Capdevilla", List.of("Lateral Izquierdo"), "Villarreal");
        Futbolista f6 = new Futbolista(14, "Xabi Alonso", List.of("Mediocentro Defensivo", "Mediocentro"), "Real Madrid");
        Futbolista f7 = new Futbolista(16, "Busquets", List.of("Mediocentro Defensivo"), "Barcelona");
        Futbolista f8 = new Futbolista(8, "Xavi", List.of("Mediocentro"), "Barcelona");
        Futbolista f9 = new Futbolista(18, "Pedro", List.of("Extremo Izquierdo", "Falso Extremo"), "Barcelona");
        Futbolista f10 = new Futbolista(6, "Iniesta", List.of("Extremo Derecho", "Mediocentro"), "Barcelona");
        Futbolista f11 = new Futbolista(7, "Villa", List.of("Delantero Centro"), "Barcelona");

        //creamos un array de futbolistas
        ArrayList<Futbolista> arrayFutbolistas = new ArrayList<>();

        //añadimos los futbolistas al array
        arrayFutbolistas.add(f1);
        arrayFutbolistas.add(f2);
        arrayFutbolistas.add(f3);
        arrayFutbolistas.add(f4);
        arrayFutbolistas.add(f5);
        arrayFutbolistas.add(f6);
        arrayFutbolistas.add(f7);
        arrayFutbolistas.add(f8);
        arrayFutbolistas.add(f9);
        arrayFutbolistas.add(f10);
        arrayFutbolistas.add(f11);

        //creamos un objeto Gson
        Gson gson = new Gson();

        //imprimimos el objeto
        System.out.println(gson.toJson(arrayFutbolistas));

        //convertimos a string el objeto json que hemos creado de futbolistas
        String json_completo = gson.toJson(arrayFutbolistas);

        //convertimos a array de futbolistas el gson que hemos pasado a string, y pasamos también un objeto array de tipo Futbolista
        Futbolista[] nuevofutbolista = gson.fromJson(json_completo, Futbolista[].class);

        //Imprimimos el array de nuevoFutbolistas pasado a String
        System.out.println(Arrays.toString(nuevofutbolista));

        ArrayList<String> demarcacion_ramos = new ArrayList<>();

        for (Futbolista f : nuevofutbolista) {
            if (f.getNombre().equals("Sergio Ramos")) {
                demarcacion_ramos.addAll(f.getDemarcacion());
                System.out.println(demarcacion_ramos);
            }
        }
    }
}
