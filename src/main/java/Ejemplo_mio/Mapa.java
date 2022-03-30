package Ejemplo_mio;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Mapa {

    private static Integer numero_mapa = 1;
    Map<Integer, Set<Dispositivo>> mapa = new HashMap<>();

    public Mapa() {}

    public void addmapa (Integer nm, Dispositivo disptvo) {
        if (mapa.containsKey(nm)) {
            mapa.get(nm).add(disptvo);
        } else {
            Set<Dispositivo> disp = new LinkedHashSet<>();
            disp.add(disptvo);
            mapa.put(nm, disp);
        }
    }

    public void deletemapa (Integer nm, Dispositivo disptvo) {
        if (mapa.containsKey(nm)) {
            mapa.get(nm).remove(disptvo);
        }
    }
}
