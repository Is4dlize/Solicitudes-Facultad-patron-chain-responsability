package unisolicitudes.main;
import unisolicitudes.handler.*;
import unisolicitudes.model.*;

public class Main {
    public static void main(String[] args) {
        //handlers
        Handler monitor = new Monitor();
        Handler profesor = new Profesor();
        Handler coordinador = new Coordinador();
        Handler secretaria = new Secretaria();
        Handler decanatura = new Decanatura();

        //la cadena de mando
        monitor.setNext(profesor);
        profesor.setNext(coordinador);
        coordinador.setNext(secretaria);
        secretaria.setNext(decanatura);

        //solicitudes
        Solicitud[] solicitudes = new Solicitud[] {
            new Solicitud("Pregunta sobre el contenido visto en la clase anterior", String.valueOf(Nivel.MONITOR)),
            new Solicitud("Revisión de la nota de un parcial",String.valueOf(Nivel.PROFESOR)),
            new Solicitud("Cambio de horario de una asignatura",String.valueOf(Nivel.COORDINADOR)),
            new Solicitud("Expedición de certificado de notas",String.valueOf(Nivel.SECRETARIA)),
            new Solicitud("Certificado de intensidad horaria",String.valueOf(Nivel.DECANATURA)),
            new Solicitud("Cancelación de semestre por fuerza mayor","6"),
            new Solicitud("Solicitud de cambio de carrera","7"),
            new Solicitud("Solicitud revisión nota definitiva de la asignatura",String.valueOf(Nivel.PROFESOR))
        };

        for (Solicitud solicitud : solicitudes) {
            System.out.println("Nueva solicitud: " + solicitud.getDescripcion()+" | nivel: " + solicitud.getNivelRequerido() );
            monitor.atender(solicitud);
        }
    }
}
