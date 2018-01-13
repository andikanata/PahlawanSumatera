package com.example.mirror.pahlawansumatera;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] text;
    private final Integer[] imgicon;
    private final String[] descriptionItem;

    public Main2Activity(Activity context, String[] text, Integer[] imgicon, String[] descriptionItem) {
        super(context, R.layout.activity_main2, text);
        this.context = context;
        this.text = text;
        this.imgicon = imgicon;
        this.descriptionItem = descriptionItem;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.activity_main2, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.text);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView extratxt = (TextView) rowView.findViewById(R.id.text2);

        txtTitle.setText(text[position]);
        imageView.setImageResource(imgicon[position]);
        extratxt.setText(descriptionItem[position]);
        return rowView;

    }

}
