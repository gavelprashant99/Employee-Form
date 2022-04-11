package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class EmpFormActivity extends AppCompatActivity
{
        private EditText mFnameEt, mLnameEt, mDesigEt, mDeptEt, mEmailEt, mNumberEt, mAddress;
        private RadioGroup mRadioG;
        private Button mBtn, mRcViewBtn;
        private TextView mTname, mTdesig, mTdept, mTemail, mTMobile, mTgender, mTaddress;
        String mGenderStr = "";
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_emp_form);
            mFnameEt = findViewById(R.id.fname);
            mLnameEt = findViewById(R.id.lname);
            mDesigEt = findViewById(R.id.desig);
            mDeptEt = findViewById(R.id.dept);
            mEmailEt = findViewById(R.id.email);
            mNumberEt = findViewById(R.id.mnumber);
            mAddress = findViewById(R.id.address);
            mBtn = findViewById(R.id.btnSubmit);
            mTname = findViewById(R.id.textViewName);
            mTdesig = findViewById(R.id.Design);
            mTdept = findViewById(R.id.tvdept);
            mTemail = findViewById(R.id.tvemail);
            mTMobile = findViewById(R.id.tvmobile);
            mTgender = findViewById(R.id.tvgender);
            mTaddress = findViewById(R.id.tvaddress);
            mRadioG = findViewById(R.id.RadioGr);
            mBtn.setOnClickListener( v -> {

                    String fname = mFnameEt.getText().toString();
                    String lname = mLnameEt.getText().toString();
                    String desig = mDesigEt.getText().toString();
                    String dept = mDeptEt.getText().toString();
                    String email = mEmailEt.getText().toString();
                    String mobile = mNumberEt.getText().toString();
                    String address = mAddress.getText().toString();
                    mTname.setText("First Name:\t" + fname + "  " + "Last Name:\t" + lname);
                    mTdesig.setText("Designation:\t" + desig);
                    mTdept.setText("Department:\t" + dept);
                    mTemail.setText("Email:\t" + email);
                    mTMobile.setText("Mobile:\t" + mobile);
                    mTgender.setText("Gender:\t" + mGenderStr);
                    mTaddress.setText("Address:\t" + address);


            });

            mRadioG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    RadioButton rb = findViewById(i);
                    if (i == R.id.Male) {
                        mGenderStr = rb.getText().toString();
                    } else if (i == R.id.Female) {
                        mGenderStr = rb.getText().toString();
                    }
                }
            });
        }

            /*  private void saveEmployee(Employee employee){

            class SaveEmp extends AsyncTask<Void, Void, Void>
            {
                @Override
                protected Void doInBackground(Void... voids) {
                    DatabaseClient.getmInstance(EmpFormActivity.this).getAppDatabase().userDAO().insertemp(employee);
                    return null;
                }

                @Override
                protected void onPostExecute(Void unused) {
                    super.onPostExecute(unused);
                }
            }
            SaveEmp saveEmp = new SaveEmp();
            saveEmp.execute();
            */

            //DatabaseClient.getmInstance(EmpFormActivity.this).getAppDatabase().userDAO().insertemp(employee);


}