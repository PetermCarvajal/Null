package Entity;

import Repository.PacienteRepository;
import javax.swing.*;

public class Medico implements Runnable {
    private String nombre;
    private Especialidades especialidad;
    private int contadorPacientes;
    private static final int MAX_PACIENTES = 5;

    public void setContadorPacientes(int contadorPacientes) {
        this.contadorPacientes = contadorPacientes;
    }

    public Medico(String nombre, Especialidades especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.contadorPacientes = 0;
    }

    public int getContadorPacientes() {
        return contadorPacientes;
    }

    @Override
    public void run() {
        PacienteRepository pacientesRepo = new PacienteRepository();
        try {
            for (int i = 0; i < MAX_PACIENTES; i++) {
                atenderPaciente(pacientesRepo);
                Thread.sleep((long) (Math.random() * 1000));
            }
        } catch (InterruptedException e) {
            System.out.println("El médico " + nombre + " ha terminado su turno.");
        } finally {
            pacientesRepo.cerrar();
        }
    }

    private void atenderPaciente(PacienteRepository pacientesRepo) throws InterruptedException {
        System.out.println("El médico " + nombre + " está atendiendo a un paciente...");
        contadorPacientes++;
        int tiempoAtencion = (int) (Math.random() * 1);
        Thread.sleep(tiempoAtencion);
        System.out.println("El médico " + nombre + " ha terminado con el paciente.");

        Paciente paciente = new Paciente(nombre, tiempoAtencion);
        pacientesRepo.crear(paciente);
    }

    @Override
    public String toString() {
        return String.format("Médico: %s, Especialidad: %s, Pacientes Atendidos: %d", nombre, especialidad, getContadorPacientes());
    }
}
