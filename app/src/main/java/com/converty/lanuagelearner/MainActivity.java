package com.converty.lanuagelearner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.t3);
        t2=(TextView)findViewById(R.id.t4);
        t3=(TextView)findViewById(R.id.t5);
        t4=(TextView)findViewById(R.id.t6);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Number Selected",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this,NumberActivity.class);
                startActivity(i);
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Family selected",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(i);
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Colours selected",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this,ColoursActivity.class);
                startActivity(i);
            }
        });

        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Phrases selected",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this,PhraseActivity.class);
                startActivity(i);
            }
        });
    }


}