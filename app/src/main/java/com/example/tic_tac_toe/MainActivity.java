package com.example.tic_tac_toe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //image view buttons
    ImageView but1, but2, but3, but4, but5, but6, but7, but8, but9;

    //two score textviews;
    EditText scoreX, scoreY;

    //starting move should be always X
    private String startMove = "X";

    //button to reset every moves to 0
    ImageView restart_Button;

    //just making integer buttons
    private int a1 = 4, a2 = 4, a3 = 4, a4 = 4, a5 = 4, a6 = 4, a7 = 4, a8 = 4, a9 = 4;

    int i = 1,j=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//for setting fullscreen

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //linking the buttons to every image view and textview id's
        but1 = findViewById(R.id.BUT1);
        but2 = findViewById(R.id.BUT2);
        but3 = findViewById(R.id.BUT3);
        but4 = findViewById(R.id.BUT4);
        but5 = findViewById(R.id.BUT5);
        but6 = findViewById(R.id.BUT6);
        but7 = findViewById(R.id.BUT7);
        but8 = findViewById(R.id.BUT8);
        but9 = findViewById(R.id.BUT9);

        //linking the restart button
        restart_Button = findViewById(R.id.restart);

        //linking the score panel
        scoreX = findViewById(R.id.score1);
        scoreY = findViewById(R.id.score2);



        /* creating the restart game button which rubs every variable to the start
         */
        restart_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                but1.setImageDrawable(null);
                but2.setImageDrawable(null);
                but3.setImageDrawable(null);
                but4.setImageDrawable(null);
                but5.setImageDrawable(null);
                but6.setImageDrawable(null);
                but7.setImageDrawable(null);
                but8.setImageDrawable(null);
                but9.setImageDrawable(null);
                i=1;
                j=1;
                scoreX.setText("");
                scoreY.setText("");
                resetting();
            }
        });
        //actions for 1-9 panels
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (but1.getDrawable() == null) {
                    if (startMove.equals("X")) {
                        but1.setImageResource(R.drawable.cross);
                        a1 = 1;
                    } else {
                        but1.setImageResource(R.drawable.circle);
                        a1 = 0;
                    }
                changing_symbol();
                game_winning_logic();
            }
                else
                {

                }
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(but2.getDrawable()==null) {
                    if (startMove.equals("X")) {
                        but2.setImageResource(R.drawable.cross);
                        a2 = 1;
                    } else {
                        but2.setImageResource(R.drawable.circle);
                        a2 = 0;
                    }
                    changing_symbol();
                    game_winning_logic();
                }else
                {

                }
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (but3.getDrawable() == null) {
                    if (startMove.equals("X")) {
                        but3.setImageResource(R.drawable.cross);
                        a3 = 1;
                    } else {
                        but3.setImageResource(R.drawable.circle);
                        a3 = 0;
                    }
                changing_symbol();
                game_winning_logic();
            }else

            {
            }
        }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(but4.getDrawable()==null)
                {
                if (startMove.equals("X")) {
                    but4.setImageResource(R.drawable.cross);
                    a4 = 1;
                } else {
                    but4.setImageResource(R.drawable.circle);
                    a4 = 0;
                }
                changing_symbol();
                game_winning_logic();
            }else
                {

                }}
        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (but5.getDrawable() == null) {
                    if (startMove.equals("X")) {
                        but5.setImageResource(R.drawable.cross);
                        a5 = 1;
                    } else {
                        but5.setImageResource(R.drawable.circle);
                        a5 = 0;
                    }
                    changing_symbol();
                    game_winning_logic();
                } else {

                }
            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(but6.getDrawable()==null) {
                    if (startMove.equals("X")) {
                        but6.setImageResource(R.drawable.cross);
                        a6 = 1;
                    } else {
                        but6.setImageResource(R.drawable.circle);
                        a6 = 0;
                    }
                    changing_symbol();
                    game_winning_logic();
                }
                else
                {

                }
            }
        });
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (but7.getDrawable() == null) {
                    if (startMove.equals("X")) {
                        but7.setImageResource(R.drawable.cross);
                        a7 = 1;
                    } else {
                        but7.setImageResource(R.drawable.circle);
                        a7 = 0;
                    }
                    changing_symbol();
                    game_winning_logic();
                } else {

                }
            }
        });
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(but8.getDrawable()==null)
                {
                if (startMove.equals("X")) {
                    but8.setImageResource(R.drawable.cross);
                    a8 = 1;
                } else {
                    but8.setImageResource(R.drawable.circle);
                    a8 = 0;
                }
                changing_symbol();
                game_winning_logic();
            }else{

                }
            }
        });
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(but9.getDrawable()==null) {
                    if (startMove.equals("X")) {
                        but9.setImageResource(R.drawable.cross);
                        a9 = 1;
                    } else {
                        but9.setImageResource(R.drawable.circle);
                        a9 = 0;
                    }
                    /*logic to change the symbol to the opposite of the clicked one*/
                    changing_symbol();
                    /* checking winning logic after every clicks*/
                    game_winning_logic();
                }else
                {

                }
            }
        });
    }


    /* when the button image shown is a cross one , then it will be changed to circle,
    orelse vise-versa
     */
    public void changing_symbol() {
        if (startMove.equals("X"))
            startMove="O";
        else
            startMove="X";

    }

    //final logic to check which player wins the game. using 8*8 16 different line logic
    public void game_winning_logic() {

        /*Player 0 wins the game when the 8 layer becomes 0*/
        if ((a1 == 1 && a2 == 1 && a3 == 1) || (a4 == 1 && a5 == 1 && a6 == 1) || (a7 == 1 && a8 == 1 && a9 == 1) || (a1 == 1 && a5 == 1 && a9 == 1) || (a3 == 1 && a5 == 1 && a7 == 1) || (a1 == 1 && a4 == 1 && a7 == 1) || (a2 == 1 && a5 == 1 && a8 == 1))
        {
            AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setIcon(R.drawable.ok).setCancelable(false).setMessage("Player 1 wins!").setPositiveButton("COntinue", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            }).create();
            builder.show();

            scoreX.setText(String.valueOf(i));
            but1.setImageDrawable(null);
            but2.setImageDrawable(null);
            but3.setImageDrawable(null);
            but4.setImageDrawable(null);
            but5.setImageDrawable(null);
            but6.setImageDrawable(null);
            but7.setImageDrawable(null);
            but8.setImageDrawable(null);
            but9.setImageDrawable(null);
            i++;
            resetting();
        }
        else

            /*Player 0 wins the game when the 8 layer becomes 0*/
            if ((a1 == 0 && a2 == 0 && a3 == 0) || (a4 == 0 && a5 == 0 && a6 == 0) || (a7 == 0 && a8 == 0 && a9 == 0) || (a1 == 0 && a5 == 0 && a9 == 0) || (a3 == 0 && a5 == 0 && a7 == 0) || (a1 == 0 && a4 == 0 && a7 == 0) || (a2 == 0 && a5 == 0 && a8 == 0))
            {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setIcon(R.drawable.ok).setMessage("Player 2 wins!").setCancelable(false).setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).create();
                builder.show();
                scoreY.setText(String.valueOf(j));
                but1.setImageDrawable(null);
                but2.setImageDrawable(null);
                but3.setImageDrawable(null);
                but4.setImageDrawable(null);
                but5.setImageDrawable(null);
                but6.setImageDrawable(null);
                but7.setImageDrawable(null);
                but8.setImageDrawable(null);
                but9.setImageDrawable(null);
                j++;
                resetting();
        }
        else
        {

            /* Throwing an alert when all the imageviews are filled with cross and cirles, which means the game ends in a draw*/
            if(but1.getDrawable()!=null&&but2.getDrawable()!=null&&but3.getDrawable()!=null&&but4.getDrawable()!=null&&but5.getDrawable()!=null&&but6.getDrawable()!=null&&but7.getDrawable()!=null&& but8.getDrawable()!=null&&but9.getDrawable()!=null)
            {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setIcon(R.drawable.ok).setCancelable(false).setMessage("It's a Draw!").setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        but1.setImageDrawable(null);
                        but2.setImageDrawable(null);
                        but3.setImageDrawable(null);
                        but4.setImageDrawable(null);
                        but5.setImageDrawable(null);
                        but6.setImageDrawable(null);
                        but7.setImageDrawable(null);
                        but8.setImageDrawable(null);
                        but9.setImageDrawable(null);
                        resetting();
                    }
                }).create();
                builder.show();
            }
        }
    }



//field for resetting the whole variables back to any number.
    public void resetting () {
                    a1 = 4;
                    a2 = 4;
                    a3 = 4;
                    a4 = 4;
                    a5 = 4;
                    a6 = 4;
                    a7 = 4;
                    a8 = 4;
                    a9 = 4;
                }
}