package com.example.finals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class Hansik_1 extends AppCompatActivity {

    ImageView kimchi_btn_ply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hansik_1);

        kimchi_btn_ply = (ImageView) findViewById(R.id.kimchi_btn_ply);

        kimchi_btn_ply.setOnClickListener(view -> {
            String url = "https://www.youtube.com/watch?v=S7qcu7iFvB4";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });
    }
}