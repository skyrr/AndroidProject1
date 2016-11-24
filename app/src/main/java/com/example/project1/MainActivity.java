package com.example.project1;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView tv;
    Button bc;
    int buttonColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textView);
        Button bt = (Button) findViewById(R.id.buttonToast);
        bc = (Button) findViewById(R.id.buttonColor);
        Button ba = (Button) findViewById(R.id.buttonAnotherActivity);

        bt.setOnClickListener(this);
        bc.setOnClickListener(this);
        ba.setOnClickListener(this);
        //
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonToast:
                tv.setText("Hello, Ihor!");
                Toast.makeText(getApplicationContext(), "You have pressed button 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonColor:
                if (buttonColor == 0) {
                    bc.setBackgroundColor(Color.RED);
                    buttonColor = 1;
                } else {
                    bc.setBackgroundColor(Color.BLUE);
                    buttonColor = 0;
                }
                break;
            case R.id.buttonAnotherActivity:
                Intent i = new Intent();
                i.setClass(this, ActivitySecond.class);
                startActivity(i);
                break;//
        }

    }
}
