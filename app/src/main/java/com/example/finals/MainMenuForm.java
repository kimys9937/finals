package com.example.finals;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
public class MainMenuForm extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);


            // new 연산자로 리니어 레이아웃을 만들고, 방향 설정
            LinearLayout mainLayout = new LinearLayout(this);
            mainLayout.setOrientation(LinearLayout.VERTICAL);

            // new 연산자로 레이아웃 안에 추가될 뷰들에 설정할 파라미터 생성
            LinearLayout.LayoutParams params =
                    new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.WRAP_CONTENT
                    );



            ImageView ima = new ImageView((this));
            ima.setImageResource(R.drawable.h1); // 이미지 리소스
            ima.setMaxWidth(100);
            ima.setMaxHeight(100);
            ima.setId(R.id.image);
            setContentView(mainLayout);
        }
}
