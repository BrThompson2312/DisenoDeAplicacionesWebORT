package ort.da.ejemplocliente.modelo;
import java.util.Date;

public class Cliente {
    
    private long cedula;
    private String nombre;
    private Date fechaCreacion;

    public Cliente(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public Cliente() {
    }

    public String getNombre() {
        return "";
    }

    public long getCedula() {
        return 0;
    }
    
    public Date getFechaCreacion() {
        return new Date();
    }

    public void setNombre(String nombre) {

    }

    public void setCedula(long cedula) {

    }
}