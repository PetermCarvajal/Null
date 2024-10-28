package Entity;

import jakarta.persistence.*;
import javax.swing.*;

public class PacientesLista {

    @PrePersist
    public void prePersist(Paciente paciente) {
        JOptionPane.showMessageDialog(null, "El Producto a Persistir es: " + paciente);
    }
    @PostPersist
    public void postPersist(Paciente paciente) {
        JOptionPane.showMessageDialog(null, "El Producto Persistido es: " + paciente);
    }

    @PreUpdate
    public void preUpdate(Paciente paciente) {
        JOptionPane.showMessageDialog(null, "El Producto a Modificar es: " + paciente);
    }
    @PostUpdate
    public void postUpdate(Paciente paciente) {
        JOptionPane.showMessageDialog(null, "El Producto Que Fue Modificado es: " + paciente);
    }

    @PreRemove
    public void preRemove(Paciente paciente) {
        JOptionPane.showMessageDialog(null, "El Producto a eliminar es: " + paciente);
    }
    @PostRemove
    public void postRemove(Paciente paciente) {
        JOptionPane.showMessageDialog(null, "El Producto Que Fue eliminar es: " + paciente);
    }

}
