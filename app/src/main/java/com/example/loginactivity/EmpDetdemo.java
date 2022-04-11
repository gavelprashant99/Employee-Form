package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class EmpDetdemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emp_detdemo);

        String name = getIntent().getExtras().getString("name");
        String name2 = getIntent().getExtras().getString("design");
        String name3 = getIntent().getExtras().getString("email");
        String name4 = getIntent().getExtras().getString("gender");
        String name5 = getIntent().getExtras().getString("mono");
        String name6 = getIntent().getExtras().getString("address");

        TextView nameText = findViewById(R.id.textView2);
        nameText.setText(name);
        Intent intent = getIntent();
        TextView nameText1 = findViewById(R.id.textView3);
        nameText1.setText(name2);


        TextView nameText2 = findViewById(R.id.textView4);
        nameText2.setText(name3);

        TextView nameText3 = findViewById(R.id.textView5);
        nameText3.setText(name4);

        TextView nameText4 = findViewById(R.id.textView6);
        nameText4.setText(name5);

        TextView nameText5 = findViewById(R.id.textView7);
        nameText5.setText(name6);


        String name1 = intent.getStringExtra("name");

        Toast.makeText(this, "name :" + name1, Toast.LENGTH_SHORT).show();
    }
}