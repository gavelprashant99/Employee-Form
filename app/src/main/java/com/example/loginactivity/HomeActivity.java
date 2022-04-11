package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    private Button mEmpListBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mEmpListBtn = findViewById(R.id.btnElform);

        mEmpListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomeActivity.this, "Employee List", Toast.LENGTH_LONG).show();
                Intent empList = new Intent(HomeActivity.this, EmpListActivity.class);
                startActivity(empList);
            }
        });


    }

}