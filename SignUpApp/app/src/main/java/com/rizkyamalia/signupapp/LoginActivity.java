package com.rizkyamalia.signupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnJoin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnJoin = findViewById(R.id.BtnJoin);
        btnJoin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.BtnJoin:
                Intent join = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(join);
                break;
            case R.id.btnReadmore:
                break;
        }

    }
}
