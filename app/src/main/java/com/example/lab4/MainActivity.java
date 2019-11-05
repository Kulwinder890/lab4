package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener, OnCheckedChangeListener {
    private  Button button;
private Button button2;
private Button button4;
private Button button3;
private TextView textView1;
    private TextView textView3;
    int score1 = 0;
    int score2 = 0;
    int chngVal = 0 ;
    private RadioButton rb1, rb2, rb3;
    //THIS LINE
    private RadioGroup rbgrp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        textView1 = (TextView) findViewById(R.id.score1_value);
        textView3 = (TextView) findViewById(R.id.TextView3);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        rbgrp = (RadioGroup) findViewById(R.id.rbgrp);
        rbgrp.setOnCheckedChangeListener(this);
/*        button.setOnClickListener(new View.OnClickListener() {

        });*/
    }

    @Override
    public void onClick(View v){
        if( v.getId() == R.id.button2){
            String a =  textView1.getText().toString();
            score1 = Integer.parseInt(a) + chngVal;
            textView1.setText(Integer.toString(score1));

        }
        if( v.getId() == R.id.button){
            String b =  textView3.getText().toString();
            score2 = Integer.parseInt(b) + chngVal;
            textView3.setText(Integer.toString(score2));

        }
        if( v.getId() == R.id.button3){
            String b =  textView3.getText().toString();
            score2 = Integer.parseInt(b) - chngVal;
            textView3.setText(Integer.toString(score2));

        }
        if( v.getId() == R.id.button4){
            String a =  textView1.getText().toString();
            score1 = Integer.parseInt(a) - chngVal;
            textView1.setText(Integer.toString(score1));

        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId){
        switch (checkedId){
            case R.id.rb1:
            default:
                chngVal = 2;
                break;
            case R.id.rb2:
                chngVal = 4;
                break;
            case R.id.rb3:
                chngVal = 6;
                break;
        };
    }

}
