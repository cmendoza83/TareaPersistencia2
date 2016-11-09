package com.example.cynthia.patagramtarea.fragment;


public class FotoMascota {
    private int foto;

    private int puntuacion;

    public FotoMascota (int foto, int puntuacion){
        this.foto = foto;

        this.puntuacion = puntuacion;

    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

}
