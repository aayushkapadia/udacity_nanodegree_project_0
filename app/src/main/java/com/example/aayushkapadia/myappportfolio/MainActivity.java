package com.example.aayushkapadia.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void displayApp(View view)
    {
        Button myAppButton = (Button)(view);
        String text = myAppButton.getText().toString().toLowerCase();
        Toast.makeText(this,"This button will launch my "+text+" app",Toast.LENGTH_SHORT).show();

    }
}
