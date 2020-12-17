package com.converty.lanuagelearner;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PhraseActivity extends AppCompatActivity {
  private  MediaPlayer media;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrase);
         final ArrayList<Phrase> phrasearray=new ArrayList<Phrase>();
        phrasearray.add(new Phrase("où allez-vous ?","Where are you going ? ",R.raw.whereareyougoing));
        phrasearray.add(new Phrase("quel est votre nom ?","What is your name ? ",R.raw.whatisyourname));
        phrasearray.add(new Phrase("mon nom est...","My name is... ",R.raw.mynameis));
        phrasearray.add(new Phrase("comment allez-vous ?","How are you feeling ? ",R.raw.howrufeeling));
        phrasearray.add(new Phrase("Je me sens bien","Iam feeling good ",R.raw.feelgood));
        phrasearray.add(new Phrase("viens-tu?","Are you comming ? ",R.raw.areyoucomming));
        phrasearray.add(new Phrase("Oui, je viens","Yes Iam Comming ",R.raw.yesiamcomming));
        Phrase_Adapter arrayp=new Phrase_Adapter(this,phrasearray);
        final ListView list3=(ListView) findViewById(R.id.list3);
        list3.setAdapter(arrayp);
        list3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               // Object j=list3.getItemAtPosition(i);
                Phrase o=phrasearray.get(i);
                media=MediaPlayer.create(PhraseActivity.this,o.getaudio());
                media.start();
                media.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        media.release();
                    }
                });

            }
        });

    }

}