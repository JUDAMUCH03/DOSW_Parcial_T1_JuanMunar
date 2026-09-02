package edu.dosw.parcial;

public class Pedido {
    private String idPedido;
    private String usuario;
    private Producto producto;
    private Entrega entrega;
    private String estado;

    public Pedido(String idPedido, String usuario, Producto producto, Entrega entrega) {
        this.idPedido = idPedido;
        this.usuario = usuario;
        this.producto = producto;
        this.entrega = entrega;
        this.estado = "CONFIRMADO";
    }

    private String formato(double valor) {
        return String.format("$%,d", (long) valor).replace(',', '.');
    }

    public double calcularTotal() {
        double costoEntrega = (entrega != null) ? entrega.getCosto() : 0.0;
        return producto.getPrecioTotal() + costoEntrega;
    }

    public void imprimirResumen() {
        System.out.println(idPedido);
        System.out.println("Usuario: " + usuario);
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Extras: " + (producto.getExtras().isEmpty() ? "Ninguno" : String.join(", ", producto.getExtras())));
        System.out.println("Entrega: " + (entrega != null ? entrega.getTipo() : "CONSUMO_LOCAL"));

        System.out.println("\nDescripcion del Pedido:");
        System.out.println("Producto #1:");
        System.out.println(producto.getNombre());
        for (String extra : producto.getExtras()) {
            System.out.println("+" + extra);
        }

        if (entrega != null && entrega.getTipo() == TipoEntrega.PARA_LLEVAR) {
            System.out.println("Empaque para llevar");
        }

        System.out.println("Desglose:");
        System.out.println("  " + formato(producto.getPrecioBase()) + "  (base)");
        for (int i = 0; i < producto.getExtras().size(); i++) {
            System.out.println("  +" + formato(producto.getCostosExtras().get(i)) + " (" + producto.getExtras().get(i).toLowerCase() + ")");
        }
        if (entrega != null && entrega.getCosto() > 0) {
            System.out.println("  +" + formato(entrega.getCosto()) + "   (empaque)");
        }

        System.out.println("TOTAL: " + formato(calcularTotal()));
        System.out.println("Estado: " + estado);
    }
}