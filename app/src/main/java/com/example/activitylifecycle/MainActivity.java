package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final int TL = Toast.LENGTH_LONG;
    private static final String AC = "Main Activity";
    private String message="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message=" onCreate() called";
        Toast.makeText(this, AC+message, TL).show();

        View button1 = findViewById(R.id.button);
        View button2 = findViewById(R.id.button2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }

    @Override
    protected void onStart(){
        super.onStart();
        message=" onStart() called";
        Toast.makeText(this, AC+message, TL).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        message=" onResume() called";
        Toast.makeText(this, AC+message, TL).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        message=" onPause() called";
        Toast.makeText(this, AC+message, TL).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        message=" onRestart() called";
        Toast.makeText(this, AC+message, TL).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        message=" onStop() called";
        Toast.makeText(this, AC+message, TL).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        message=" onDestroy() called";
        Toast.makeText(this, AC+message, TL).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Intent j = new Intent(this, NewActivity.class);
                startActivity(j);
                break;
            case R.id.button2:
                message = AC+" Calling finish()";
                Toast.makeText(this, message, TL).show();
                finish();
                break;
        }

    }

}
