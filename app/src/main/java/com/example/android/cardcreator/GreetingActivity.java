package com.example.android.cardcreator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GreetingActivity extends AppCompatActivity {

    String sendr,receiver,heading,message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        sendr="From "+getIntent().getStringExtra("S1");
        TextView senderShow=(TextView)findViewById(R.id.sender_show);
        senderShow.setText(sendr);

        receiver="To "+ getIntent().getStringExtra("S2");
        TextView receiverShow=(TextView)findViewById(R.id.receiver_show);
        receiverShow.setText(receiver);

       heading=getIntent().getStringExtra("S3");
       TextView headingShow=(TextView)findViewById(R.id.heading_show);
       headingShow.setText(heading);

        message=getIntent().getStringExtra("S4");
        TextView messageShow=(TextView)findViewById(R.id.message_show);
        messageShow.setText(message);

    }

}