package com.example.cynthia.patagramtarea.fragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.cynthia.patagramtarea.MainActivity;
import com.example.cynthia.patagramtarea.R;

public class AcercaDe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);
    }

    public void clicRegresar(View v) {
        Intent intent = new Intent(AcercaDe.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
