package edu.dosw.parcial;
import java.util.ArrayList;
import java.util.List;

public class ExtraDecorator extends ProductoDecorator {

    public ExtraDecorator(Producto productoDecorado, String nombreExtra, double costoExtra) {
        super(productoDecorado, nombreExtra, costoExtra);
    }

    @Override
    public double getPrecioTotal() {
        return productoDecorado.getPrecioTotal() + costoExtra;
    }

    @Override
    public List<String> getExtras() {
        List<String> lista = new ArrayList<>(productoDecorado.getExtras());
        lista.add(nombreExtra);
        return lista;
    }

    @Override
    public List<Double> getCostosExtras() {
        List<Double> lista = new ArrayList<>(productoDecorado.getCostosExtras());
        lista.add(costoExtra);
        return lista;
    }
}