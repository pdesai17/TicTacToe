package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class OnePlayerGame extends AppCompatActivity {
    private static final String TAG = "onePlayer";
    static int player = 0;
    static Integer[] img = new Integer[2];
    static String[] sign = new String[2];
    String arr[] = new String[9];
    String value;
    ImageView i0, i1, i2, i3, i4, i5, i6, i7, i8;
    int[] ImgName = {R.id.i0, R.id.i1, R.id.i2, R.id.i3, R.id.i4, R.id.i5, R.id.i6, R.id.i7, R.id.i8};
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_player_game);
        //Log.d(TAG, "onCreate:player= "+player);
        i0 = findViewById(R.id.i0);
        i1 = findViewById(R.id.i1);
        i2 = findViewById(R.id.i2);
        i3 = findViewById(R.id.i3);
        i4 = findViewById(R.id.i4);
        i5 = findViewById(R.id.i5);
        i6 = findViewById(R.id.i6);
        i7 = findViewById(R.id.i7);
        i8 = findViewById(R.id.i8);
        TextView tv = findViewById(R.id.tpTV);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(i);
        }
        dialog=new Dialog(this);
        Intent data = getIntent();
        String tag = data.getStringExtra("tag");
        if (tag.equals("imgX")) {
            // Log.d(TAG, "onCreate: " + tag + "img[o]=x");
            img[0] = R.drawable.x;
            img[1] = R.drawable.o;
            sign[0] = "x";
            sign[1] = "o";
        }
        if (tag.equals("imgO")) {
            //Log.d(TAG, "onCreate: " +"img[o]=O");
            img[0] = R.drawable.o;
            img[1] = R.drawable.x;
            sign[0] = "o";
            sign[1] = "x";
        }

        i0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("0");
                if (!(view.getTag().toString().equals("x") || view.getTag().toString().equals("o"))) {
                    Log.d(TAG, "onClick: 0" + player);

                    //Toast.makeText(OnePlayerGame.this, "player:0 ", Toast.LENGTH_SHORT).show();
                    if (player % 2 == 0) {
                        i0.setImageResource(img[0]);
                        view.setTag(sign[0]);
                    } else {
                        i0.setImageResource(img[1]);
                        view.setTag(sign[1]);
                    }
                    value = view.getTag().toString();
                    arr[0] = value;
                    Log.d(TAG, "onClick: " + arr[0]);
                    int result = checkWinner();
                    if (result == 1) {
                        player++;
                        randomImg(value);
                    }
                }

            }
        });
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("1");
                if (!(view.getTag().toString().equals("x") || view.getTag().toString().equals("o"))) {
                    Log.d(TAG, "onClick:1 " + player);

                    //Toast.makeText(OnePlayerGame.this, "player:1 ", Toast.LENGTH_SHORT).show();
                    if (player % 2 == 0) {
                        i1.setImageResource(img[0]);
                        view.setTag(sign[0]);
                    } else {
                        i1.setImageResource(img[1]);
                        view.setTag(sign[1]);
                    }
                    value = view.getTag().toString();
                    arr[1] = value;
                    int result = checkWinner();
                    if (result == 1) {
                        player++;
                        randomImg(value);
                    }
                }

            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("2");
                if (!(view.getTag().toString().equals("x") || view.getTag().toString().equals("o"))) {
                    Log.d(TAG, "onClick: 2" + player);

                    //Toast.makeText(OnePlayerGame.this, "player:2 ", Toast.LENGTH_SHORT).show();
                    if (player % 2 == 0) {
                        i2.setImageResource(img[0]);
                        view.setTag(sign[0]);
                    } else {
                        i2.setImageResource(img[1]);
                        view.setTag(sign[1]);
                    }
                    value = view.getTag().toString();
                    arr[2] = value;
                    int result = checkWinner();
                    if (result == 1) {
                        player++;
                        randomImg(value);
                    }
                }

            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("3");
                if (!(view.getTag().toString().equals("x") || view.getTag().toString().equals("o"))) {
                    Log.d(TAG, "onClick: 3");

                    //Toast.makeText(OnePlayerGame.this, "player:3 ", Toast.LENGTH_SHORT).show();
                    if (player % 2 == 0) {
                        i3.setImageResource(img[0]);
                        view.setTag(sign[0]);
                    } else {
                        i3.setImageResource(img[1]);
                        view.setTag(sign[1]);
                    }
                    value = view.getTag().toString();
                    Log.d(TAG, "onClick: value=" + value);
                    arr[3] = value;
                    int result = checkWinner();
                    if (result == 1) {
                        player++;
                        randomImg(value);
                    }
                }

            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("4");
                if (!(view.getTag().toString().equals("x") || view.getTag().toString().equals("o"))) {
                    Log.d(TAG, "onClick:4 " + player);

                    //Toast.makeText(OnePlayerGame.this, "player:4 ", Toast.LENGTH_SHORT).show();
                    if (player % 2 == 0) {
                        i4.setImageResource(img[0]);
                        view.setTag(sign[0]);
                    } else {
                        i4.setImageResource(img[1]);
                        view.setTag(sign[1]);
                    }
                    value = view.getTag().toString();
                    arr[4] = value;
                    int result = checkWinner();
                    if (result == 1) {
                        player++;
                        randomImg(value);
                    }
                }

            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("5");
                if (!(view.getTag().toString().equals("x") || view.getTag().toString().equals("o"))) {
                    Log.d(TAG, "onClick:5 " + player);

                    //Toast.makeText(OnePlayerGame.this, "player:5", Toast.LENGTH_SHORT).show();
                    if (player % 2 == 0) {
                        i5.setImageResource(img[0]);
                        view.setTag(sign[0]);
                    } else {
                        i5.setImageResource(img[1]);
                        view.setTag(sign[1]);
                    }
                    value = view.getTag().toString();
                    arr[5] = value;
                    int result = checkWinner();
                    if (result == 1) {
                        player++;
                        randomImg(value);
                    }
                }
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("6");
                if (!(view.getTag().toString().equals("x") || view.getTag().toString().equals("o"))) {
                    Log.d(TAG, "onClick: 6");

                    //Toast.makeText(OnePlayerGame.this, "player:6 ", Toast.LENGTH_SHORT).show();
                    if (player % 2 == 0) {
                        i6.setImageResource(img[0]);
                        view.setTag(sign[0]);
                    } else {
                        i6.setImageResource(img[1]);
                        view.setTag(sign[1]);
                    }
                    value = view.getTag().toString();
                    arr[6] = value;
                    int result = checkWinner();
                    if (result == 1) {
                        player++;
                        randomImg(value);
                    }

                }
            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("7");
                if (!(view.getTag().toString().equals("x") || view.getTag().toString().equals("o"))) {
                    Log.d(TAG, "onClick: 7" + player);

                    // Toast.makeText(OnePlayerGame.this, "player:7 ", Toast.LENGTH_SHORT).show();
                    if (player % 2 == 0) {
                        i7.setImageResource(img[0]);
                        view.setTag(sign[0]);
                    } else {
                        i7.setImageResource(img[1]);
                        view.setTag(sign[1]);
                    }
                    value = view.getTag().toString();
                    arr[7] = value;
                    int result = checkWinner();
                    if (result == 1) {
                        player++;
                        randomImg(value);
                    }
                }
            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(view.getTag().toString().equals("x") || view.getTag().toString().equals("o"))) {
                    Log.d(TAG, "player:8 ");
                    tv.setText("8");
                    // Toast.makeText(OnePlayerGame.this, "player:8 ", Toast.LENGTH_SHORT).show();
                    if (player % 2 == 0) {
                        i8.setImageResource(img[0]);
                        view.setTag(sign[0]);
                    } else {
                        i8.setImageResource(img[1]);
                        view.setTag(sign[1]);
                    }
                    value = view.getTag().toString();
                    arr[8] = value;
                    int result = checkWinner();
                    if (result == 1) {
                        player++;
                        randomImg(value);
                    }

                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        player = 0;
        i0.setImageResource(R.drawable.bg);
        i1.setImageResource(R.drawable.bg);
        i2.setImageResource(R.drawable.bg);
        i3.setImageResource(R.drawable.bg);
        i4.setImageResource(R.drawable.bg);
        i5.setImageResource(R.drawable.bg);
        i6.setImageResource(R.drawable.bg);
        i7.setImageResource(R.drawable.bg);
        i8.setImageResource(R.drawable.bg);
    }

    private void randomImg(String value) {
        if (player < 8) {
            int r = 0;
            Log.d(TAG, "randomImg:player " + player);
            while (r != -1) {
                // Log.d(TAG, "IN WHILE"+r);
                Random random = new Random();
                int index = random.nextInt(9);
                ImageView selectedImg = findViewById(ImgName[index]);
                Log.d(TAG, "randomImg index: " + index);
                Log.d(TAG, "randomImg value: " + value);
                if (!((selectedImg.getTag().toString().equals("x")) || (selectedImg.getTag().toString().equals("o")))) {
                    if (value == "x") {
                        Log.d(TAG, "randomImg: in if else" + value);
                        selectedImg.setImageResource(R.drawable.o);
                        selectedImg.setTag("o");
                        // Log.d(TAG, "randomImg: if"+ selectedImg.getTag().toString());
                    } else {
                        // Log.d(TAG, "randomImg: in if else"+value);
                        selectedImg.setImageResource(R.drawable.x);
                        selectedImg.setTag("x");
                    }
                    // Log.d(TAG, "randomImg:"+ selectedImg.getTag().toString());
                    // Log.d(TAG, "randomImg: checkwinner called");
                    value = selectedImg.getTag().toString();
                    arr[index] = value;
                    checkWinner();
                    player++;
                    Log.d(TAG, "randomImg: player= " + player);
                    r = -1;
                }

            }

        }

    }


    private void reset() {
        i0.setImageResource(R.drawable.bg);
        i1.setImageResource(R.drawable.bg);
        i2.setImageResource(R.drawable.bg);
        i3.setImageResource(R.drawable.bg);
        i4.setImageResource(R.drawable.bg);
        i5.setImageResource(R.drawable.bg);
        i6.setImageResource(R.drawable.bg);
        i7.setImageResource(R.drawable.bg);
        i8.setImageResource(R.drawable.bg);
        //i9.setImageResource(R.drawable.bg);
    }

    private int checkWinner() {
        int p = 0;
        if (arr[0].equals(arr[4]) && arr[4].equals(arr[8])) {
            if (player % 2 == 0) {
                dialog.setContentView(R.layout.you_win);
                Toast.makeText(this, "you win", Toast.LENGTH_SHORT).show();
            } else {
                dialog.setContentView(R.layout.you_lose);
                Toast.makeText(this, "player 2" + " wins", Toast.LENGTH_SHORT).show();

            }
            dialog.show();
            Log.d(TAG, "checkWinner: " + arr[0] + " " + arr[4] + " " + arr[8]);
            Log.d(TAG, "checkWinner: ");
            //reset();
        } else if (arr[2].equals(arr[4]) && arr[4].equals(arr[6])) {
            if (player % 2 == 0) {
                dialog.setContentView(R.layout.you_win);
                Toast.makeText(this, "player 1" + " wins", Toast.LENGTH_SHORT).show();

                //player=1;
            } else {
                dialog.setContentView(R.layout.you_lose);
                Toast.makeText(this, "player 2" + " wins", Toast.LENGTH_SHORT).show();

                // player=2;
            }
            dialog.show();
            //Toast.makeText(this, "player" +player+" wins", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "checkWinner: " + arr[2] + " " + arr[4] + " " + arr[6]);
            Log.d(TAG, "checkWinner: ");
            //reset();
        } else if (arr[0].equals(arr[1]) && arr[1].equals(arr[2])) {
            if (player % 2 == 0) {
                dialog.setContentView(R.layout.you_win);
                Toast.makeText(this, "player 1" + " wins", Toast.LENGTH_SHORT).show();

                //player=1;
            } else {
                dialog.setContentView(R.layout.you_lose);
                Toast.makeText(this, "player 2" + " wins", Toast.LENGTH_SHORT).show();

                // player=2;
            }
            dialog.show();
            //Toast.makeText(this, "player" +player+" wins", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "checkWinner: " + arr[0] + " " + arr[1] + " " + arr[2]);
            Log.d(TAG, "checkWinner: ");
            //reset();
        } else if (arr[3].equals(arr[4]) && arr[4].equals(arr[5])) {
            if (player % 2 == 0) {
                dialog.setContentView(R.layout.you_win);
                Toast.makeText(this, "player 1" + " wins", Toast.LENGTH_SHORT).show();

                //player=1;
            } else {
                dialog.setContentView(R.layout.you_lose);
                Toast.makeText(this, "player 2" + " wins", Toast.LENGTH_SHORT).show();

                // player=2;
            }
            dialog.show();
            //Toast.makeText(this, "player" +" wins", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "checkWinner: " + arr[3] + " " + arr[4] + " " + arr[5]);
            Log.d(TAG, "checkWinner: ");
            //reset();
        } else if (arr[6].equals(arr[7]) && arr[7].equals(arr[8])) {
            if (player % 2 == 0) {
                dialog.setContentView(R.layout.you_win);
                Toast.makeText(this, "player 1" + " wins", Toast.LENGTH_SHORT).show();

                //player=1;
            } else {
                dialog.setContentView(R.layout.you_lose);
                Toast.makeText(this, "player 2" + " wins", Toast.LENGTH_SHORT).show();

                // player=2;
            }
            dialog.show();
            //Toast.makeText(this, "player" +player+" wins", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "checkWinner: " + arr[6] + " " + arr[7] + " " + arr[8]);
            Log.d(TAG, "checkWinner: ");
            //reset();
        } else if (arr[0].equals(arr[3]) && arr[3].equals(arr[6])) {
            if (player % 2 == 0) {
                dialog.setContentView(R.layout.you_win);
                Toast.makeText(this, "player 1" + " wins", Toast.LENGTH_SHORT).show();

                //player=1;
            } else {
                dialog.setContentView(R.layout.you_lose);
                Toast.makeText(this, "player 2" + " wins", Toast.LENGTH_SHORT).show();

                // player=2;
            }
            dialog.show();
            //Toast.makeText(this, "player" +player+" wins", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "checkWinner: " + arr[0] + " " + arr[3] + " " + arr[6]);
            Log.d(TAG, "checkWinner: ");
            //reset();
        } else if (arr[1].equals(arr[4]) && arr[4].equals(arr[7])) {
            if (player % 2 == 0) {
                dialog.setContentView(R.layout.you_win);
                Toast.makeText(this, "player 1" + " wins", Toast.LENGTH_SHORT).show();

                //player=1;
            } else {
                dialog.setContentView(R.layout.you_lose);
                Toast.makeText(this, "player 2" + " wins", Toast.LENGTH_SHORT).show();

                // player=2;
            }
            dialog.show();
            //Toast.makeText(this, "player" +player+" wins", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "checkWinner: " + arr[1] + " " + arr[4] + " " + arr[7]);
            Log.d(TAG, "checkWinner: ");
            //reset();
        } else if (arr[2].equals(arr[5]) && arr[5].equals(arr[8])) {
            if (player % 2 == 0) {
                dialog.setContentView(R.layout.you_win);
                Toast.makeText(this, "player 1" + " wins", Toast.LENGTH_SHORT).show();

                //player=1;
            } else {
                dialog.setContentView(R.layout.you_lose);
                Toast.makeText(this, "player 2" + " wins", Toast.LENGTH_SHORT).show();

                // player=2;
            }
            dialog.show();
            //Toast.makeText(this, "player" +player+" wins", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "checkWinner: " + arr[2] + " " + arr[5] + " " + arr[8]);
            Log.d(TAG, "checkWinner: ");
            //reset();
        }
        else if (!(arr[0].equals("0") || arr[1].equals("1") || arr[2].equals("2") || arr[3].equals("3") || arr[4].equals("4")|| arr[5].equals("5")|| arr[6].equals("6")|| arr[7].equals("7")|| arr[8].equals("8")))
        {
            Toast.makeText(this, "No one wins", Toast.LENGTH_SHORT).show();
            dialog.setContentView(R.layout.no_win);
            dialog.show();
        }
        else {
            p = 1;
        }
        return p;

    }
}

 /* if(!((selectedImg.getTag().toString().equals("x")) || (selectedImg.getTag().toString().equals("o"))))
        {
            //Log.d(TAG, "randomImg:in if "+value);
            if(value=="x")
            {
                //Log.d(TAG, "randomImg: in if else"+value);
                selectedImg.setImageResource(R.drawable.o);
                selectedImg.setTag("o");
               // Log.d(TAG, "randomImg: if"+ selectedImg.getTag().toString());
            }
            else{
               // Log.d(TAG, "randomImg: in if else"+value);
                selectedImg.setImageResource(R.drawable.x);
                selectedImg.setTag("x");
            }
           // Log.d(TAG, "randomImg:"+ selectedImg.getTag().toString());
           // Log.d(TAG, "randomImg: checkwinner called");
            value=selectedImg.getTag().toString();
            arr[index]=value;
            checkWinner();
            player++;
            Log.d(TAG, "randomImg: player= "+player);

        }
        else
            {
                if(player <8) {
                    randomImg(value);
                    Log.d(TAG, "randomImg: recursion");
                }
                else{
                    reset();
                }
        }
        //player++;*/


