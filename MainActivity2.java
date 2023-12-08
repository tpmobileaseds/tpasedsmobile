package com.example.myapplication;

import static com.example.myapplication.R.*;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button bouton_explicite, bouton_implicite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        Intent intent = new Intent(MainActivity2.this, DeuxiemeActivite.class);
        bouton_explicite = (Button)findViewById(id.button);
        bouton_implicite = (Button) findViewById(id.button2);

        bouton_explicite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, DeuxiemeActivite.class);
                intent.putExtra("nom", "outalb");
                intent.putExtra("prenom", "walid");
                startActivity(intent);
            }
        });

        bouton_implicite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.inpt.ac.ma"));
                startActivity(intent);
            }
        });
    }
}
