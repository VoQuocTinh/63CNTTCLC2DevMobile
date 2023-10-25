package com.voquoctinh.a63135736_thigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void Chuyenbai1(View v){
            Intent iBai1 = new Intent(this, Bai1Activity.class);
            startActivity(iBai1);
        }
        public void Chuyenbai2(View v){
            Intent iBai2 = new Intent(this, Bai2Activity.class);
            startActivity(iBai2);
        }
        public void Chuyenbai3(View v){
            Intent iBai3 = new Intent(this, Bai3Activity.class);
            startActivity(iBai3);
        }
        public void Chuyenbai4(View v){
            Intent iBai4 = new Intent(this, Bai4Activity.class);
            startActivity(iBai4);
        }

    }
