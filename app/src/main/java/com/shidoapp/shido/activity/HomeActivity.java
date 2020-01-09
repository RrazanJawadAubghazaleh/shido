package com.shidoapp.shido.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.shidoapp.shido.R;

public class HomeActivity extends AppCompatActivity {

    private ImageButton buttonChat,buttonLoyality;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setUp();

    }

    private void setUp() {

    buttonChat=findViewById(R.id.Chat_home_imageButton_id);
   buttonLoyality=findViewById(R.id.Loyality_home_imageButton_id);

    buttonChat.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(HomeActivity.this,ChatAndCallActivity.class));
        }
    });


        buttonLoyality.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,LoyalityActivity.class));
            }
        });
    }


}
