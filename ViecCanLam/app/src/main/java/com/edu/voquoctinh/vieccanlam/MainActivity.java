package com.edu.voquoctinh.vieccanlam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.Firebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tạo kết nối đến CSDL
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = database.getReference("TASKS");
        //Lắng nghe và xử lý
        lstVCL = new ArrayList<TASKS>();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = database.getReference("TASKS");
        databaseReference.addValueEventListener(ngheFB);
    }
}