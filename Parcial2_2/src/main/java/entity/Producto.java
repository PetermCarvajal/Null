package entity;

import jakarta.persistence.*;
import java.io.*;
import java.math.BigDecimal;

@Entity
@Table(name = "parcial")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-incremental
    private long id;

    @Column(name = "marca", nullable = false)
    private String marca;

    @Column(name = "precio", nullable = false)
    private BigDecimal precio;

    @Column(name = "procesador", nullable = false)
    private String procesador;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Producto: \nId: " + id + "\nMarca: " + marca + "\nProcesador: " + procesador + "\nPrecio: " + precio;
    }
}
