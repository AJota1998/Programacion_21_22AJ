package T1.TEMA3.UNIDAD4.ej9;

import T1.TEMA3.UNIDAD4.ej9.maquinaria.locomotoras;
import T1.TEMA3.UNIDAD4.ej9.personal.jefes;
import T1.TEMA3.UNIDAD4.ej9.personal.maquinistas;
import T1.TEMA3.UNIDAD4.ej9.personal.mecanicos;

public class main {
    public static void main(String[] args) {

        //creamos el objeto maquinista
        maquinistas c1maq = new maquinistas("Alberto Flores Santana", "87654987A" , 1500, 1);

        //creamos el objeto mecanicos
        mecanicos c1mecanic = new mecanicos("Antonio Ruiz Galarreta", 634566789, "frenos");

        //creamos el objeto jefes
        jefes c1jef = new jefes("Ignacio Sánchez Montemayor", "45632498H");

        //crear el objeto locomotora
        locomotoras c1locom = new locomotoras("2345JDF", 545, 1989, c1mecanic);

        //creamos el objeto trenes








    }
}
