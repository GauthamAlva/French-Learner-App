package com.converty.lanuagelearner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {
    private MediaPlayer media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        final ArrayList<word> arrayList=new ArrayList<word>();

        arrayList.add(new word("One","Une",R.drawable.number_one,R.raw.one));
        arrayList.add(new word("Two","Deux",R.drawable.number_two,R.raw.two));
        arrayList.add(new word("Three","Trois",R.drawable.number_three,R.raw.three));
        arrayList.add(new word("Four","Quatre",R.drawable.number_four,R.raw.four));
        arrayList.add(new word("Five","Cinq",R.drawable.number_five,R.raw.five));
        arrayList.add(new word("Six","Six",R.drawable.number_six,R.raw.six));
        arrayList.add(new word("Seven","Sept",R.drawable.number_seven,R.raw.seven));
        arrayList.add(new word("Eight","Huit",R.drawable.number_eight,R.raw.eight));
        arrayList.add(new word("Nine","Neuve",R.drawable.number_nine,R.raw.nine));
        arrayList.add(new word("Ten","Dix",R.drawable.number_ten,R.raw.ten));

        wordAdapter adapter=new wordAdapter(this,arrayList);
        final ListView list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Object o=list.getItemAtPosition(i);
                word w = arrayList.get(i);
                media = MediaPlayer.create(NumberActivity.this, w.getaudio());
                media.start();

                media.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(final MediaPlayer mediaPlayer) {
                        media.release();
                    }
                });
            }
        });
    }

}