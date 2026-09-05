package unisolicitudes.handler;
import unisolicitudes.model.Nivel;
import unisolicitudes.model.Solicitud;

public class Monitor extends Handler {
    public Monitor() {
        super(new Nivel(Nivel.MONITOR));
    }

    @Override
    public void resolver(Solicitud solicitud) {
        System.out.println("Resuelto por el monitor: "+ solicitud.getDescripcion() + "\n");
    }
}
