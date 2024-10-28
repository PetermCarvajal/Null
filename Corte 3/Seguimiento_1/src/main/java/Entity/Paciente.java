package Entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@EntityListeners(PacientesLista.class)
@Table(name="Hospital")
public class Paciente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private int tiempoAtencion; // en milisegundos

    public Paciente() {}

    public Paciente(String nombre, int tiempoAtencion) {
        this.nombre = nombre;
        this.tiempoAtencion = tiempoAtencion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiempoAtencion() {
        return tiempoAtencion;
    }

    @Override
    public String toString() {
        return String.format("Paciente: %s, Tiempo de atención: %d ms", nombre, tiempoAtencion);
    }
}
