package ZZZPRACTICAS.ENTREGABLE1;

public class ManoDeObra {

    private String nombreEmpresa;
    private String workdesc;
    private int cantidadhoras;
    private int cantidadobreros;

    public ManoDeObra(String nombreEmpresa, String workdesc, int cantidadhoras, int cantidadobreros){
        this.nombreEmpresa=nombreEmpresa;
        this.workdesc=workdesc;
        this.cantidadhoras=cantidadhoras;
        this.cantidadobreros=cantidadobreros;
    }



    //METODOS

    public void mostrar_informacion(){
        System.out.println("La empresa se llama: "+this.nombreEmpresa);
        System.out.println("Se ocupa de: "+this.workdesc);
        System.out.println("La cantidad de horas supone "+this.cantidadhoras+" horas.");
        System.out.println("El equipo consta de "+this.cantidadobreros+" obreros.");
    }

    //SETTERS Y GETTERS

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getWorkdesc() {
        return workdesc;
    }

    public void setWorkdesc(String workdesc) {
        this.workdesc = workdesc;
    }

    public int getCantidadhoras() {
        return cantidadhoras;
    }

    public void setCantidadhoras(int cantidadhoras) {
        this.cantidadhoras = cantidadhoras;
    }

    public int getCantidadobreros() {
        return cantidadobreros;
    }

    public void setCantidadobreros(int cantidadobreros) {
        this.cantidadobreros = cantidadobreros;
    }
}
