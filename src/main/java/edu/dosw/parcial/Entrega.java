package edu.dosw.parcial;

public class Entrega {
    private TipoEntrega tipo;
    private String bloque;
    private String salon;

    public Entrega(TipoEntrega tipo) {
        this.tipo = tipo;
    }

    public Entrega(TipoEntrega tipo, String bloque, String salon) {
        this.tipo = tipo;
        this.bloque = bloque;
        this.salon = salon;
    }

    public double getCosto() {
        if (tipo == TipoEntrega.PARA_LLEVAR) {
            return 300.0;
        }
        if (tipo == TipoEntrega.ENTREGA_SALON) {
            return 1000.0;
        }
        return 0.0;
    }

    public TipoEntrega getTipo() {
        return tipo;
    }

    public String getBloque() {
        return bloque;
    }

    public String getSalon() {
        return salon;
    }
}