package com.example.ahmedsami.projetatos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Cristina on 1/17/2017.
 */

public class AccueilActivity extends AppCompatActivity {



    Button buttonMesInfos,buttonMesDossiers,buttonGuidePratique,buttonAPropos,buttonMesMessages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

         buttonMesInfos = (Button) findViewById(R.id.buttonMesInfos);
         buttonMesDossiers = (Button) findViewById(R.id.buttonMesDossiers);
         buttonGuidePratique = (Button) findViewById(R.id.buttonGuidePratique);
         buttonAPropos = (Button) findViewById(R.id.buttonAPropos);
         buttonMesMessages = (Button) findViewById(R.id.buttonMesMessages);



        buttonMesDossiers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it_dossier= new Intent(AccueilActivity.this,NouveauDossierActivity.class);
                startActivity(it_dossier);
            }
        });

        buttonMesMessages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), AfficherMessagesActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }

}
