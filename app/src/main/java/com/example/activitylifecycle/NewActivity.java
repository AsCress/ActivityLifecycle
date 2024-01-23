package com.example.activitylifecycle;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

 public class NewActivity extends AppCompatActivity {
    private static final int TL = Toast.LENGTH_LONG;
    private static final String AC = "New Activity";
    private String message="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);

        message=" onCreate() called";
        Toast.makeText(this, AC+message, TL).show();

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

}
