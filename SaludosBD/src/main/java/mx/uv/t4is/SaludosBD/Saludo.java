package mx.uv.t4is.SaludosBD;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Saludo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String nombre;
    private int id;

    public Saludo(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public Saludo(){
    }

    public Saludo(int id, String nombre){
        this.id=id;
        this.nombre=nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'"+
            ", nombre='" + getNombre() + "'"+
            "}";
    }
    
}
