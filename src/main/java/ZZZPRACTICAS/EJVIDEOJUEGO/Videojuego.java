package ZZZPRACTICAS.EJVIDEOJUEGO;

import java.util.Calendar;

public class Videojuego {


    private Calendar fecha=Calendar.getInstance();
    private final String hora = Integer.toString(fecha.get(Calendar.HOUR));
    private final String min = Integer.toString(fecha.get(Calendar.MINUTE));
    private String fechasita= "Inicio a las "+hora+":"+min;
    private Personaje Bicho;
    private Escenario esc1 =new Escenario(100,100,500,2);
    public Videojuego(){}
}
