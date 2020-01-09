package com.shidoapp.shido.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.shidoapp.shido.R;

public class SignUpActivity extends AppCompatActivity {

private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        setUp();
    }

    private void setUp() {
    recyclerView=findViewById(R.id.chat_recyclerview_id);
//,LinearLayoutManager.VERTICAL,true
    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
