package com.christophe.mmm_tp1;

import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.text.InputType;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.raz:
                edt_nom.setText("");
                edt_prenom.setText("");
                edt_date.setText("");
                edt_ville.setText("");
                break;
            case R.id.telephone:
//                EditText tel = new EditText(this);
//                tel.setInputType(InputType.TYPE_CLASS_PHONE);
//                tel.setText("456");
//                tel.setEms(10);
//
//                ConstraintLayout.LayoutParams lp = (ConstraintLayout.LayoutParams) tel.getLayoutParams();
//                lp.height=10;
//                tel.setLayoutParams(lp);
//
//                ConstraintLayout.LayoutParams mCparams = new ConstraintLayout.LayoutParams(
//                        ConstraintLayout.LayoutParams.WRAP_CONTENT,
//                        ConstraintLayout.LayoutParams.WRAP_CONTENT
//                );
//                tel.setLayoutParams(mCparams);
//
//                ViewGroup viewGroup = (ViewGroup) findViewById(R.id.myLayout);
//                viewGroup.addView (tel);
//
//                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN_MR1) {
//                    tel.setId(Utils.generateViewId());
//                } else {
//                    tel.setId(View.generateViewId());
//                }
//
//                layout = (ConstraintLayout) findViewById(R.id.myLayout);
//                mConstraintSet.clone(layout);
//
//                mConstraintSet.addToVerticalChain(tel.getId(),R.id.editText3,R.id.spinner2);
//                mConstraintSet.centerHorizontally(tel.getId(), R.id.myLayout);
//
//
//
//
//                layout.setConstraintSet(mConstraintSet);
//
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
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
