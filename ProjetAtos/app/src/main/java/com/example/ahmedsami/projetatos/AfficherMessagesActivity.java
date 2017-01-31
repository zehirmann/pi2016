package com.example.ahmedsami.projetatos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Cristina on 1/18/2017.
 */

public class AfficherMessagesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_messages);

        Button buttonNousEcrire = (Button) findViewById(R.id.buttonNousEcrire);

        buttonNousEcrire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), NouveauMessageActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
