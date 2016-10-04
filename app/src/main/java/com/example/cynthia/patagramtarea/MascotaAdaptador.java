package com.example.cynthia.patagramtarea;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by cynthia on 02-10-16.
 */

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{

    ArrayList<Mascota> mascotas;
    Activity activity;

    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);

        mascotaViewHolder.ivFoto.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvNombre.setText(mascota.getNombre());
        mascotaViewHolder.tvPuntos.setText(String.valueOf(mascota.getPuntuacion()));

        mascotaViewHolder.ibLike.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                mascota.setPuntuacion(mascota.getPuntuacion()+1);
                mascotaViewHolder.tvPuntos.setText(String.valueOf(mascota.getPuntuacion()));            }
        }

        );



    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivFoto;
        private ImageButton ibLike;
        private TextView tvNombre;
        private TextView tvPuntos;


        public MascotaViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.ivFoto);
            ibLike = (ImageButton) itemView.findViewById(R.id.ibLike);
            tvNombre = (TextView) itemView.findViewById(R.id.tvNombre);
            tvPuntos = (TextView) itemView.findViewById(R.id.tvPuntos);




        }
    }



}
