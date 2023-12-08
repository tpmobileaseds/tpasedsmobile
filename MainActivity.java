package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Activite est cree", Toast.LENGTH_SHORT).show();
        Log.i("onCreate()", "Activite est cree");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Activite est demarre", Toast.LENGTH_SHORT).show();
        Log.i("onStart()", "Activite est demarree");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Activite est redemarree", Toast.LENGTH_SHORT).show();
        Log.i("onRestart()", "Activite est redemarree");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Activite est reprise", Toast.LENGTH_SHORT).show();
        Log.i("onResume()", "Activite est reprise");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Activite est en pause", Toast.LENGTH_SHORT).show();
        Log.i( "onPause()", "Activite est en pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Activite est stoppee", Toast.LENGTH_SHORT).show();
        Log.i("onStop()", "Activite est stoppee");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Activite est detruite", Toast.LENGTH_SHORT).show();
        Log.i("onDestroy()", "Activity destroyed");
    }
