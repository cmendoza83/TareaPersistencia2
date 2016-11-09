package com.example.cynthia.patagramtarea.fragment;

import com.example.cynthia.patagramtarea.adapter.MascotaAdaptador;
import com.example.cynthia.patagramtarea.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by cynthia on 06-11-16.
 */

public interface IRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();
    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);
    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);
}
