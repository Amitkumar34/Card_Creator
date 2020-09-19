package com.example.android.cardcreator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    String data[] = new String[4];
    public void createCard(View view) {

        EditText sender= (EditText)findViewById(R.id.sender_editView);
        data[0]=sender.getText().toString();

        EditText rec= (EditText)findViewById(R.id.receiver);
        data[1]=rec.getText().toString();

        EditText subj= (EditText)findViewById(R.id.subject);
        data[2] =subj.getText().toString();

        EditText message= (EditText)findViewById(R.id.input);
        data[3]=message.getText().toString();

        Intent intent= new Intent(MainActivity.this,GreetingActivity.class);
        intent.putExtra("S1",data[0]);
        intent.putExtra("S2",data[1]);
        intent.putExtra("S3",data[2]);
        intent.putExtra("S4",data[3]);


        startActivity(intent);
    }
}