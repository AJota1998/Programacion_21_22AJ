package T1.TEMA3.UNIDAD5.ej7Yej8;

public class main {
    public static void main(String[] args) {

        //creamos el objeto etiqueta que vamos a introducir en el objeto caja
        etiqueta eti1 = new etiqueta("Juan", "Palomo, 65");
        etiqueta eti2 = new etiqueta("Carmen", "Jilguero, 76");

        //creamos los objetos
        caja caja1 = new caja(15,25, 15, caja.UnidadesU.cm, eti1);
        caja caja2 = new caja(1, 1.5, 50, caja.UnidadesU.m, eti2);

        //Imprimimos los métodos
        System.out.println("El volumen es: " + caja1.getvolumen());
        System.out.println(caja1.toString());
    }
}