/*switch (index) {
            case 0:
            if (!((selectedImg.getTag().toString().equals("x")) || (selectedImg.getTag().toString().equals("o"))))
            {
                if(value=="x")
                {
                    Log.d(TAG, "randomImg: in if else"+value);
                    selectedImg.setImageResource(R.drawable.o);
                    selectedImg.setTag("o");
                    Log.d(TAG, "randomImg: if"+ selectedImg.getTag().toString());
                }
                else {
                    Log.d(TAG, "randomImg: in if else"+value);
                    selectedImg.setImageResource(R.drawable.x);
                    selectedImg.setTag("x");
                }
                value=selectedImg.getTag().toString();
                arr[index]=value;
            }
            else {
                player++;
                randomImg(value);
            }
                player++;
                break;
            case 1:
            if (!((selectedImg.getTag().toString().equals("x")) || (selectedImg.getTag().toString().equals("o"))))
            {
                    if(value=="x")
                    {
                        Log.d(TAG, "randomImg: in if else"+value);
                        selectedImg.setImageResource(R.drawable.o);
                        selectedImg.setTag("o");
                        Log.d(TAG, "randomImg: if"+ selectedImg.getTag().toString());
                    }
                    else {
                        Log.d(TAG, "randomImg: in if else"+value);
                        selectedImg.setImageResource(R.drawable.x);
                        selectedImg.setTag("x");
                    }
                    value=selectedImg.getTag().toString();
                    arr[index]=value;

                }
            else {
                player++;
                randomImg(value);
            }
                player++;
                break;

            case 2:
                if (!((selectedImg.getTag().toString().equals("x")) || (selectedImg.getTag().toString().equals("o"))))
                {
                    if(value=="x")
                    {
                        Log.d(TAG, "randomImg: in if else"+value);
                        selectedImg.setImageResource(R.drawable.o);
                        selectedImg.setTag("o");
                        Log.d(TAG, "randomImg: if"+ selectedImg.getTag().toString());
                    }
                    else {
                        Log.d(TAG, "randomImg: in if else"+value);
                        selectedImg.setImageResource(R.drawable.x);
                        selectedImg.setTag("x");
                    }
                    value=selectedImg.getTag().toString();
                    arr[index]=value;
                }
                else {
                    player++;
                    randomImg(value);
                }
                player++;
                break;
            case 3:
                if (!((selectedImg.getTag().toString().equals("x")) || (selectedImg.getTag().toString().equals("o"))))
                {
                    if(value=="x")
                    {
                        Log.d(TAG, "randomImg: in if else"+value);
                        selectedImg.setImageResource(R.drawable.o);
                        selectedImg.setTag("o");
                        Log.d(TAG, "randomImg: if"+ selectedImg.getTag().toString());
                    }
                    else {
                        Log.d(TAG, "randomImg: in if else"+value);
                        selectedImg.setImageResource(R.drawable.x);
                        selectedImg.setTag("x");
                    }
                    value=selectedImg.getTag().toString();
                    arr[index]=value;
                }
                else {
                    player++;
                    randomImg(value);
                }
                player++;
                break;
            case 4:
                if (!((selectedImg.getTag().toString().equals("x")) || (selectedImg.getTag().toString().equals("o"))))
                {
                    if(value=="x")
                    {
                        Log.d(TAG, "randomImg: in if else"+value);
                        selectedImg.setImageResource(R.drawable.o);
                        selectedImg.setTag("o");
                        Log.d(TAG, "randomImg: if"+ selectedImg.getTag().toString());
                    }
                    else {
                        Log.d(TAG, "randomImg: in if else"+value);
                        selectedImg.setImageResource(R.drawable.x);
                        selectedImg.setTag("x");
                    }
                    value=selectedImg.getTag().toString();
                    arr[index]=value;
                }
                else {
                    player++;
                    randomImg(value);
                }
                player++;
                break;
            case 5:
                if (!((selectedImg.getTag().toString().equals("x")) || (selectedImg.getTag().toString().equals("o"))))
                {
                    if(value=="x")
                    {
                        Log.d(TAG, "randomImg: in if else"+value);
                        selectedImg.setImageResource(R.drawable.o);
                        selectedImg.setTag("o");
                        Log.d(TAG, "randomImg: if"+ selectedImg.getTag().toString());
                    }
                    else {
                        Log.d(TAG, "randomImg: in if else"+value);
                        selectedImg.setImageResource(R.drawable.x);
                        selectedImg.setTag("x");
                    }
                    value=selectedImg.getTag().toString();
                    arr[index]=value;
                }
                else {
                    player++;
                    randomImg(value);
                }
                player++;
                break;
            case 6:
                if (!((selectedImg.getTag().toString().equals("x")) || (selectedImg.getTag().toString().equals("o"))))
                {
                    if(value=="x")
                    {
                        Log.d(TAG, "randomImg: in if else"+value);
                        selectedImg.setImageResource(R.drawable.o);
                        selectedImg.setTag("o");
                        Log.d(TAG, "randomImg: if"+ selectedImg.getTag().toString());
                    }
                    else {
                        Log.d(TAG, "randomImg: in if else"+value);
                        selectedImg.setImageResource(R.drawable.x);
                        selectedImg.setTag("x");
                    }
                    value=selectedImg.getTag().toString();
                    arr[index]=value;
                }
                else {
                    player++;
                    randomImg(value);
                }
                player++;
                break;
            case 7:
                if (!((selectedImg.getTag().toString().equals("x")) || (selectedImg.getTag().toString().equals("o"))))
                {
                    if(value=="x")
                    {
                        Log.d(TAG, "randomImg: in if else"+value);
                        selectedImg.setImageResource(R.drawable.o);
                        selectedImg.setTag("o");
                        Log.d(TAG, "randomImg: if"+ selectedImg.getTag().toString());
                    }
                    else {
                        Log.d(TAG, "randomImg: in if else"+value);
                        selectedImg.setImageResource(R.drawable.x);
                        selectedImg.setTag("x");
                    }
                    value=selectedImg.getTag().toString();
                    arr[index]=value;
                }
                else {
                    player++;
                    randomImg(value);
                }
                player++;
                break;
            case 8:
                if (!((selectedImg.getTag().toString().equals("x")) || (selectedImg.getTag().toString().equals("o"))))
                {
                    if(value=="x")
                    {
                        Log.d(TAG, "randomImg: in if else"+value);
                        selectedImg.setImageResource(R.drawable.o);
                        selectedImg.setTag("o");
                        Log.d(TAG, "randomImg: if"+ selectedImg.getTag().toString());
                    }
                    else {
                        Log.d(TAG, "randomImg: in if else"+value);
                        selectedImg.setImageResource(R.drawable.x);
                        selectedImg.setTag("x");
                    }
                    value=selectedImg.getTag().toString();
                    arr[index]=value;
                }
                else {
                    player++;
                    randomImg(value);
                }
                player++;
                break*/

