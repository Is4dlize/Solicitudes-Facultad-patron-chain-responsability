package unisolicitudes.handler;
import unisolicitudes.model.Nivel;
import unisolicitudes.model.Solicitud;

public abstract class Handler {
    protected Handler next;
    protected Nivel levelRequired;

    public Handler(Nivel levelRequired) {
        this.levelRequired = levelRequired;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public void atender(Solicitud solicitud) {
        System.out.println("Pasa por: " + getNombre());

        if (puedeResolver(solicitud)) {
            resolver(solicitud);
        } else if (next != null) {
            next.atender(solicitud);
        } else {
            System.out.println("Nadie pudo resolver la solicitud: "+ solicitud.getDescripcion() +" Nivel desconocido: " +solicitud.getNivelRequerido()+"\n");
        }
    }


    protected boolean puedeResolver(Solicitud solicitud) {
        return solicitud.getNivelRequeridoComoEntero() <= levelRequired.getValor();
    }

    public abstract void resolver(Solicitud solicitud);

    protected String getNombre() {
        return this.getClass().getSimpleName();
    }
}
