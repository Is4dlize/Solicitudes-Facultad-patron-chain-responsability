package unisolicitudes.handler;
import unisolicitudes.model.Nivel;
import unisolicitudes.model.Solicitud;

public class Profesor extends Handler {
    public Profesor() {
        super(new Nivel(Nivel.PROFESOR));
    }

    @Override
    public void resolver(Solicitud solicitud) {
        System.out.println("Resuelto por el profesor: "+ solicitud.getDescripcion() + "\n");
    }
}
