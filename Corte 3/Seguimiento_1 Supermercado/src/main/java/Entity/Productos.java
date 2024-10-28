package Entity;

import java.math.BigDecimal;

public enum Productos {
    PAN(BigDecimal.valueOf(1.000)),
    LECHE(BigDecimal.valueOf(1.500)),
    HUEVOS(BigDecimal.valueOf(2.200)),
    ARROZ(BigDecimal.valueOf(3.000)),
    POLLO(BigDecimal.valueOf(50.000));

    private final BigDecimal precio;

    Productos(BigDecimal precio) {
        this.precio = precio;
    }

    public BigDecimal getPrecio() {
        return precio;

    }
}
