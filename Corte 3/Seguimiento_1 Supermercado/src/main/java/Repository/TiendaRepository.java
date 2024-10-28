package Repository;

import Entity.Fila;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TiendaRepository {
    private final EntityManagerFactory emf;

    public TiendaRepository() {
        emf = Persistence.createEntityManagerFactory("HospitalPU");
    }

    public void crear(Fila fila) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(fila);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void cerrar() {
        emf.close();
    }
}
