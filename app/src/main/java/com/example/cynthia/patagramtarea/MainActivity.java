package com.example.cynthia.patagramtarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotas;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.dog_1,"Braulio",0));
        mascotas.add(new Mascota(R.drawable.dog_2,"Rambo",0));
        mascotas.add(new Mascota(R.drawable.dog_3,"Bronco",0));
        mascotas.add(new Mascota(R.drawable.dog_4,"Benigno",0));
        mascotas.add(new Mascota(R.drawable.cat_1,"Virgilio",0));
        mascotas.add(new Mascota(R.drawable.monkey_1,"Socrates",0));
        mascotas.add(new Mascota(R.drawable.mouse_1,"Jerry",0));

        rvMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        rvMascotas.setLayoutManager(llm);

        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas,this);
        rvMascotas.setAdapter(adaptador);

    }


    //agregando boton de acción al toolbar
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        if (id == R.id.abRanking) {
            Toast.makeText(this.getApplicationContext(),"Ranking", Toast.LENGTH_SHORT);


            Intent intent = new Intent(MainActivity.this,ranking.class);
            MainActivity.this.startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
