package unisolicitudes.handler;
import unisolicitudes.model.Nivel;
import unisolicitudes.model.Solicitud;

public class Decanatura extends Handler {
    public Decanatura() {
        super(new Nivel(Nivel.DECANATURA));
    }

    @Override
    public void resolver(Solicitud solicitud) {
        System.out.println("Resuelto por el decano: "+ solicitud.getDescripcion() + "\n");
    }
}
