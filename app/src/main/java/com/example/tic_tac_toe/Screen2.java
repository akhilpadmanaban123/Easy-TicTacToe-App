package com.example.tic_tac_toe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;

public class Screen2 extends AppCompatActivity {
    RadioButton rad1,rad2;
    Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);


//for setting fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        but=findViewById(R.id.button);
        rad1=findViewById(R.id.radioButton);
        rad2=findViewById(R.id.radioButton2);


        rad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                but.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Intent in=new Intent(Screen2.this,MainActivity.class);
                                startActivity(in);
                                finish();
                    }
                },500);
                    }
                });
            }
        });
        rad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(Screen2.this);
                builder.setMessage("The Work is under process :(").setCancelable(false).setIcon(R.drawable.ok).setTitle("Alert!").setPositiveButton("Ok",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                    }
                }).create() ;
                builder.show();
            }
        });
    }
}
