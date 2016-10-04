package com.example.cynthia.patagramtarea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import java.util.ArrayList;

public class ranking extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotas;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);

        toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.dog_4,"Benigno",15));
        mascotas.add(new Mascota(R.drawable.monkey_1,"Socrates",12));
        mascotas.add(new Mascota(R.drawable.dog_3,"Bronco",10));
        mascotas.add(new Mascota(R.drawable.mouse_1,"Jerry",7));
        mascotas.add(new Mascota(R.drawable.dog_1,"Braulio",6));
        mascotas.add(new Mascota(R.drawable.dog_2,"Rambo",3));
        mascotas.add(new Mascota(R.drawable.cat_1,"Virgilio",1));

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
