package com.example.nimish.dice;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MultiPlayer extends AppCompatActivity {



    private int userScrore=0;
    private int userTurnScrore=0;
    private int player2Score=0;
    private int Player2TurnScrore=0;
    Random random=new Random();
    ImageView imageView;
    int a=0;
    int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_player);
        a=0;
        imageView=(ImageView)findViewById(R.id.dice);

    }

    public void roll(View view) {

        i =random.nextInt(6-1+1)+1;//(max-min+1)+1
        if(a==0) {
            switch (i) {
                case 1:
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice1));
                    userTurnScrore = 0;
                    hold(view);
                    break;


                case 2:
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice2));
                    userTurnScrore += 2;
                    break;

                case 3:
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice3));
                    userTurnScrore += 3;
                    break;

                case 4:
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice4));
                    userTurnScrore += 4;
                    break;

                case 5:
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice5));
                    userTurnScrore += 5;
                    break;

                case 6:
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice6));
                    userTurnScrore += 6;
                    break;

            }
            TextView currentView =(TextView)findViewById(R.id.zero2);
            currentView.setText(String.valueOf(userTurnScrore));

        }
        else {

            switch (i) {

                case 1:
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice1));
                    userTurnScrore = 0;
                    break;


                case 2:
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice2));
                    userTurnScrore += 2;
                    break;

                case 3:
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice3));
                    userTurnScrore += 3;
                    break;

                case 4:
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice4));
                    userTurnScrore += 4;
                    break;

                case 5:
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice5));
                    userTurnScrore += 5;
                    break;

                case 6:
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice6));
                    userTurnScrore += 6;
                    break;

            }
            TextView currentView =(TextView)findViewById(R.id.zero2);
            currentView.setText(String.valueOf(userTurnScrore));
           /*player2Score+=userTurnScrore;
            TextView compView =(TextView)findViewById(R.id.zero2);
            compView.setText(String.valueOf(player2Score));

            if(player2Score>=20)
            {
                a=0;
                roll(view);
            }*/

        }

        if(userScrore>100)
        {   Context context = getApplicationContext();
            CharSequence text = "Player 1 wins";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            reset(view);
        }
        if(player2Score>100)
        {   Context context = getApplicationContext();
            CharSequence text = "Player 2 wins";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            reset(view);
        }





    }

    public void hold(View view) {
        if(a==0) {
            a = 1;
            TextView holdView = (TextView) findViewById(R.id.zero);
            userScrore += userTurnScrore;
            holdView.setText(String.valueOf(userScrore));
            userTurnScrore = 0;
            TextView currentView = (TextView) findViewById(R.id.zero2);
            currentView.setText(String.valueOf(userTurnScrore));
            TextView turnView = (TextView) findViewById(R.id.turn);
            turnView.setText("player 2 turn");
        }
        else
        {
            a=0;
            TextView holdView = (TextView) findViewById(R.id.zero1);
            player2Score += userTurnScrore;
            holdView.setText(String.valueOf(player2Score));
            userTurnScrore = 0;
            TextView currentView = (TextView) findViewById(R.id.zero2);
            currentView.setText(String.valueOf(userTurnScrore));
            TextView turnView = (TextView) findViewById(R.id.turn);
            turnView.setText("player 1 turn");
        }


    }

    public void reset(View view) {
        userScrore=0;
        userTurnScrore=0;
        player2Score=0;
        TextView currentView =(TextView)findViewById(R.id.zero2);
        currentView.setText(String.valueOf(userTurnScrore));
        TextView currentView2 =(TextView)findViewById(R.id.zero1);
        currentView2.setText(String.valueOf(userTurnScrore));
        TextView currentView3 =(TextView)findViewById(R.id.zero);
        currentView3.setText(String.valueOf(userTurnScrore));





    }

}
