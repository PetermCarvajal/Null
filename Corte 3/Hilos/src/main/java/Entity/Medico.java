package Entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Table(name="Medico")
@EntityListeners(PacientesLista.class)
@Entity

public class Medico implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int Contador;

    @Column(nullable=false)
    private String Nombre;

    @Column(nullable=false)
    private String Especialidad;





}
