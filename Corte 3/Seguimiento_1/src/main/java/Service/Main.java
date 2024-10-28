package Service;

import Entity.Medico;
import Entity.Especialidades;

public class Main {
    public static void main(String[] args) {
        Medico medico1 = new Medico("Dr. García", Especialidades.CARDIOLOGIA);
        Medico medico2 = new Medico("Dra. Pérez", Especialidades.PEDIATRIA);
        Thread hiloMedico1 = new Thread(medico1);
        Thread hiloMedico2 = new Thread(medico2);
        hiloMedico1.start();
        hiloMedico2.start();
        for (int i=0;i<=Math.random()*10;i++){
            System.out.println(i);
            try {
                hiloMedico1.join();
                hiloMedico2.join();
                medico1.setContadorPacientes(medico1.getContadorPacientes()+1);
                medico2.setContadorPacientes(medico2.getContadorPacientes()+1);

            } catch (InterruptedException e) {
                System.out.println("La ejecución de los hilos fue interrumpida.");
            }
            System.out.println(medico1);
            System.out.println(medico2);
        }

    }
}
