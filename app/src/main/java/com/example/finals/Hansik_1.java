package com.example.finals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class Hansik_1 extends AppCompatActivity {

    Integer[] picture = {R.drawable.h1, R.drawable.h2, R.drawable.h3};
    String[] youtube = {"https://www.youtube.com/watch?v=S7qcu7iFvB4",//김치
            "https://www.youtube.com/watch?v=nVzwOOJLt24",//불고기
            "https://www.youtube.com/watch?v=eeiqjyYgPew"};//닭도리탕
    ImageView image;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hansik_1);

        image = (ImageView) findViewById(R.id.image);

        Intent intent = getIntent();//받기 전용 변수 만들기
        int ind = intent.getIntExtra("Index",0);//Hansik에서 index받는 역할

        image.setImageResource(picture[ind]);//선택한 버튼의 사진으로 바꾸기



        image.setOnClickListener(view -> {//유튜브 가기
            String url = youtube[ind];
            Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent1);
        });
    }
}