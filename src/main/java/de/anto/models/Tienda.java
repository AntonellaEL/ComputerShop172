package de.anto.models;

public class Tienda {
    private String nombre;
    private String propietario;
    private String identificadorTributario;

    public Tienda(String nombre, String propietario, String identificadorTributario) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.identificadorTributario = identificadorTributario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getIdentificadorTributario() {
        return identificadorTributario;
    }

    public void setIdentificadorTributario(String identificadorTributario) {
        this.identificadorTributario = identificadorTributario;
    }
}
