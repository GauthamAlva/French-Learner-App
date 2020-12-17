package com.converty.lanuagelearner;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColoursActivity extends AppCompatActivity {
private  MediaPlayer audio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colours);
        final ArrayList<Colour> colourarray=new ArrayList<Colour>();
       colourarray.add(new Colour("Rouge","Red",R.drawable.color_red,R.raw.red));
        colourarray.add(new Colour("Marron","Brown",R.drawable.color_brown,R.raw.brown));
        colourarray.add(new Colour("verte","Green",R.drawable.color_green,R.raw.green));
        colourarray.add(new Colour("Grise","Gray",R.drawable.color_gray,R.raw.dyelow));
        colourarray.add(new Colour("Jaune Poussiereux","Dusty yellow",R.drawable.color_dusty_yellow,R.raw.gray));
        colourarray.add(new Colour("Jauene Moutarde"," Mustard Yellow",R.drawable.color_mustard_yellow,R.raw.myelow));
        colourarray.add(new Colour("Noire","Black",R.drawable.color_black,R.raw.black));
        colourarray.add(new Colour("blanche","White",R.drawable.color_white,R.raw.white));
        ColourAdapter arraycolor=new ColourAdapter(this,colourarray);
        final ListView list1=(ListView) findViewById(R.id.list2);
        list1.setAdapter(arraycolor);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               // Object o=list1.getItemAtPosition(i);
                Colour c=colourarray.get(i);
                 audio=MediaPlayer.create(ColoursActivity.this,c.getaudio());
                audio.start();
                audio.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        audio.release();
                    }
                });
            }
        });

    }

}