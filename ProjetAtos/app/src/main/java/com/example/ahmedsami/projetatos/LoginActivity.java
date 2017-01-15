package com.example.ahmedsami.projetatos;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
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

import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity  {

    RelativeLayout mainrelative,rl;
    EditText login ,password;
    Button sign_in;
    Display width,height;

    public Display getWidth() {
        return width;
    }

    public Display getHeight() {
        return height;
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        sign_in=(Button)findViewById(R.id.btn_signin);
       login=(EditText)findViewById(R.id.login);
       password=(EditText)findViewById(R.id.password);
        mainrelative=(RelativeLayout) findViewById(R.id.mainrelative);
        rl=(RelativeLayout) findViewById(R.id.rl);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        RelativeLayout.LayoutParams main_params= new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);









    }
}

