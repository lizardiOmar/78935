package uv.mx.t4is.TareasBD;

public class Tarea {
    
    private int id;
    private String nombre;
    private String contenido;
    private int estado;//Estados: 1=pendiente 0=terminada

    public Tarea(String nombre, String contenido) {
        this.id=0;//La base de datos tiene el atributo autoincrement en el ID
        this.nombre = nombre;
        this.contenido = contenido;
        this.estado=1;
    }

    public Tarea() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tarea [contenido=" + contenido + ", estado=" + estado + ", id=" + id + ", nombre=" + nombre + "]";
    }
}
