package T1.TEMA3.YOUTUBE.HERENCIA.Sobreescritura;

public class Persona extends Animal {


    @Override
    public void comer () {
        System.out.println("Estoy comiendo sentado y con cubiertos");
    }
}
