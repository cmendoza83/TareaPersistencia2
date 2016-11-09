package com.example.cynthia.patagramtarea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.example.cynthia.patagramtarea.adapter.MascotaAdaptador;
import com.example.cynthia.patagramtarea.bd.ConstructorMascotas;
import com.example.cynthia.patagramtarea.pojo.Mascota;

import java.util.ArrayList;

public class RankingMascotas extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotas;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);
        this.setTitle("Ranking Mascotas");

        toolbar = (Toolbar) findViewById(R.id.toolBar);

        setSupportActionBar(toolbar);

       // getActionBar().setDisplayHomeAsUpEnabled(true);

        ConstructorMascotas constructorMascotas = new ConstructorMascotas(this.getApplicationContext());
        mascotas = constructorMascotas.obtenerRankingMascotas();


        rvMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        rvMascotas.setLayoutManager(llm);

        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas,this);
        rvMascotas.setAdapter(adaptador);


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



}
