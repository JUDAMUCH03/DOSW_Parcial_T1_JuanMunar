package edu.dosw.parcial;

public class PedidoBuilder {
    private String idPedido;
    private String usuario;
    private Producto producto;
    private Entrega entrega;

    public PedidoBuilder conId(String idPedido) {
        this.idPedido = idPedido;
        return this;
    }

    public PedidoBuilder paraUsuario(String usuario) {
        this.usuario = usuario;
        return this;
    }

    public PedidoBuilder conProducto(Producto producto) {
        this.producto = producto;
        return this;
    }

    public PedidoBuilder conEntrega(Entrega entrega) {
        this.entrega = entrega;
        return this;
    }

    public Pedido build() {
        if (producto == null) {
            System.out.println("[ERROR] El pedido debe contener al menos un producto base.");
            return null;
        }

        double total = producto.getPrecioTotal() + (entrega != null ? entrega.getCosto() : 0.0);
        if (total < 3500.0) {
            System.out.println("[ERROR] El pedido no alcanza el monto minimo de $3.500.");
            return null;
        }

        return new Pedido(idPedido, usuario, producto, entrega);
    }
}