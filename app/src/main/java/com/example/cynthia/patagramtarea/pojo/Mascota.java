package com.example.cynthia.patagramtarea.pojo;

/**
 * Created by Cesar Mendoza on 02-10-16.
 */

public class Mascota {
    private int foto;
    private String nombre;
    private int puntuacion;
    private int idMascota;

    public Mascota (int foto, String nombre, int puntuacion){
        this.foto = foto;
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.idMascota = 0;
    }

    public Mascota() {

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

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }
}
