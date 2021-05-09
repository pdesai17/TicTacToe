package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class ChoosePlayers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_players);
        FrameLayout onePlayer=findViewById(R.id.onePlayerFL);
        FrameLayout twoPlayers=findViewById(R.id.twoPlayersFL);

        onePlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toChooseSign=new Intent(ChoosePlayers.this,ChooseSign.class);
                toChooseSign.putExtra("player","one");
                startActivity(toChooseSign);
                finish();
            }
        });
        twoPlayers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toChooseSign=new Intent(ChoosePlayers.this,ChooseSign.class);
                toChooseSign.putExtra("player","two");
                startActivity(toChooseSign);
                finish();
            }
        });
    }
}