package unisolicitudes.handler;
import unisolicitudes.model.Nivel;
import unisolicitudes.model.Solicitud;

public class Secretaria extends Handler {
    public Secretaria() {
        super(new Nivel(Nivel.SECRETARIA));
    }

    @Override
    public void resolver(Solicitud solicitud) {
        System.out.println("Resuelto por la secretaria: "+ solicitud.getDescripcion() + "\n");
    }
}
