package com.example.cynthia.patagramtarea.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import com.example.cynthia.patagramtarea.fragment.FotoMascota;
import com.example.cynthia.patagramtarea.R;

import java.util.ArrayList;


public class FotoAdaptador extends RecyclerView.Adapter<FotoAdaptador.FotoViewHolder>{

    ArrayList<FotoMascota> fotos;
    Activity activity;

    public FotoAdaptador(ArrayList<FotoMascota> fotos, Activity activity){
        this.fotos = fotos;
        this.activity = activity;
    }

    @Override
    public FotoAdaptador.FotoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_foto,parent,false);
        return new FotoAdaptador.FotoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final FotoAdaptador.FotoViewHolder fotoViewHolder, int position) {
        final FotoMascota fotoMascota = fotos.get(position);

        fotoViewHolder.ivFoto.setImageResource(fotoMascota.getFoto());

        fotoViewHolder.tvPuntos.setText(String.valueOf(fotoMascota.getPuntuacion()));

    }

    @Override
    public int getItemCount() {
        return fotos.size();
    }

    public static class FotoViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivFoto;
        private TextView tvPuntos;


        public FotoViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.ivFoto2);
            tvPuntos = (TextView) itemView.findViewById(R.id.tvPuntos2);

        }
    }




}
