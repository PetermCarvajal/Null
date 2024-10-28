package Service;

import Repository.ClienteRepository;
import Repository.ClienteRepositoryImpl;
import entity.Cliente;
import entity.Producto;
import Repository.ProductosRepository;
import Repository.ProductosRepositoryImpl;
import java.util.List;

public class ProductosServiceImpl implements ProductosService {

    private final ProductosRepository repository = new ProductosRepositoryImpl();
    private final ClienteRepository clienteRepository = new ClienteRepositoryImpl();
    @Override
    public void agregarProducto(Producto producto) {
        repository.crear(producto);
    }

    @Override
    public Producto obtenerProducto(Long id) {
        return repository.leer(id);
    }

    @Override
    public List<Producto> obtenerTodosLosProductos() {
        return repository.leerTodos();
    }

    @Override
    public void modificarProducto(Producto producto) {
        repository.Actualizar(producto);
    }

    @Override
    public void borrarProducto(Long id) {
        repository.eliminar(id);
    }

    @Override
    public void registrarVenta(Cliente cliente) {
        clienteRepository.crear(cliente);
    }
}
