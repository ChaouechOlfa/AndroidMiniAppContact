package com.example.androidminiappcontact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AjouterActivity extends AppCompatActivity {
    private EditText editAjouterNom;
    private EditText editAjouterNum;
    private Button btnAjouter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter);
        editAjouterNom=(EditText) findViewById(R.id.editAjouterNom);
        editAjouterNum=(EditText) findViewById(R.id.editAjouterNum);
        btnAjouter=(Button) findViewById(R.id.btnAjouter);

        btnAjouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contact c=new Contact(editAjouterNom.getText().toString(),editAjouterNum.getText().toString());
                DatabaseHandler dbh = new DatabaseHandler(AjouterActivity.this);
                long y = dbh.addContact(c);
                if (y>0){
                    Toast.makeText(getApplicationContext(),"ajout effectuer avec succé",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"ajoutn'est pas effectué",Toast.LENGTH_LONG).show();
                }


            }
        });
    }
}