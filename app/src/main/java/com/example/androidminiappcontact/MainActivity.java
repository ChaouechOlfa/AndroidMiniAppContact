package com.example.androidminiappcontact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.btnAjouter)).setOnClickListener(this);
        ((Button) findViewById(R.id.btnModifier)).setOnClickListener(this);
        ((Button) findViewById(R.id.btnSupprimer)).setOnClickListener(this);
        ((Button) findViewById(R.id.btnModifier)).setOnClickListener(this);
        ((Button) findViewById(R.id.btnLister)).setOnClickListener(this);
        ((Button) findViewById(R.id.btnQuitter)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.btnAjouter:
                i=new Intent(MainActivity.this, AjouterActivity.class);
                startActivity(i);
                break;
            case R.id.btnModifier:
                i=new Intent(MainActivity.this, ModifierActivity.class);
                startActivity(i);
                break;
            case R.id.btnSupprimer:
                i=new Intent(MainActivity.this, SupprimerActivity.class);
                startActivity(i);
                break;
            case R.id.btnRechercher:
                i=new Intent(MainActivity.this, RechercherActivity.class);
                startActivity(i);
                break;
            case R.id.btnLister:
                i=new Intent(MainActivity.this, ListerActivity.class);
                startActivity(i);
                break;
            case R.id.btnQuitter:
                finish();



        }
    }
}