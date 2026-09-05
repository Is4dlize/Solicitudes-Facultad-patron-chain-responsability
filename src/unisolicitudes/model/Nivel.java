package unisolicitudes.model;


public class Nivel {
    public static final int MONITOR     = 1;
    public static final int PROFESOR    = 2;
    public static final int COORDINADOR = 3;
    public static final int SECRETARIA  = 4;
    public static final int DECANATURA  = 5;

    private int valor;

    public Nivel(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
