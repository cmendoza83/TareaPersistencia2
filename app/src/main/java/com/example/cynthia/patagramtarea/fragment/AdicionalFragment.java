package com.example.cynthia.patagramtarea.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cynthia.patagramtarea.adapter.FotoAdaptador;
import com.example.cynthia.patagramtarea.R;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.ArrayList;


public class AdicionalFragment extends Fragment{
    ArrayList<FotoMascota> fotos;
    private RecyclerView rvFotos;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_adicional,container,false);

        CircularImageView circularImageView = (CircularImageView) v.findViewById(R.id.imgCircular);
// Set Border
        circularImageView.setBorderColor(getResources().getColor(R.color.colorPrimaryDark));
        circularImageView.setBorderWidth(10);
// Add Shadow with default param
        circularImageView.addShadow();
// or with custom param
        circularImageView.setShadowRadius(15);
        circularImageView.setShadowColor(Color.RED);




        rvFotos = (RecyclerView) v.findViewById(R.id.rvFotos);

       // LinearLayoutManager llm = new LinearLayoutManager(getActivity());
       // llm.setOrientation(LinearLayoutManager.VERTICAL);

        GridLayoutManager glm = new GridLayoutManager(getActivity(),3);

        rvFotos.setLayoutManager(glm);

        this.inicializaDatos();
        this.inicializaAdapter();

        return v;
    }


    public void inicializaDatos(){
        fotos = new ArrayList<FotoMascota>();

        fotos.add(new FotoMascota(R.drawable.dog_2,7));
        fotos.add(new FotoMascota(R.drawable.dog_2,10));
        fotos.add(new FotoMascota(R.drawable.dog_2,15));
        fotos.add(new FotoMascota(R.drawable.dog_2,4));
        fotos.add(new FotoMascota(R.drawable.dog_2,6));
        fotos.add(new FotoMascota(R.drawable.dog_2,2));
        fotos.add(new FotoMascota(R.drawable.dog_2,23));
        fotos.add(new FotoMascota(R.drawable.dog_2,15));
        fotos.add(new FotoMascota(R.drawable.dog_2,7));

    }


    public void inicializaAdapter(){
        FotoAdaptador adaptador = new FotoAdaptador(fotos,getActivity());
        rvFotos.setAdapter(adaptador);

    }

}
