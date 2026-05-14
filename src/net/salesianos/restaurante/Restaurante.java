package net.salesianos.restaurante;

public class Restaurante {
    private String nombre;
    private String tipoCocina;
    private String direccion;
    private double puntuacion;

    public Restaurante(String nombre, String tipoCocina, String direccion, double puntuacion) {
        this.nombre = nombre;
        this.tipoCocina = tipoCocina;
        this.direccion = direccion;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipoCocina() {
        return tipoCocina;
    }

    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }
}