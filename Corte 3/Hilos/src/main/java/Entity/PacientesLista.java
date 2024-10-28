package Entity;

import jakarta.persistence.*;
import javax.swing.*;
import jakarta.persistence.PrePersist;

public class PacientesLista {

    @PrePersist
    public void prePersist(Paciente paciente) {
        JOptionPane.showMessageDialog(null,"El Paciente a Persistir es: "+ paciente);
    }
    @PostPersist
    public void postPersist(Paciente paciente) {
        JOptionPane.showMessageDialog(null,"El Paciente a Persistir es: "+ paciente);
    }
    @PreUpdate
    public void preUpdate(Paciente paciente) {
        JOptionPane.showMessageDialog(null,"El Paciente a Actualizar es: "+ paciente);
    }
    @PostUpdate
    public void postUpdate(Paciente paciente) {
        JOptionPane.showMessageDialog(null,"El Paciente a Actualizar es: "+ paciente);
    }
    @PreRemove
    public void preRemove(Paciente paciente) {
        JOptionPane.showMessageDialog(null,"El Paciente a Eliminar es: "+ paciente);
    }

}
