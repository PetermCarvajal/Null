package Service;

import Entity.Cajero;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cajero> cajeros = new ArrayList<>();
        cajeros.add(new Cajero("Caja Piso 1"));
        cajeros.add(new Cajero("Caja Piso 2"));

        List<Thread> hilos = new ArrayList<>();
        for (Cajero cajero : cajeros) {
            Thread hilo = new Thread(cajero);
            hilos.add(hilo);
            hilo.start();
        }
        for (Thread hilo : hilos) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                JOptionPane.showMessageDialog(null,"La ejecución de los hilos fue interrumpida.");
            }
        }

        BigDecimal ventasTotalesSupermercado = BigDecimal.ZERO;
        for (Cajero cajero : cajeros) {
            JOptionPane.showMessageDialog(null,cajero);
            ventasTotalesSupermercado = ventasTotalesSupermercado.add(cajero.getVentasTotales());
        }
        JOptionPane.showMessageDialog(null,"Ventas Totales del Supermercado: " + ventasTotalesSupermercado + "Pesos Colombianos");
    }
}
