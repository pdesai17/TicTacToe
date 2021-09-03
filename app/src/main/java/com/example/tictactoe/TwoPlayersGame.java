package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TwoPlayersGame extends AppCompatActivity {
    private static final String TAG = "game";
    static int player = 0;
    static Integer[] img = new Integer[2];
    static String[] sign = new String[2];
    String arr[]=new String[9];
    String value;
    ImageView i0,i1,i2,i3,i4,i5,i6,i7,i8;
    ImageView[] imgs = {i0,i1,i2,i3,i4,i5,i6,i7,i8};
    Dialog myDialogue;
    CardView okBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Log.d(TAG, "onCreate: two player game");
        i0 = findViewById(R.id.i0);
        i1 = findViewById(R.id.i1);
        i2 = findViewById(R.id.i2);
        i3 = findViewById(R.id.i3);
        i4 = findViewById(R.id.i4);
        i5 = findViewById(R.id.i5);
        i6 = findViewById(R.id.i6);
        i7 = findViewById(R.id.i7);
        i8 = findViewById(R.id.i8);
        myDialogue=new Dialog(this);
        for (int i=0;i<arr.length;i++)
        {
            arr[i]= String.valueOf(i);
        }
        Intent data = getIntent();
        String tag = data.getStringExtra("tag");
        if (tag.equals("imgX")) {
            Log.d(TAG, "onCreate: " + tag + "img[o]=x");
            img[0] = R.drawable.x;
            img[1] = R.drawable.o;
            sign[0]="x";
            sign[1]="o";
        }
        if (tag.equals("imgO")) {
            Log.d(TAG, "onCreate: " +"img[o]=O");
            img[0] = R.drawable.o;
            img[1] = R.drawable.x;
            sign[0]="o";
            sign[1]="x";
        }
        i0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!(view.getTag().toString().equals("x") || view.getTag().toString().equals("o")))
                {
                    Log.d(TAG, "onClick:player= " + player);
                    if (player % 2 == 0) {
                        i0.setImageResource(img[0]);
                        view.setTag(sign[0]);
                    } else {
                        i0.setImageResource(img[1]);
                        view.setTag(sign[1]);
                    }
                    value=view.getTag().toString();
                    arr[0]=value;
                    Log.d(TAG, "onClick: "+arr[0]);
                    checkWinner(value);
                    player++;
                }
            }
        });
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(view.getTag().toString().equals("x") || view.getTag().toString().equals("o"))) {
                    Log.d(TAG, "onClick: " + player);
                    if (player % 2 == 0) {
                        i1.setImageResource(img[0]);
                        view.setTag(sign[0]);
                    } else {
                        i1.setImageResource(img[1]);
                        view.setTag(sign[1]);
                    }
                    value=view.getTag().toString();
                    arr[1]=value;
                    checkWinner(value);
                    player++;
                }
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(view.getTag().toString().equals("x") || view.getTag().toString().equals("o")))
                {
                    Log.d(TAG, "onClick: " + player);
                    if (player % 2 == 0) {
                        i2.setImageResource(img[0]);
                        view.setTag(sign[0]);
                    } else {
                        i2.setImageResource(img[1]);
                        view.setTag(sign[1]);
                    }
                    value=view.getTag().toString();
                    arr[2]=value;
                    checkWinner(value);
                    player++;
                }
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(view.getTag().toString().equals("x") || view.getTag().toString().equals("o"))) {
                    Log.d(TAG, "onClick: " + player);
                    if (player % 2 == 0) {
                        i3.setImageResource(img[0]);
                        view.setTag(sign[0]);
                    } else {
                        i3.setImageResource(img[1]);
                        view.setTag(sign[1]);
                    }
                    value=view.getTag().toString();
                    arr[3]=value;
                    checkWinner(value);
                    player++;
                }
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(view.getTag().toString().equals("x") || view.getTag().toString().equals("o"))) {
                    Log.d(TAG, "onClick: " + player);
                    if (player % 2 == 0) {
                        i4.setImageResource(img[0]);
                        view.setTag(sign[0]);
                    } else {
                        i4.setImageResource(img[1]);
                        view.setTag(sign[1]);
                    }
                    value=view.getTag().toString();
                    arr[4]=value;
                    checkWinner(value);
                    player++;
                }
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(view.getTag().toString().equals("x") || view.getTag().toString().equals("o"))) {
                    Log.d(TAG, "onClick: " + player);
                    if (player % 2 == 0) {
                        i5.setImageResource(img[0]);
                        view.setTag(sign[0]);
                    } else {
                        i5.setImageResource(img[1]);
                        view.setTag(sign[1]);
                    }
                    value=view.getTag().toString();
                    arr[5]=value;
                    checkWinner(value);
                    player++;
                }
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(view.getTag().toString().equals("x") || view.getTag().toString().equals("o"))) {
                    Log.d(TAG, "onClick: " + player);
                    if (player % 2 == 0) {
                        i6.setImageResource(img[0]);
                        view.setTag(sign[0]);
                    } else {
                        i6.setImageResource(img[1]);
                        view.setTag(sign[1]);
                    }
                    value=view.getTag().toString();
                    arr[6]=value;
                    checkWinner(value);
                    player++;
                }
            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(view.getTag().toString().equals("x") || view.getTag().toString().equals("o"))) {
                    Log.d(TAG, "onClick: " + player);
                    if (player % 2 == 0) {
                        i7.setImageResource(img[0]);
                        view.setTag(sign[0]);
                    } else {
                        i7.setImageResource(img[1]);
                        view.setTag(sign[1]);
                    }
                    value=view.getTag().toString();
                    arr[7]=value;
                    checkWinner(value);
                    player++;
                }
            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(view.getTag().toString().equals("x") || view.getTag().toString().equals("o"))) {
                    Log.d(TAG, "onClick: " + player);
                    if (player % 2 == 0) {
                        i8.setImageResource(img[0]);
                        view.setTag(sign[0]);
                    } else {
                        i8.setImageResource(img[1]);
                        view.setTag(sign[1]);
                    }
                    value=view.getTag().toString();
                    arr[8]=value;
                    checkWinner(value);
                    player++;
                }
            }
        });
    }
    private void reset()
    {
        for (int i=0;i<arr.length;i++)
        {
            arr[i]= String.valueOf(i);
        }
        player=0;
        /*for (int i = 0; i <imgs.length ; i++)
        {
            Log.d(TAG, "reset: "+imgs[i]);
            //imgs[i].setTag("a");
            imgs[i].setImageResource(R.drawable.bg);
        }*/
        i0.setImageResource(R.drawable.null_image);
        i0.setTag("a");

        i1.setImageResource(R.drawable.null_image);
        i1.setTag("a");

        i2.setImageResource(R.drawable.null_image);
        i2.setTag("a");

        i3.setImageResource(R.drawable.null_image);
        i3.setTag("a");

        i4.setImageResource(R.drawable.null_image);
        i4.setTag("a");

        i5.setImageResource(R.drawable.null_image);
        i5.setTag("a");

        i6.setImageResource(R.drawable.null_image);
        i6.setTag("a");

        i7.setImageResource(R.drawable.null_image);
        i7.setTag("a");

        i8.setImageResource(R.drawable.null_image);
        i8.setTag("a");
    }
    private void checkWinner(String value) {

        Log.d(TAG, "checkWinner: "+value );
        if(arr[0].equals(arr[4]) && arr[4].equals(arr[8]))
        {
            if(player%2==0)
            {
                player=1;
                myDialogue.setContentView(R.layout.player_one_win);
                okBtn=myDialogue.findViewById(R.id.OKBtn);
                okBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        myDialogue.dismiss();
                        reset();
                    }
                });
            }
            else{
                player=2;
                myDialogue.setContentView(R.layout.player_two_wins);
                okBtn=myDialogue.findViewById(R.id.OKBtn2);
                okBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        myDialogue.dismiss();
                        reset();
                    }
                });
            }

            myDialogue.show();
            Log.d(TAG, "checkWinner: "+arr[0]+" "+arr[4]+" "+arr[8]);
            Log.d(TAG, "checkWinner: ");
        }
        else if(arr[2].equals(arr[4]) && arr[4].equals(arr[6]))
        {
            if(player%2==0)
            {
                player=1;
                myDialogue.setContentView(R.layout.player_one_win);
                okBtn=myDialogue.findViewById(R.id.OKBtn);
                okBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        myDialogue.dismiss();
                        reset();
                    }
                });
            }
            else{
                player=2;
                myDialogue.setContentView(R.layout.player_two_wins);
                okBtn=myDialogue.findViewById(R.id.OKBtn2);
                okBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        myDialogue.dismiss();
                        reset();
                    }
                });
            }
            myDialogue.show();
            Log.d(TAG, "checkWinner: "+arr[2]+" "+arr[4]+" "+arr[6]);
            Log.d(TAG, "checkWinner: ");
        }
        else if(arr[0].equals(arr[1]) && arr[1].equals(arr[2]))
        {
            if(player%2==0)
            {
                player=1;
                myDialogue.setContentView(R.layout.player_one_win);
                okBtn=myDialogue.findViewById(R.id.OKBtn);
                okBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        myDialogue.dismiss();
                        reset();
                    }
                });
            }
            else{
                player=2;
                myDialogue.setContentView(R.layout.player_two_wins);
                okBtn=myDialogue.findViewById(R.id.OKBtn2);
                okBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        myDialogue.dismiss();
                        reset();
                    }
                });
            }

            myDialogue.show();
            Log.d(TAG, "checkWinner: "+arr[0]+" "+arr[1]+" "+arr[2]);
            Log.d(TAG, "checkWinner: ");
        }
        else if(arr[3].equals(arr[4]) && arr[4].equals(arr[5]))
        {
            if(player%2==0)
            {
                player=1;
                myDialogue.setContentView(R.layout.player_one_win);
                okBtn=myDialogue.findViewById(R.id.OKBtn);
                okBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        myDialogue.dismiss();
                        reset();
                    }
                });
            }
            else{
                player=2;
                myDialogue.setContentView(R.layout.player_two_wins);
                okBtn=myDialogue.findViewById(R.id.OKBtn2);
                okBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        myDialogue.dismiss();
                        reset();
                    }
                });
            }

            myDialogue.show();
            Log.d(TAG, "checkWinner: "+arr[3]+" "+arr[4]+" "+arr[5]);
            Log.d(TAG, "checkWinner: ");
        }
        else if(arr[6].equals(arr[7]) && arr[7].equals(arr[8]))
        {
            if(player%2==0)
            {
                player=1;
                myDialogue.setContentView(R.layout.player_one_win);
                okBtn=myDialogue.findViewById(R.id.OKbtn);
                okBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        myDialogue.dismiss();
                        reset();
                    }
                });
            }
            else{
                player=2;
                myDialogue.setContentView(R.layout.player_two_wins);
                okBtn=myDialogue.findViewById(R.id.OKBtn2);
                okBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        myDialogue.dismiss();
                        reset();
                    }
                });
            }

            myDialogue.show();
            Log.d(TAG, "checkWinner: "+arr[6]+" "+arr[7]+" "+arr[8]);
            Log.d(TAG, "checkWinner: ");
        }
        else if(arr[0].equals(arr[3]) && arr[3].equals(arr[6]))
        {
            if(player%2==0)
            {
                player=1;
                myDialogue.setContentView(R.layout.player_one_win);
                okBtn=myDialogue.findViewById(R.id.OKBtn);
                okBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        myDialogue.dismiss();
                        reset();
                    }
                });
            }
            else{
                player=2;
                myDialogue.setContentView(R.layout.player_two_wins);
                okBtn=myDialogue.findViewById(R.id.OKBtn2);
                okBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        myDialogue.dismiss();
                        reset();
                    }
                });
            }

            myDialogue.show();
            Log.d(TAG, "checkWinner: "+arr[0]+" "+arr[3]+" "+arr[6]);
            Log.d(TAG, "checkWinner: ");
        }
        else if(arr[1].equals(arr[4]) && arr[4].equals(arr[7]))
        {
            if(player%2==0)
            {
                player=1;
                myDialogue.setContentView(R.layout.player_one_win);
                okBtn=myDialogue.findViewById(R.id.OKbtn);
                okBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        myDialogue.dismiss();
                        reset();
                    }
                });
            }
            else{
                player=2;
                myDialogue.setContentView(R.layout.player_two_wins);
                okBtn=myDialogue.findViewById(R.id.OKBtn2);
                okBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        myDialogue.dismiss();
                        reset();
                    }
                });
            }

            myDialogue.show();
            Log.d(TAG, "checkWinner: "+arr[1]+" "+arr[4]+" "+arr[7]);
            Log.d(TAG, "checkWinner: ");
        }
        else if(arr[2].equals(arr[5]) && arr[5].equals(arr[8]))
        {
            if(player%2==0)
            {
                player=1;
                myDialogue.setContentView(R.layout.player_one_win);
                okBtn=myDialogue.findViewById(R.id.OKbtn);
                okBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        myDialogue.dismiss();
                        reset();
                    }
                });
            }
            else{
                player=2;
                myDialogue.setContentView(R.layout.player_two_wins);
                okBtn=myDialogue.findViewById(R.id.OKBtn2);
                okBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        myDialogue.dismiss();
                        reset();
                    }
                });
            }
            myDialogue.show();
            Log.d(TAG, "checkWinner: "+arr[2]+" "+arr[5]+" "+arr[8]);
            Log.d(TAG, "checkWinner: ");
        }
        else if (!(arr[0].equals("0") || arr[1].equals("1") || arr[2].equals("2") || arr[3].equals("3") || arr[4].equals("4")|| arr[5].equals("5")|| arr[6].equals("6")|| arr[7].equals("7")|| arr[8].equals("8")))
        {
            Toast.makeText(this, "No one wins", Toast.LENGTH_SHORT).show();
            myDialogue.setContentView(R.layout.no_win);
            myDialogue.show();
        }
    }
    protected void onDestroy()
    {
        super.onDestroy();
        player = 0;/*
        i0.setImageResource(R.drawable.bg);
        i1.setImageResource(R.drawable.bg);
        i2.setImageResource(R.drawable.bg);
        i3.setImageResource(R.drawable.bg);
        i4.setImageResource(R.drawable.bg);
        i5.setImageResource(R.drawable.bg);
        i6.setImageResource(R.drawable.bg);
        i7.setImageResource(R.drawable.bg);
        i8.setImageResource(R.drawable.bg);*/
    }
}