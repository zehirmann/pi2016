package com.example.ahmedsami.projetatos;

import android.support.v7.app.AppCompatActivity;


import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.ahmedsami.projetatos.database.LoginDataBaseAdapter;

import java.io.FileOutputStream;

public class Connexion extends AppCompatActivity {

    EditText et_login,et_password;
    Button btn_conx;
    TextView forgt_pass;

    String login,password;
   // private String file = "mydata";
   LoginDataBaseAdapter loginDataBaseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);
        et_login=(EditText)findViewById(R.id.login_et);
        et_password=(EditText)findViewById(R.id.text_password);
        btn_conx=(Button) findViewById(R.id.connexion);
        forgt_pass=(TextView)findViewById(R.id.passoublie);


        loginDataBaseAdapter=new LoginDataBaseAdapter(this);
        loginDataBaseAdapter=loginDataBaseAdapter.open();

        btn_conx.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // get The User name and Password
                String userName=et_login.getText().toString();
                String password=et_password.getText().toString();

                // fetch the Password form com.example.ahmedsami.projetatos.database for respective user name
                String storedPassword=loginDataBaseAdapter.getSinlgeEntry(userName);

                Log.i("username",storedPassword);



                // check if the Stored password matches with  Password entered by user
                if(password.equals(storedPassword))
                {
                        Intent it_menu=new Intent(Connexion.this,AccueilActivity.class);
                    startActivity(it_menu);

                }
                else
                {
                    Toast.makeText(Connexion.this, "User Name or Password does not match", Toast.LENGTH_LONG).show();
                }
            }
        });





    }

    // Methos to handleClick Event of Sign In Button
    public void signIn(View V)
    {
        final Dialog dialog = new Dialog(Connexion.this);
        dialog.setContentView(R.layout.activity_connexion);
        dialog.setTitle("Login");

        // get the Refferences of views

        et_login=(EditText)findViewById(R.id.login_et);
        et_password=(EditText)findViewById(R.id.text_password);

        btn_conx=(Button) findViewById(R.id.connexion);
        // Set On ClickListener


        dialog.show();
    }


}
