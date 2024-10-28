package Repository;

import Entity.Paciente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class PacienteRepository {
    private final EntityManagerFactory emf;

    public PacienteRepository() {
        emf = Persistence.createEntityManagerFactory("HospitalPU");
    }

    public void crear(Paciente paciente) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(paciente);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void cerrar() {
        emf.close();
    }
}
