package ZZZPRACTICAS.REPASO;

public class main {
    public static void main(String[] args) {

        persona.informaciónPersona();

        personas[] Parray = new personas[5];

        empleo e0 = new empleo();
        empleo e1 = new empleo("75665325B",24,"Pepe",210,90.3,false, persona.enumColorPelo.Rubio,"cocinero",1400.30);
        empleo e2 = new empleo("84765325B",34,"Alberto",154,70.3,false, persona.enumColorPelo.Blanco,"administrativo",1760.30);
        empleo e3 = new empleo("18465325B",14,"Maria",147,80.3,true, persona.enumColorPelo.Negro,"ceo",1840.30);
        empleo e4 = new empleo("45665325B",54,"Nuria",178,60.3,false, persona.enumColorPelo.Rubio,"cfo",1730.30);

        Parray[0] = e0;
        Parray[1] = e1;
        Parray[2] = e2;
        Parray[3] = e3;
        Parray[4] = e4;

        persona.informaciónPersona();

        imprimir(Parray);

        e0.setRemuneracion(e0.getRemuneracion() + 100);

        System.out.println("Incremento de 100 euros :" + e0.toString());

        e0.annadirapellido("Pérez");

        System.out.println("Añadimos apellido: " + e0);

        e0.vocales();





    }

    public static void imprimir(personas[] Earray) {
        System.out.println("---------------------------------------------------------------------------");
        for (personas e : Earray) {
            System.out.println(e);
        }
        System.out.println("---------------------------------------------------------------------------");

    }
}
