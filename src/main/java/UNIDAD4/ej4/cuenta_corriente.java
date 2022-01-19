package UNIDAD4.ej4;

// si no ponemos public class, esta clase solo será visible entre las vecinas (misma carpeta)
class cuenta_corriente {

    String nombrebanco = "Cajasur";
    private long saldo;
    private long limite; //visible solo para este fichero
    public String nombre; //visible para cualquier clase
    String DNI; //solo es visible para clases vecinas

    public cuenta_corriente(String nom_cli, String dni, String banco) {
        this.nombre = nom_cli;
        this.DNI = dni;
        this.saldo = 0;
        this.limite = -50;
        this.nombrebanco = banco;
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

    public String getNombrebanco() { return nombrebanco;}

    public void informacion(){
        System.out.println("El nombre del banco al que pertenece es: " + nombrebanco);
        System.out.println("El saldo es: " + getSaldo());
        System.out.println("El limite es: " + getLimite());
        System.out.println("El nombre es: " + getNombre());
        System.out.println("El DNI es: " + getDNI());
    }

}
