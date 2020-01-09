package com.shidoapp.shido.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.shidoapp.shido.R;

public class LoginActivity extends AppCompatActivity {

    private Button buttonEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setUP();
    }

    private void setUP() {
        buttonEmail=findViewById(R.id.shido_botton_id);

        buttonEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(new Intent(LoginActivity.this,SignInActivity.class));
            }
        });
    }
}
