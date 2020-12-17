package com.converty.lanuagelearner;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
private  MediaPlayer media;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        final ArrayList<Family> familyarray=new ArrayList<Family>();
        familyarray.add(new Family("Pere","Father",R.drawable.family_father,R.raw.dad));
        familyarray.add(new Family("mere","Mother",R.drawable.family_mother,R.raw.mom));
        familyarray.add(new Family("fils","Son",R.drawable.family_son,R.raw.son));
        familyarray.add(new Family("fille","Daughter",R.drawable.family_daughter,R.raw.daug));
        familyarray.add(new Family("grand mere","Grandmother",R.drawable.family_grandmother,R.raw.grma));
        familyarray.add(new Family("grand pere","Grandfather",R.drawable.family_grandfather,R.raw.grfa));
        familyarray.add(new Family("oncle","Uncle",R.drawable.family_older_brother,R.raw.uncle));
        familyarray.add(new Family("taute","Aunt",R.drawable.family_older_sister,R.raw.aunt));
       FamilyAdapter array=new FamilyAdapter(this,familyarray);
        final ListView list1=(ListView) findViewById(R.id.list1);
       list1.setAdapter(array);
       list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            //  Object o=list1.getItemAtPosition(i);
              Family fam=familyarray.get(i);
               media=MediaPlayer.create(FamilyActivity.this,fam.getaudio());
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