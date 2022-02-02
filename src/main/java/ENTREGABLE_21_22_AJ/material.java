package ENTREGABLE_21_22_AJ;

import jdk.swing.interop.SwingInterOpUtils;

public class material {

    //Atributos de la clase material
    private String descripcion;
    private String proveedor;
    private int unidades;
    private int precio;
    private double iva;


    //constructor
    public material(String descripcion, String proveedor, int unidades, int precio, int iva) {
        this.descripcion = descripcion;
        this.proveedor = proveedor;
        this.unidades = unidades;
        this.precio = precio;
        this.iva = iva;
    }
    //constructor sin proveedor
    public material(String descripcion, int unidades, int precio, int iva) {
        this.descripcion = descripcion;
        this.unidades = unidades;
        this.precio = precio;
        this.iva = iva;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //obtener el iva
    public double getIva() {
        return iva;
    }
    //cambiar el iva
    public void setIva(int iva) {
        this.iva = iva;
    }

    public void mostrar_informacion() {
        System.out.println("\nEl material es: " + getDescripcion());
        System.out.println("El proveedor es: " + getProveedor());
        System.out.println("Las unidades son: " + getUnidades());
        System.out.println("El precio es: " + getPrecio());
        System.out.println("El IVA es: " + getIva());
    }

}
