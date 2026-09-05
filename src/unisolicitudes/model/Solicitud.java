package unisolicitudes.model;

public class Solicitud {
    private String descripcion;
    private String nivelRequerido;

    public Solicitud(String descripcion, String nivelRequerido) {
        this.descripcion = descripcion;
        this.nivelRequerido = nivelRequerido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNivelRequerido() {
        return nivelRequerido;
    }

    public int getNivelRequeridoComoEntero() {
        return Integer.parseInt(nivelRequerido);
    }
}
