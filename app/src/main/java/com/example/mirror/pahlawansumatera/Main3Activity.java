package com.example.mirror.pahlawansumatera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    ImageView imgView;
    TextView txtView, txtView2;
    int linkGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        imgView = (ImageView) findViewById(R.id.tampilGambar);
        txtView = (TextView) findViewById(R.id.tv);
        txtView2 = (TextView) findViewById(R.id.judulnya);

        Intent intent = getIntent();
        txtView2.setText(intent.getStringExtra("judulnya"));
        linkGambar = intent.getIntExtra("gambar", linkGambar);
        imgView.setImageResource(linkGambar);
        txtView.setText(intent.getStringExtra("text"));
    }
}
