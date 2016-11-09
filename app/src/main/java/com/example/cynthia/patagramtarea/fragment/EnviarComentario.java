package com.example.cynthia.patagramtarea.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.cynthia.patagramtarea.R;
import com.example.cynthia.patagramtarea.jmail.GMailSender;

public class EnviarComentario extends AppCompatActivity {

    TextView mensaje, email, nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar_comentario);

        mensaje = (TextView) findViewById(R.id.etMensaje);
        email = (TextView) findViewById(R.id.etCorreo);
        nombre = (TextView) findViewById(R.id.etNombre);

    }

    protected void enviarMail(View v) {

        GMailSender sender = new GMailSender("<U R GMAIL ADDRESS>","<GMAIL PASSWORD>");
        try {
            sender.sendMail("Petagram comentario",mensaje.getText().toString(),email.getText().toString(), "<RECIPIENT(RECEIVER) EMAIL ADDRESS>");
        }
        catch (Exception e) {
            Log.e("SendMail", e.getMessage(), e);
        }


    }
}
