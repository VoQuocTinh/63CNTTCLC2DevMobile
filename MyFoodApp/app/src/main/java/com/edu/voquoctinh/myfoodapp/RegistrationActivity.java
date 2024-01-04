package com.edu.voquoctinh.myfoodapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistrationActivity extends AppCompatActivity {

    private EditText emailedit, passedit;
    private Button btnregis;
    private TextView login;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        mAuth = FirebaseAuth.getInstance();

        emailedit = findViewById(R.id.email);
        login = findViewById(R.id.login);
        passedit = findViewById(R.id.password);
        btnregis = findViewById(R.id.btnrgis);

        btnregis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

    }
    private void register(){
        String email, pass;
        email = emailedit.getText().toString();
        pass = passedit.getText().toString();
        if (TextUtils.isEmpty(email)){
            Toast.makeText(this, "Vui lòng nhập email!!,", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(pass)){
            Toast.makeText(this, "Vui lòng nhập password!!,", Toast.LENGTH_SHORT).show();
            return;
        }
        mAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(getApplicationContext(),"Tạo tài khoản thành công!",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(RegistrationActivity.this,LoginActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(),"Tạo tài khoản không thành công!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void login() {
        Intent i = new Intent(RegistrationActivity.this,LoginActivity.class);
        startActivity(i);
    }
}