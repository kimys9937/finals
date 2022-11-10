package com.example.finals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class Hansik_1 extends AppCompatActivity {

    Integer[] picture = {R.drawable.kimchi, R.drawable.bul};
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hansik_1);

        image = (ImageView) findViewById(R.id.image);
        Hansik han = new Hansik();
        image.setImageResource(picture[0]);//선택한 버튼의 사진으로 바꾸기

        image.setOnClickListener(view -> {
            String url = "https://www.youtube.com/watch?v=S7qcu7iFvB4";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });
    }
}
