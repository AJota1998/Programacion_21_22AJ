package UNIDAD4.ej2;

public class cuenta_corriente {

    private long saldo;
    private long limite;
    private String nombre;
    private String DNI;

    public cuenta_corriente(String nom_cli, String dni) {
        this.nombre = nom_cli;
        this.DNI = dni;
        this.saldo = 0;
        this.limite = -50;
    }

    public cuenta_corriente(int saldobanco) {
    this.saldo = saldobanco;
    this.limite = 0;
    }

    public cuenta_corriente(int saldobanco, int limite, String DNI) {
        this.saldo = saldobanco;
        this.limite = limite;
        this.DNI = DNI;
    }

    public boolean sacar_dinero(int cantidad) {
        boolean puede_sacar = true;
        this.saldo += cantidad;
        if (saldo > 50) {
            System.out.println("No puedes sacar dinero");
            puede_sacar = false;
        } else {
            System.out.println("Puedes sacar dinero");
        }
        this.saldo = 0;
        return  puede_sacar;
    }

    public void ingresar_dinero(int ingresar) {
        this.saldo += ingresar;
    }

    public long getSaldo() {
        return saldo;
    }

    public long getLimite() {
        return limite;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void informacion(){
        System.out.println("El saldo es: " + getSaldo());
        System.out.println("El limite es: " + getLimite());
        System.out.println("El nombre es: " + getNombre());
        System.out.println("El DNI es: " + getDNI());
    }

}
