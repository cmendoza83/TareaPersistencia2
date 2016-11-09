package com.example.cynthia.patagramtarea;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.cynthia.patagramtarea.adapter.PageAdapter;
import com.example.cynthia.patagramtarea.fragment.AcercaDe;
import com.example.cynthia.patagramtarea.fragment.AdicionalFragment;
import com.example.cynthia.patagramtarea.fragment.EnviarComentario;
import com.example.cynthia.patagramtarea.fragment.HomeFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = (Toolbar) findViewById(R.id.toolBar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        setUpViewPager();

        if (toolbar!=null)  {setSupportActionBar(toolbar);}

    }


    //agregando boton de acción al toolbar
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.abRanking:
                Toast.makeText(this.getApplicationContext(),"Ranking", Toast.LENGTH_SHORT);

                Intent intent = new Intent(MainActivity.this,RankingMascotas.class);
                MainActivity.this.startActivity(intent);
                //finish();
                return true;

            case R.id.mContacto:
                Toast.makeText(this,"Contacto",Toast.LENGTH_SHORT);

                Intent intent2 = new Intent(MainActivity.this,EnviarComentario.class);
                startActivity(intent2);
                finish();
                break;

            case R.id.mAcerca:
                Toast.makeText(this,"Acerca",Toast.LENGTH_SHORT);
                Intent intent3 = new Intent(MainActivity.this,AcercaDe.class);
                startActivity(intent3);
                finish();
                break;

        }


       return true;
    }


    private ArrayList<Fragment> agregarFragments() {

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new AdicionalFragment());

        return fragments;

    }



    private void setUpViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(),agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_adicional);

    }


}
