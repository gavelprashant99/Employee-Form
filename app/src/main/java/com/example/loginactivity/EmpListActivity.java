package com.example.loginactivity;

import static com.example.loginactivity.R.drawable.a;
import static com.example.loginactivity.R.drawable.d;
import static com.example.loginactivity.R.drawable.e;
import static com.example.loginactivity.R.drawable.kemika;
import static com.example.loginactivity.R.drawable.pgavel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class EmpListActivity extends AppCompatActivity {
    private final ArrayList<Employee>
            employee = new ArrayList<>();
    private RecyclerView mFruitsRv;
    private FloatingActionButton mAddFormFab;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emp_list);
        getSupportActionBar().setTitle("Employee List");
        RecyclerView mFruitsRv = findViewById(R.id.rl_fruits);
        mFruitsRv.setLayoutManager(new LinearLayoutManager(this));
        mAddFormFab = findViewById(R.id.fab);
       // StaggeredGridLayoutManager lm = new StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL);
       // mFruitsRv.setLayoutManager(lm);
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();
        Employee emp5 = new Employee();
        Employee emp6 = new Employee();
        Employee emp7 = new Employee();
        Employee emp8 = new Employee();

        emp1.setEmpId("1001");
        emp1.setEmpName("Prashant");
        emp1.setImgView(pgavel);
        emp1.setEmpDesig("Chief Engineer");
        emp1.setEmpEmail("prashantgavel99@gmail.com");
        emp1.setEmpGender("Male");
        emp1.setEmpMobile("7828422173");
        emp1.setEmpAddress("Raipur");

        emp2.setEmpId("1002");
        emp2.setEmpName("Kemika");
        emp2.setImgView(R.drawable.kemika);
        emp2.setEmpDesig("Assistant Engineer");
        emp2.setEmpEmail("kemi99@gmail.com");
        emp2.setEmpGender("Female");
        emp2.setEmpMobile("7828422173");
        emp2.setEmpAddress("Mahashamund");

        emp3.setEmpId("1003");
        emp3.setImgView(R.drawable.a);
        emp3.setEmpName("Nikita");
        emp3.setEmpDesig("Manager");
        emp3.setEmpEmail("niki99@gmail.com");
        emp3.setEmpGender("Male");
        emp3.setEmpMobile("7828422173");
        emp3.setEmpAddress("Bilaspur");


        emp4.setEmpId("1004");
        emp4.setEmpName("Tinkey");
        emp4.setImgView(R.drawable.shalini);
        emp4.setEmpDesig("Director");
        emp4.setEmpEmail("tinki99@gmail.com");
        emp4.setEmpGender("Female");
        emp4.setEmpMobile("7828422173");
        emp4.setEmpAddress("Mana Camp");

        emp5.setEmpId("1005");
        emp5.setEmpName("Shalini");
        emp5.setImgView(R.drawable.c);
        emp5.setEmpDesig("Deputy Director");
        emp5.setEmpEmail("shalini99@gmail.com");
        emp5.setEmpGender("Female");
        emp5.setEmpMobile("7828422173");
        emp5.setEmpAddress("Raipur");

        emp6.setEmpId("1006");
        emp6.setEmpName("Gulshan");
        emp6.setImgView(R.drawable.c);
        emp6.setEmpDesig("Deputy Manager");
        emp6.setEmpEmail("kemi99@gmail.com");
        emp6.setEmpGender("Female");
        emp6.setEmpMobile("7828422173");
        emp6.setEmpAddress("Raipur");

        emp7.setEmpId("1007");
        emp7.setEmpName("Shikha");
        emp2.setImgView(e);
        emp7.setEmpDesig("Project Manager");
        emp7.setEmpEmail("kemi99@gmail.com");
        emp7.setEmpGender("Female");
        emp7.setImgView(R.drawable.c);
        emp7.setEmpMobile("7828422173");
        emp7.setEmpAddress("Raipur");

        emp8.setEmpId("1008");
        emp8.setEmpName("Ram");
        emp8.setEmpDesig("Junior Engineer");
        emp8.setEmpEmail("kemi99@gmail.com");
        emp8.setImgView(R.drawable.c);
        emp8.setEmpGender("Male");
        emp8.setEmpMobile("7828422173");
        emp8.setEmpAddress("Raipur");

        employee.add(emp1);
        employee.add(emp2);
        employee.add(emp3);
        employee.add(emp4);
        employee.add(emp5);
        employee.add(emp6);
        employee.add(emp7);
        employee.add(emp8);



        mFruitsRv.setAdapter(new ProgrammingAdapter(this, employee));

        mAddFormFab.setOnClickListener( v -> {
            Toast.makeText(EmpListActivity.this, "Employee Registration", Toast.LENGTH_LONG).show();
            Intent empForm = new Intent(EmpListActivity.this, EmpFormActivity.class);
            startActivity(empForm);

        });

    }
}