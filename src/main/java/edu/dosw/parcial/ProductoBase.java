package edu.dosw.parcial;

import java.util.ArrayList;
import java.util.List;

public class ProductoBase implements Producto {
    private String codigo;
    private String nombre;
    private double precioBase;

    public ProductoBase(String codigo, String nombre, double precioBase) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecioBase() {
        return precioBase;
    }

    @Override
    public double getPrecioTotal() {
        return precioBase;
    }

    @Override
    public List<String> getExtras() {
        return new ArrayList<>();
    }

    @Override
    public List<Double> getCostosExtras() {
        return new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }
}