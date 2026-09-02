package edu.dosw.parcial;

public class OpcionExtra {
    private String codigo;
    private String nombre;
    private double precio;

    public OpcionExtra(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
