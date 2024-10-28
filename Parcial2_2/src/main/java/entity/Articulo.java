package entity;

import java.math.BigDecimal;

public enum Articulo {
    PAN(BigDecimal.valueOf(1.00)),
    LECHE(BigDecimal.valueOf(1.50)),
    HUEVOS(BigDecimal.valueOf(2.20)),
    ARROZ(BigDecimal.valueOf(3.00)),
    POLLO(BigDecimal.valueOf(5.00));

    private final BigDecimal precio;

    Articulo(BigDecimal precio) {
        this.precio = precio;
    }

    public BigDecimal getPrecio() {
        return precio;
    }
}
