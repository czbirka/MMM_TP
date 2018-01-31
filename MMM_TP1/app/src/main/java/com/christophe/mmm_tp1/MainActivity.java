package com.christophe.mmm_tp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt_nom;
    EditText edt_prenom;
    EditText edt_date;
    EditText edt_ville;
    Button btn_valider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_nom = findViewById(R.id.nom);
        edt_prenom = findViewById(R.id.prenom);
        edt_date = findViewById(R.id.dateNaissance);
        edt_ville = findViewById(R.id.villeNaissance);
        btn_valider = findViewById(R.id.valider);

        btn_valider.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (verificationSaisie()) {
                    String message = "Nom: " + edt_nom.getText().toString() + "\n"
                            + "Prénom: " + edt_prenom.getText().toString() + "\n"
                            + "Date de naissance: " + edt_date.getText().toString() + "\n"
                            + "Ville de naissance: " + edt_ville.getText().toString();
                    Toast.makeText(getApplicationContext(),message, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private boolean verificationSaisie(){
        boolean resultat = true;

        if (((EditText) findViewById(R.id.nom )).getText().toString().isEmpty()){
            findViewById(R.id.nom ).requestFocus();
            Toast.makeText(getApplicationContext(), "Vous devez saisir un NOM !", Toast.LENGTH_SHORT).show();
            resultat = false;
            return resultat;
        }
        if (((EditText) findViewById(R.id.prenom )).getText().toString().isEmpty()){
            findViewById(R.id.prenom ).requestFocus();
            Toast.makeText(getApplicationContext(), "Vous devez saisir un PRENOM !", Toast.LENGTH_SHORT).show();
            resultat = false;
            return resultat;
        }
        if (((EditText) findViewById(R.id.dateNaissance )).getText().toString().isEmpty()){
            findViewById(R.id.dateNaissance ).requestFocus();
            Toast.makeText(getApplicationContext(), "Vous devez saisir une DATE !", Toast.LENGTH_SHORT).show();
            resultat = false;
            return resultat;
        }
        if (((EditText) findViewById(R.id.villeNaissance )).getText().toString().isEmpty()){
            findViewById(R.id.villeNaissance ).requestFocus();
            Toast.makeText(getApplicationContext(), "Vous devez saisir une VILLE !", Toast.LENGTH_SHORT).show();
            resultat = false;
            return resultat;
        }

        return resultat;
    }
}
