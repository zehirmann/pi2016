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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        Button buttonMesInfos = (Button) findViewById(R.id.buttonMesInfos);
        Button buttonMesDossiers = (Button) findViewById(R.id.buttonMesDossiers);
        Button buttonGuidePratique = (Button) findViewById(R.id.buttonGuidePratique);
        Button buttonAPropos = (Button) findViewById(R.id.buttonAPropos);
        Button buttonMesMessages = (Button) findViewById(R.id.buttonMesMessages);

        buttonMesMessages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), AfficherMessagesActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }

}
