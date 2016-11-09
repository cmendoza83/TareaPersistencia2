package com.example.cynthia.patagramtarea.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cynthia.patagramtarea.pojo.Mascota;
import com.example.cynthia.patagramtarea.adapter.MascotaAdaptador;
import com.example.cynthia.patagramtarea.R;
import com.example.cynthia.patagramtarea.presentador.IRecyclerViewFragmentPresenter;
import com.example.cynthia.patagramtarea.presentador.RecyclerViewFragmentPresenter;

import java.util.ArrayList;


public class HomeFragment extends Fragment implements IRecyclerViewFragmentView{

    ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotas;
    private IRecyclerViewFragmentPresenter presenter;


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home,container,false);

        rvMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        presenter = new RecyclerViewFragmentPresenter(this,getContext());

        return v;
    }


    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        rvMascotas.setLayoutManager(llm);
    }

    @Override
    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas) {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas,getActivity());
        return adaptador;
    }

    @Override
    public void inicializarAdaptadorRV(MascotaAdaptador adaptador) {
        rvMascotas.setAdapter(adaptador);
    }
}
