package Entity;

import jakarta.persistence.*;
import javax.swing.*;

public class ProductosLista {

    @PrePersist
    public void prePersist(Fila fila) {
        JOptionPane.showMessageDialog(null, "El Producto a Persistir es: " + fila);
    }
    @PostPersist
    public void postPersist(Fila fila) {
        JOptionPane.showMessageDialog(null, "El Producto Persistido es: " + fila);
    }

    @PreUpdate
    public void preUpdate(Fila fila) {
        JOptionPane.showMessageDialog(null, "El Producto a Modificar es: " + fila);
    }
    @PostUpdate
    public void postUpdate(Fila fila) {
        JOptionPane.showMessageDialog(null, "El Producto Que Fue Modificado es: " + fila);
    }

    @PreRemove
    public void preRemove(Fila fila) {
        JOptionPane.showMessageDialog(null, "El Producto a eliminar es: " + fila);
    }
    @PostRemove
    public void postRemove(Fila fila) {
        JOptionPane.showMessageDialog(null, "El Producto Que Fue eliminar es: " + fila);
    }

}
