package com.example.cynthia.patagramtarea;

/**
 * Created by Cesar Mendoza on 02-10-16.
 */

public class Mascota {
    private int foto;
    private String nombre;
    private int puntuacion;

    public Mascota (int foto, String nombre, int puntuacion){
        this.foto = foto;
        this.nombre = nombre;
        this.puntuacion = puntuacion;

    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}
