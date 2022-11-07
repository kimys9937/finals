package com.example.finals;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hansik extends AppCompatActivity {

    Button kimchi_btn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hansik);

        kimchi_btn = (Button) findViewById(R.id.kimchi_btn);

        kimchi_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Hansik_1.class);
                startActivity(intent);
                //intent : 앱 구성요소(컴포넌트) 간에 작업 수행을 위한 정보를 전달하는 역할
            }
        });
    }
}