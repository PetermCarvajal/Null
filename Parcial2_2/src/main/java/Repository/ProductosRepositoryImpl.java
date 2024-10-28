package Repository;

import entity.Producto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

public class ProductosRepositoryImpl implements ProductosRepository {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Productos");

    @Override
    public void crear(Producto producto) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(producto);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Producto leer(Long id) {
        EntityManager em = emf.createEntityManager();
        Producto producto = em.find(Producto.class, id);
        em.close();
        return producto;
    }

    @Override
    public List<Producto> leerTodos() {
        EntityManager em = emf.createEntityManager();
        List<Producto> productos = em.createQuery("SELECT p FROM Producto p", Producto.class).getResultList();
        em.close();
        return productos;
    }

    @Override
    public void Actualizar(Producto producto) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(producto);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void eliminar(Long id) {
        EntityManager em = emf.createEntityManager();
        Producto producto = em.find(Producto.class, id);
        if (producto != null) {
            em.getTransaction().begin();
            em.remove(producto);
            em.getTransaction().commit();
        }
        em.close();
    }
}
