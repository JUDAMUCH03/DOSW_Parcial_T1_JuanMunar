package edu.dosw.parcial;

public class App {

    public static void main(String[] args) {
        System.out.println("UNIVERSITY FOOD HUB");

        // ESCENARIO 1 - Pedido Simple 
        Producto bandeja = new ProductoBase("PROD-001", "Bandeja universitaria", 8500.0);
        bandeja = new ExtraDecorator(bandeja, "Proteína extra", 2000.0);
        bandeja = new ExtraDecorator(bandeja, "Aguacate", 1500.0);

        Pedido pedido1 = new PedidoBuilder()
                .conId("PEDIDO #001")
                .paraUsuario("juan.perez@eci.edu.co")
                .conProducto(bandeja)
                .conEntrega(new Entrega(TipoEntrega.PARA_LLEVAR))
                .build();

        if (pedido1 != null) {
            pedido1.imprimirResumen();
        }

        // ESCENARIO 2 - Multiples Productos - No alcance
        System.out.println("Escenario 2: Pendiente soporte de multiples items");
        // ESCENARIO 3 - Entrega en Salon - No alcance
        System.out.println("Escenario 3: Pendiente validacion de entrega en bloque/salon.");
    }
}