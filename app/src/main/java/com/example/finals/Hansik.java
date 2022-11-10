package com.example.finals;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Hansik extends AppCompatActivity {

    Button[] btn = new Button[2];
    Integer[] btnName = {R.id.kimchi_btn, R.id.bul_btn};
    //Integer[] picture = {R.drawable.kimchi, R.drawable.bul};
    ImageView image;
    int i;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hansik);

        image = (ImageView) findViewById(R.id.image);

        for(i = 0; i<btn.length; i++)
        {
            btn[i] = (Button) findViewById(btnName[i]);
        }

        for(i = 0; i<btn.length; i++) {
            final int index;
            index = i;


            btn[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //image.setImageResource(picture[i]);
                    Intent intent = new Intent(getApplicationContext(), Hansik_1.class);
                    startActivity(intent);
                    //intent : 앱 구성요소(컴포넌트) 간에 작업 수행을 위한 정보를 전달하는 역할
                }
            });
        }
    }
}