package Entity;

import java.io.Serializable;

public class Paciente implements Serializable {
    private String Tiempo;

    public String getTiempo() {
        return Tiempo;
    }

    public void setTiempo(String tiempo) {
        Tiempo = tiempo;
    }

    public Paciente(){}

    public Paciente(String tiempo){
        Tiempo=tiempo;
    }

    @Override
    public String toString() {
        return """
                Paciente-> Tiempo: %s
                """.formatted(Tiempo);
    }
}
