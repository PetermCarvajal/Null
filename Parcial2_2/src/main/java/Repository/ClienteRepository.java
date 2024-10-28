package Repository;

import entity.Cliente;

public interface ClienteRepository {
    void crear(Cliente cliente);
    Cliente obtener(Long id);
}