/* Random random = new Random();
        int index = random.nextInt(9);
        ImageView selectedImg = findViewById(ImgName[index]);
        Log.d(TAG, "randomImg index: " + index);
        Log.d(TAG, "randomImg value: " + value);
        if(!((selectedImg.getTag().toString().equals("x")) || (selectedImg.getTag().toString().equals("o"))))
        {
            //Log.d(TAG, "randomImg:in if "+value);
            if(value=="x")
            {
                //Log.d(TAG, "randomImg: in if else"+value);
                selectedImg.setImageResource(R.drawable.o);
                selectedImg.setTag("o");
                // Log.d(TAG, "randomImg: if"+ selectedImg.getTag().toString());
            }
            else{
                // Log.d(TAG, "randomImg: in if else"+value);
                selectedImg.setImageResource(R.drawable.x);
                selectedImg.setTag("x");
            }
            // Log.d(TAG, "randomImg:"+ selectedImg.getTag().toString());
            // Log.d(TAG, "randomImg: checkwinner called");
            value=selectedImg.getTag().toString();
            arr[index]=value;
            checkWinner();
            player++;
            Log.d(TAG, "randomImg: player= "+player);

        }
        else
        {
            if(player <8) {
                Toast.makeText(this, "player<8", Toast.LENGTH_SHORT).show();
                randomImg(value);
                Log.d(TAG, "randomImg: recursion");
            }
            else if(player==8){
                Toast.makeText(this, "Player =8", Toast.LENGTH_SHORT).show();
                reset();
            }
        }

*/