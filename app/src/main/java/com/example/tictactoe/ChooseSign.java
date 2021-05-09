package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class ChooseSign extends AppCompatActivity {

    private static final String TAG ="choose sign" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_sign);
        Intent data=getIntent();
        String playerNO=data.getStringExtra("player");
        Log.d(TAG, "onCreate: player no= "+playerNO);
        //Log.d(TAG, "onCreate: "+playerNO);
        ImageView imgO=findViewById(R.id.imgO);
        ImageView imgX=findViewById(R.id.imgX);
        //String tagO= O.getTag().toString();
        // String tagX= X.getTag().toString();
        //String tagX=String.valueOf(X.getTag());

        imgO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String tagO=view.getTag().toString();
                //Log.d(TAG, "onClick: "+tagO);
                if(playerNO.equals("two"))
                {
                    Log.d(TAG, "onClick: player no = 2");
                    Intent toTwoPlayerGame = new Intent(ChooseSign.this, TwoPlayersGame.class);
                    toTwoPlayerGame.putExtra("tag", tagO);
                    startActivity(toTwoPlayerGame);
                    finish();
                }
                else
                {
                    Log.d(TAG, "onClick: player no = 1");
                    Intent toOnePlayerGame = new Intent(ChooseSign.this, OnePlayerGame.class);
                    toOnePlayerGame.putExtra("tag", tagO);
                    startActivity(toOnePlayerGame);
                    finish();
                }
            }
        });
        imgX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String tagX=view.getTag().toString();
                if(playerNO.equals("two"))
                {
                    Intent toTwoPlayerGame = new Intent(ChooseSign.this, TwoPlayersGame.class);
                    toTwoPlayerGame.putExtra("tag", tagX);
                    startActivity(toTwoPlayerGame);
                    finish();
                }
                else
                {
                    Intent toOnePlayerGame = new Intent(ChooseSign.this, OnePlayerGame.class);
                    toOnePlayerGame.putExtra("tag", tagX);
                    startActivity(toOnePlayerGame);
                    finish();
                }
            }
        });
    }
}