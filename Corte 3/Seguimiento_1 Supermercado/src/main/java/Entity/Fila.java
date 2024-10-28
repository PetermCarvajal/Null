package Entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@EntityListeners(ProductosLista.class)
@Table(name="Compra")
public class Fila implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nombreCajero;

    @Column(nullable = false)
    private BigDecimal totalCompra;

    public Fila() {}

    public Fila(String nombreCajero, BigDecimal totalCompra) {
        this.nombreCajero = nombreCajero;
        this.totalCompra = totalCompra;
    }

    public String getNombreCajero() {
        return nombreCajero;
    }

    public BigDecimal getTotalCompra() {
        return totalCompra;
    }

    @Override
    public String toString() {
        return String.format("""
                Cajero: %s, Total Compra: %.2f USD"""
                , nombreCajero, totalCompra);
    }
}
