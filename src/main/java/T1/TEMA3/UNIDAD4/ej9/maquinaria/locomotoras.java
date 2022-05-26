package T1.TEMA3.UNIDAD4.ej9.maquinaria;

import T1.TEMA3.UNIDAD4.ej9.personal.mecanicos;

public class locomotoras {

    String matricula;
    int potencia;
    int fabricacion;
    mecanicos encargado;


    //constructor de locomotora incluye un objeto de tipo maquinista al cual referenciamos
    public locomotoras(String matric, int pot, int fabric, mecanicos meq) {
        this.matricula = matric;
        this.potencia = pot;
        this.fabricacion = fabric;
        this.encargado = meq;
    }



}
