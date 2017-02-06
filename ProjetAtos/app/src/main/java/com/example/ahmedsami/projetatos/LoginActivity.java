package com.example.ahmedsami.projetatos;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ahmedsami.projetatos.database.LoginDataBaseAdapter;

import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity  {

    RelativeLayout mainrelative,rl,rl_toolPar;
    EditText login ,password,cnfr_password,nom_et,prenom_et,adresse_et;
    Button btnsign;
    Display display=getWindowManager().getDefaultDisplay();

       int width= display.getWidth();
      int height=display.getHeight();

      LoginDataBaseAdapter loginDataBaseAdapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

       login=(EditText)findViewById(R.id.login);
        cnfr_password=(EditText)findViewById(R.id.cnfr_password);
        nom_et=(EditText)findViewById(R.id.nom_et);
        prenom_et=(EditText)findViewById(R.id.prenom_et);
        adresse_et=(EditText)findViewById(R.id.adresse_et);
         password=(EditText)findViewById(R.id.password);
        btnsign=(Button)findViewById(R.id.btn_signin);
        mainrelative=(RelativeLayout) findViewById(R.id.mainrelative);
        rl=(RelativeLayout) findViewById(R.id.rl);
        rl_toolPar=(RelativeLayout) findViewById(R.id.rl_toolPar);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        RelativeLayout.LayoutParams main_params= new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);

         RelativeLayout.LayoutParams   toolbar_params= new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,height*1/10);
        RelativeLayout.LayoutParams   rl_params= new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,height*9/10);


        rl.setLayoutParams(rl_params);
        mainrelative.setLayoutParams(main_params);
        rl_toolPar.setLayoutParams(toolbar_params);

        btnsign.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String pseudo,pwd,name,lname,adr,cnfrm_pwd;
                pseudo=login.getText().toString();
                pwd=password.getText().toString();
                name=nom_et.getText().toString();
                lname=prenom_et.getText().toString();
                adr=adresse_et.getText().toString();
                cnfrm_pwd=cnfr_password.getText().toString();
                if(pseudo.equals("")||pwd.equals("")||cnfrm_pwd.equals("")||name.equals("")||lname.equals("") )
                {
                    Toast.makeText(getApplicationContext(), "Field Vaccant", Toast.LENGTH_LONG).show();
                    return;
                }
                // check if both password matches
                if(!pwd.equals(cnfrm_pwd))
                {
                    Toast.makeText(getApplicationContext(), "Password does not match", Toast.LENGTH_LONG).show();
                    return;
                }
                else
                {
                    // Save the Data in Database
                    loginDataBaseAdapter.insertEntry(pseudo, pwd,name,lname,adr);
                    Intent it_menu=new Intent(LoginActivity.this,AccueilActivity.class);
                    startActivity(it_menu);
                    Toast.makeText(getApplicationContext(), "Account Successfully Created ", Toast.LENGTH_SHORT).show();
                }


            }
        });




    }
}

