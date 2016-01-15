package com.example.kheiry.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button hello = (Button) findViewById(R.id.button);
        hello.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, "hello man", Toast.LENGTH_LONG).show();
            }
        });
    }
}
