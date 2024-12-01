
package CalendarioInteractivo;

public class Evento {
    private String nombre; //sadasd
    private String fecha;
    private String hora; //a
    private String descripcion;

    public Evento(String nombre, String fecha, String hora, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

