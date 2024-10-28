package Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ProductosService productosService = new ProductosServiceImpl();

        int numeroCajas = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numeroCajas);

        for (int i = 0; i < numeroCajas; i++) {
            executorService.execute(new Caja(i + 1, productosService));
        }

        executorService.shutdown();
    }
}
