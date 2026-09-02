package edu.dosw.parcial;
import java.util.List;

public interface Producto {
    String getNombre();
    double getPrecioBase();
    double getPrecioTotal();
    List<String> getExtras();
    List<Double> getCostosExtras();
}