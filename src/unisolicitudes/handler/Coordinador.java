package unisolicitudes.handler;
import unisolicitudes.model.Nivel;
import unisolicitudes.model.Solicitud;

public class Coordinador extends Handler {
    public Coordinador() {
        super(new Nivel(Nivel.COORDINADOR));
    }

    @Override
    public void resolver(Solicitud solicitud) {
        System.out.println("Resuelto por el coordinador: "+ solicitud.getDescripcion() + "\n");
    }
}
