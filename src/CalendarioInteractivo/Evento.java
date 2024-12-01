
package CalendarioInteractivo;

public class Evento {
    private String nombre;
    private String fecha;
    private String hora;
    private String descripcion;

    public Evento(String nombre, String fecha, String hora, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nFecha: " + fecha + "\nHora: " + hora + "\nDescripción: " + descripcion + "\n";
    }

    // Getters y setters (opcional)
}

