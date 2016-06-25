package com.example.nimish.dice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int userScrore=0;
    private int userTurnScrore=0;
    private int compScrore=0;
    private int compTurnScrore=0;
    Random random=new Random();
    ImageView imageView;
    int a=0;
int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView userTv=(TextView)findViewById(R.id.zero);
        TextView compTv=(TextView)findViewById(R.id.zero1);
        //Button button=(Button)findViewById(R.id.roll);
        imageView=(ImageView)findViewById(R.id.dice);

    }

    public void roll(View view) {

        i =random.nextInt(6-1+1)+1;//(max-min+1)+1
        if(a==0) {
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
            compScrore+=userTurnScrore;
            TextView compView =(TextView)findViewById(R.id.zero1);
            compView.setText(String.valueOf(compScrore));

            if(compScrore>=20)
            {
                a=0;
                roll(view);
            }

        }



    }

    public void hold(View view) {
        a=1;
        TextView holdView =(TextView)findViewById(R.id.zero);
        userScrore+=userTurnScrore;
        holdView.setText(String.valueOf(userScrore));
        userTurnScrore=0;
        TextView currentView =(TextView)findViewById(R.id.zero2);
        currentView.setText(String.valueOf(userTurnScrore));

    while(i!=1)
    {   i =random.nextInt(6-1+1)+1;
        roll(view );
    }

    }

    public void reset(View view) {
    }
}
