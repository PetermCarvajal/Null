package Repository;

import Entity.Paciente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.awt.*;

public class PacientesRepository {

    private final EntityManagerFactory emf;

    public PacientesRepository() {
        emf = Persistence.createEntityManagerFactory("PacientesPIU");
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

    public Paciente leer(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Paciente.class, id);
        } finally {
            em.close();
        }
    }

    public List<String Paciente> leerTodos() {
        EntityManager em = emf.createEntityManager();
        try {
            return (List<String Paciente>) em.createQuery("from Paciente", Paciente.class).getResultList();
        } finally {
            em.close();
        }
    }

    public void actualizar(Paciente paciente) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(paciente);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void eliminar(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Paciente paciente = em.find(Paciente.class, id);
            if (paciente != null) {
                em.remove(paciente);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void cerrar() {
        emf.close();
    }
}
