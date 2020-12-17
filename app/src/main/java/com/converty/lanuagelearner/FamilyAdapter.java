package com.converty.lanuagelearner;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class FamilyAdapter extends ArrayAdapter<Family> {
    public FamilyAdapter(Activity context, ArrayList<Family> familyArrayList) {

            // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
            // the second argument is used when the ArrayAdapter is populating a single TextView.
            // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
            // going to use this second argument, so it can be any value. Here, we used 0.
            super(context,0,familyArrayList);
        }
        @Nullable
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Check if the existing view is being reused, otherwise inflate the view
            View listItemView = convertView;
            if(listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.family_list, parent, false);
            }

            // Get the {@link AndroidFlavor} object located at this position in the list
           Family current = getItem(position);

            // Find the TextView in the list_item.xml layout with the ID version_name
            TextView kannadatextview = (TextView) listItemView.findViewById(R.id.kannadaid);
            // Get the version name from the current AndroidFlavor object and
            // set this text on the name TextView
            kannadatextview.setText(current.getkanada());

            // Find the TextView in the list_item.xml layout with the ID version_number
            TextView defaulttextview = (TextView) listItemView.findViewById(R.id.defaultid);
            // Get the version number from the current AndroidFlavor object and
            // set this text on the number TextView
            defaulttextview.setText(current.getdefault1());

            ImageView defaultimg=(ImageView) listItemView.findViewById(R.id.imgv1);
            defaultimg.setImageResource(current.getadress());

            // Return the whole list item layout (containing 2 TextViews and an ImageView)
            // so that it can be shown in the ListView
            return listItemView;
        }
}
