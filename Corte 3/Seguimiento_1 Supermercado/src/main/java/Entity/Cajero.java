package Entity;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.Random;

public class Cajero implements Runnable {
    private String nombre;
    private int clientesAtendidos;
    private BigDecimal ventasTotales;
    private static final int MAX_CLIENTES = 10;

    public Cajero(String nombre) {
        this.nombre = nombre;
        this.clientesAtendidos = 0;
        this.ventasTotales = BigDecimal.ZERO;
    }

    public int getClientesAtendidos() {
        return clientesAtendidos;
    }

    public BigDecimal getVentasTotales() {
        return ventasTotales;
    }

    @Override
    public void run() {
        for (int i = 0; i < MAX_CLIENTES; i++) {
            atenderCliente();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("El cajero " + nombre + " fue interrumpido.");
            }
        }
    }

    private void atenderCliente() {
        Random random = new Random();
        Productos producto = Productos.values()[random.nextInt(Productos.values().length)];
        clientesAtendidos++;
        ventasTotales = ventasTotales.add(producto.getPrecio());
        JOptionPane.showMessageDialog(null,String.format("""
        Cajero: %s atendio a un cliente que compro %s por %.2f Pesos colombianos
        """,nombre,producto,producto.getPrecio()));
    }

    @Override
    public String toString() {
        return String.format("Cajero: %s, Clientes Atendidos: %d, Ventas Totales: %s Pesos Colombianos", nombre, clientesAtendidos, ventasTotales);
    }
}
