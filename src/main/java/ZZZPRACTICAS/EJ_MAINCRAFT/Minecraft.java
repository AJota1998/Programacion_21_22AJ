package ZZZPRACTICAS.EJ_MAINCRAFT;

public class Minecraft {

    private Material[] Materiales=new Material[10];
    private int indice=0;
    int contador=0;
    Material ultimomate;

    //METODOS
    private boolean NuevoMate (Material mate){
        for (int i = 0; i < Materiales.length; i++) {
            if (Materiales[i]==null){
                Materiales[i]=mate;
                return true;
            }
        }

        if (indice<Materiales.length){
            Materiales[indice]=mate;
            indice++;
            return true;
        } else {
            System.out.println("No se pueden añadir más materiales.");
            return false;
        }
    }

    public void borrarMaterialSinMasa(){
        for (int i = 0; i < Materiales.length; i++) {
            if (Materiales[i].getMasa()<=0){
                Materiales[i]=null;
            }
        }
    }

    public void ultimoMaterialQueQueda(){
        for (int i = 0; i < Materiales.length; i++) {
            if (Materiales[i].getMasa()<=0){
                contador++;
                ultimomate=Materiales[i];
            }

            if (contador==1){
                System.out.println("EL último material sin masa es:");
                System.out.println();
                System.out.println(ultimomate.toString());
            } else if (contador==0){
                System.out.println("No hay materiales sin masa.");
            } else if (contador>1){
                System.out.println("Hay más de un material sin masa.");
            }
        }
    }


    public void mostrarEstado(){
        System.out.println("La información de los materiales es la siguiente:");
        System.out.println();
        for (int i = 0; i < indice; i++) {
            System.out.println("ExamenMine.Material "+(i+1));
            System.out.println(Materiales[i].toString());
        }
    }


}
