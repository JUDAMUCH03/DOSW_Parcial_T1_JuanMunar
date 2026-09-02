package edu.dosw.parcial;
import java.util.List;

public abstract class ProductoDecorator implements Producto {
    protected Producto productoDecorado;
    protected String nombreExtra;
    protected double costoExtra;

    public ProductoDecorator(Producto productoDecorado, String nombreExtra, double costoExtra) {
        this.productoDecorado = productoDecorado;
        this.nombreExtra = nombreExtra;
        this.costoExtra = costoExtra;
    }

    @Override
    public String getNombre() {
        return productoDecorado.getNombre();
    }

    @Override
    public double getPrecioBase() {
        return productoDecorado.getPrecioBase();
    }

    @Override
    public List<String> getExtras() {
        List<String> lista = productoDecorado.getExtras();
        lista.add(nombreExtra);
        return lista;
    }
}