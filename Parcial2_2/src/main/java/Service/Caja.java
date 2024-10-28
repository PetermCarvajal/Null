package Service;

import entity.Cliente;
import java.util.concurrent.atomic.AtomicInteger;

public class Caja implements Runnable {

    private final int numeroCaja;
    private final AtomicInteger totalClientes;
    private final ProductosService productosService;

    public Caja(int numeroCaja, ProductosService productosService) {
        this.numeroCaja = numeroCaja;
        this.totalClientes = new AtomicInteger(0);
        this.productosService = productosService;
    }

    @Override
    public void run() {
        while (true) {
            Cliente cliente = generarClienteAleatorio();
            productosService.registrarVenta(cliente);
            totalClientes.incrementAndGet();
            System.out.println("Caja " + numeroCaja + " ha atendido a " + totalClientes + " clientes.");
            try {
                Thread.sleep(2000);  // Simula el tiempo de procesamiento
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private Cliente generarClienteAleatorio() {
        // Generar Cliente y Cesta aleatoria
    return new Cliente();}
}
