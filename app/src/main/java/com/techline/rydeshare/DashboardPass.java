package com.techline.rydeshare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class DashboardPass extends AppCompatActivity {
    //declare controls
    EditText eTxtFullName, eTxtEmail,eTxtPhone, eTxtPassword, eTxtFirstName, eTxtLastName;
    private Bundle extras;
    String strUser, strPass, strFullName, strEmail, strPhone, strFName,strLName,strBalance;

    TextView txtBalValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_pass);
        //assign ontrols
        eTxtFirstName = findViewById(R.id.eTxtFirstName);
        eTxtLastName = findViewById(R.id.eTxtLastName);
        eTxtEmail = findViewById(R.id.eTxtEmail);
        eTxtPassword = findViewById(R.id.eTxtPassword);
        eTxtPhone = findViewById(R.id.eTxtPhone);
        txtBalValue = findViewById(R.id.txtBalValue);



        extras = getIntent().getExtras();
        if (extras != null) {
            strUser = extras.getString("strUser");
            strPass = extras.getString("strPass");
            strFullName = extras.getString("strFullName");
            strFName = extras.getString("strFName");
            strLName = extras.getString("strLName");
            strEmail = extras.getString("strEmail");
            strPhone = extras.getString("strPhone");
            strBalance = extras.getString("strBalance");


            eTxtFirstName.setText(strFName);
            eTxtLastName.setText(strLName);
            eTxtEmail.setText(strEmail);
            eTxtPhone.setText(strPhone);
            eTxtPassword.setText(strPass);
            txtBalValue.setText(strBalance);


        } else {

        }


        //get values on click
        //onclick listeners
    }
}
