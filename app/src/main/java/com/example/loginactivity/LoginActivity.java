package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText mUsernameEt;
    private  EditText mPasswordEt;
    private Button mLoginBtn;

    private String correct_unameStr = "test";
    private String correct_upassStr = "test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        mUsernameEt = findViewById(R.id.nameEditText);
        mPasswordEt = findViewById(R.id.passwordEditText);
        mLoginBtn = findViewById(R.id.submitButton);
        //  mRcViewBtn = findViewById(R.id.btnRcView);
        mLoginBtn.setOnClickListener( v -> {
                //validate inputs
                if(TextUtils.isEmpty(mUsernameEt.getText().toString()) || TextUtils.isEmpty(mPasswordEt.getText().toString())){
                    Toast.makeText(LoginActivity.this, "Empty Data Provided", Toast.LENGTH_LONG).show();
                }else if (mUsernameEt.getText().toString().equals(correct_unameStr) && mPasswordEt.getText().toString().equals(correct_upassStr)){
                    //check passwor
                    Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(LoginActivity.this, "Invalid Username/Password", Toast.LENGTH_LONG).show();
                }
                //   Intent intent = new Intent(MainActivity.this, FruitActivity.class);


        });
    }
}