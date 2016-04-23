package com.tyler_gotz.hackandtell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    private Button join, create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);
        join = (Button) findViewById(R.id.joinButton);
        create = (Button) findViewById(R.id.createButton);
        Firebase firebase = new Firebase("https://chas.firebaseio.com/");
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CreateCaveActivity.class);
                startActivity(intent);
            }
        });
    }
}
